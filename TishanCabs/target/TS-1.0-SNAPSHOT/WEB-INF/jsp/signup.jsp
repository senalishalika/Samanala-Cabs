<%-- 
    Document   : signup
    Created on : 05-Apr-2017, 10:33:18
    Author     : mas shalika
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
       <head>
	<meta charset="utf-8">
	<meta name="viewport"    content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">
	
	<title>Tishan Cabs</title>

	<link rel="shortcut icon" href="ts_resources/images/gt_favicon.png">
	
	<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
	<link rel="stylesheet" href="ts_resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="ts_resources/css/font-awesome.min.css">

	<!-- Custom styles for our template -->
	<link rel="stylesheet" href="ts_resources/css/bootstrap-theme.css" media="screen" >
	<link rel="stylesheet" href="ts_resources/css/main.css">

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
	<script src="assets/js/html5shiv.js"></script>
	<script src="assets/js/respond.min.js"></script>
	<![endif]-->
</head>
   
   <body class="home">
	<!-- Fixed navbar -->
	<div class="navbar navbar-inverse navbar-fixed-top headroom" >
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
				<a class="navbar-brand" href="index.html">Tishan Cabs</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					
					<li><a href="about.html">About</a></li>
					
					<li><a href="contact.html">Contact</a></li>
					<li><a class="btn" href="signup">SIGN UP</a></li>
					<li><a class="btn" href="signin.html">LOG IN</a></li>

				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<!-- Header -->
      
	

	<!-- container -->
	<header id="head" class="secondary"></header>

	<!-- container -->
	<div class="container">

		<ol class="breadcrumb">
			<li><a href="index">Home</a></li>
			
		</ol>

		<div class="row">
			
			<!-- Article main content -->
			<article class="col-xs-12 maincontent">
				<header class="page-header">
					<h1 class="page-title">Registration</h1>
				</header>
				
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-default">
						<div class="panel-body">
							<h3 class="thin text-center">Register a new account</h3>
							<hr>


                                    <form:form  action="signup" method="POST" modelAttribute="user"> 
								<div class="top-margin">
									<label>First Name</label>
									<form:input type="text" name="fname" path="fname" class="form-control"/>
								</div>
								<div class="top-margin">
									<label>Last Name</label>
									<form:input type="text" name="lname" path="lname" class="form-control"/>
								</div>
                                                                <div class="top-margin">
									<label>Tel No</label>
									<form:input type="text" name="telno" path="telno" class="form-control"/>
								</div>
								<div class="top-margin">
									<label>Email Address <span class="text-danger">*</span></label>
									<form:input type="text" name="email" path="email" id="email" class="form-control"/>
								</div>

								<div class="row top-margin">
									<div class="col-sm-6">
										<label>Password <span class="text-danger">*</span></label>
										<form:input type="text" name="password" path="password" class="form-control"/>
									</div>
									<div class="col-sm-6">
										<label>Confirm Password <span class="text-danger">*</span></label>
										<form:input type="text" name="cnfirm" path="cnfirm" class="form-control"/>
									</div>
								</div>

								<hr>

								<div class="row">
									<div class="col-lg-8">
										                    
									</div>
									<div class="col-lg-4 text-right">
										<button class="btn btn-action" type="submit">Register</button>
									</div>
								</div>
							      </form:form>  
						</div>
					</div>

				</div>
				
			</article>
			<!-- /Article -->

		</div>
	</div>	<!-- /container -->
     
        
    </body>
</html>
