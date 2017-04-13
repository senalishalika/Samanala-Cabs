<%-- 
    Document   : addVehicle
    Created on : 13-Apr-2017, 06:59:09
    Author     : mas shalika
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!DOCTYPE html>
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
					
					
				<li class="active"><a href="#">Home</a></li>
					<li><a href="about.html">Requests</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Vehicle<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="addVehicle">Add Vehicle</a></li>
							<li><a href="sidebar-right.html">Available Vehicle</a></li>
                                                        <li><a href="sidebar-right.html">Change Vehicle</a></li>

						</ul>
					</li>
					<li><a href="adminSetting">Settings</a></li>
					<li><a class="btn" href="index">LOG OUT</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<!-- Header -->
      
	<header id="head" class="secondary"></header>

	<!-- container -->
	<div class="container">

		
<div class="row" style="height:500px">
	
		</div>
	</div>	<!-- /container -->

	<!-- 
		<!-- /container -->
    <div class="footer2">
			<div class="container">
				<div class="row">
					
					<div class="col-md-6 widget">
						<div class="widget-body">
							<p class="simplenav">
								<a href="#">Home</a> | 
								<a href="about.html">About</a> |
								<a href="sidebar-right.html">Sidebar</a> |
								<a href="contact.html">Contact</a> |
								<b><a href="signup.html">Sign up</a></b>
							</p>
						</div>
					</div>

					<div class="col-md-6 widget">
						<div class="widget-body">
							<p class="text-right">
								Copyright &copy; 2014, Your name. Designed by <a href="http://gettemplate.com/" rel="designer">gettemplate</a> 
							</p>
						</div>
					</div>

				</div> <!-- /row of widgets -->
			</div>
		</div>

	</footer>	
		




	<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="ts_resources/js/headroom.min.js"></script>
	<script src="ts_resources/js/jQuery.headroom.min.js"></script>
	<script src="ts_resources/js/template.js"></script>
        
</body>
</html>
