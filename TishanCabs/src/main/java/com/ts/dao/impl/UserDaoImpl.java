/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ts.dao.impl;

import com.ts.dao.AbstractDao;
import com.ts.dao.UserDao;
import com.ts.model.user;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.Type;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mas shalika
 */
@Repository("UserDao")

public class UserDaoImpl extends AbstractDao<Serializable, user> implements UserDao{
     @SuppressWarnings("unchecked")
     @Override
    public void adduser(user user1){
        persist(user1);
    }
   /*  @Override
     public String search(String email){
            Session session = this.sessionFactory.getCurrentSession();
   Query query = session.createQuery("select password from user where email = :email ");
query.setParameter("email", email);
String pass = query.toString();
   
    return pass;
                 
     }
    @Resource(name="sessionFactory")
       protected SessionFactory sessionFactory;

       public void setSessionFactory(SessionFactory sessionFactory) {
              this.sessionFactory = sessionFactory;
       }
      
       protected Session getSession(){
              return sessionFactory.openSession();
       }
*/
       public boolean checkLogin(String userName, String userPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from user as o where o.email=? and o.password=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,userName);
			query.setParameter(1,userPassword);
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
       }
       
       public String getRole(String userName){
           Session session = sessionFactory.openSession();
           String role;
			//Query using Hibernate Query Language
			String SQL_QUERY =" select role from user as o where o.email=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,userName);
	
			List list = query.list();

			role=list.get(0).toString();
                        
			session.close();
			return role;  
           
       }
}
