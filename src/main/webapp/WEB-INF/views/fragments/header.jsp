<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>ECOFORTA</title>


	<link href="<c:url value='/static/css/footer-basic-centered.css' />" rel="stylesheet" ></link>


	<link href="<c:url value='/static/css/header-user-dropdown.css' />" rel="stylesheet" ></link>
	<link href="<c:url value='/static/css/header-search.css' />" rel="stylesheet" ></link>
	<link href="<c:url value='/static/css/header-login-signup.css' />" rel="stylesheet" ></link>


	<link href="<c:url value='/static/css/pricing-table-horizontal.css' />" rel="stylesheet" ></link>


	<link href="<c:url value='/static/css/dialog-alert.css' />" rel="stylesheet" ></link>	
	<link href="<c:url value='/static/css/dialog-confirm.css' />" rel="stylesheet" ></link>
	
	<link href="<c:url value='/static/css/sidebar-left.css' />" rel="stylesheet" ></link>

	<link href="<c:url value='/static/css/form-labels-on-top.css' />" rel="stylesheet" ></link>

 	<link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet" type="text/css"></link>


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  
  
	<link href="<c:url value='/static/css/demo.css' />" rel="stylesheet"></link>

    <link href="<c:url value='/static/css/costum.css' />" rel="stylesheet"></link>
    
     <link href="<c:url value='/static/css/bootswatch.less' />" rel="stylesheet"></link>
    
     <link href="<c:url value='/static/css/variables.less' />" rel="stylesheet"></link>
    
    
    
</head>
<body>


 

 
 <nav class="navbar navbar-costum">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="<c:url value='/' />">Ecoforta</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      
        <li><a href="<c:url value='/beranda' />">Beranda</a></li>
        <li><a href="<c:url value='/berita' />">Berita</a></li>
        <li><a href="<c:url value='/allproduk' />">Belanja</a></li>
        <!-- <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li> -->
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Cari produk disini" path="keyword" id="keyword"/>
        </div>
        <button type="submit" class="btn btn-default">Cari</button>
      </form>
      
      <ul class="nav navbar-nav navbar-right">
      
      
              <li><a href="<c:url value='/keranjang' />" ><span class="glyphicon glyphicon-shopping-cart"></span> </a></li>
      
      <c:choose>
      <c:when test="${sesi.equals('no')}">
      <li><a href="<c:url value='/register' />">Daftar</a></li>
      <li><a href="<c:url value='/login' />">Login</a></li>
      </c:when>
      <c:otherwise>
      <li class="dropdown">
          <a href="<c:url value='/profile' />" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="glyphicon glyphicon-user"></i><span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="<c:url value='/profile' />">Profile</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="<c:url value='/logout' />">Logout</a></li>
          </ul>
        </li>
      </c:otherwise>
      </c:choose>
      
        
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>


<script src="<c:url value='/static/js/bootstrap.min.js' />"></script>