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
      <form method="POST" class="navbar-form navbar-left">
        <div class="form-group">
        <input class="form-control" path="keyword" name="keyword"
											id="keyword" placeholder="Cari produk disini" />
											
        </div>
        <input type="submit" class="btn btn-default" value="Cari"/>
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

<div class="container">






	<div class="row">


		<div class="panel panel-default col-sm-2">
			<h4 class="text-center">Filter</h4>
			<ul class="nav nav-pills nav-stacked nav-email shadow mb-20">
				<li >
					<div class="dropdown ">
						<button class="btn btn-success dropdown-toggle" type="button"
							id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="true">
							 Jenis Produk <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="<c:url value='/allproduk' />">Semua</a></li>
							<li><a href="<c:url value='/allproduk-Bibit' />">Bibit</a></li>
							<li><a href="<c:url value='/allproduk-Pupuk' />">Pupuk</a></li>
						</ul>
					</div>
				</li>
				
				
				<li>
					<div class="dropdown">
						<button class="btn btn-success dropdown-toggle" type="button"
							id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="true">
							 Jenis Pengiriman <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li><a href="<c:url value='/allproduk-tipe1' />">COD</a></li>
							<li><a href="<c:url value='/allproduk-tipe2' />">Transfer</a></li>
							<li><a href="<c:url value='/allproduk-tipe3' />">COD dan Transfer</a></li>
						</ul>
					</div>
				</li>
				
				<li><a href="<c:url value='/termahal' />"><i
						class="glyphicon glyphicon-triangle-top"></i> Termahal </a>
				</li>
								<li><a href="<c:url value='/termurah' />"><i
						class="glyphicon glyphicon-triangle-bottom"></i> Termurah </a>
				</li>
				
			</ul>
			<!-- /.nav -->


		</div>

		<div class="panel panel-default col-sm-10 ">

			<c:forEach items="${produks}" var="produk">

				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<div class="card">
							<img src="<c:url value='/images/${produk.fotoProduk}'/> "
								width="270" height="250" alt="Card image cap">

							<h4>${produk.namaProduk}</h4>
							<H4  class="text-success">Rp. ${produk.harga}</H4>
							<p class="bg-primary">Jumlah : ${produk.jumlah}</p>

							<c:choose>
								<c:when test="${produk.tipePengiriman.equals('tipe1')}">
									<p class="bg-success">COD</p>
								</c:when>
								<c:when test="${produk.tipePengiriman.equals('tipe2')}">
									<p class="bg-success">Transfer Bank</p>
									<c:choose>
										<c:when test="${produk.jumlah=='0'}">
											<a href="<c:url value='/beli-${produk.id}' />"
												class="btn btn-danger disabled"><i
												class="glyphicon glyphicon-info-sign"></i> Stock Habis</a>
										</c:when>
										<c:otherwise>
											<a href="<c:url value='/beli-${produk.id}' />"
												class="btn btn-success"><i
												class="glyphicon glyphicon-shopping-cart"></i> Beli</a>
										</c:otherwise>
									</c:choose>

								</c:when>
								<c:otherwise>
									<p class="bg-success">COD & Transfer Bank</p>
									<c:choose>
										<c:when test="${produk.jumlah=='0'}">
											<a href="<c:url value='/beli-${produk.id}' />"
												class="btn btn-danger disabled"><i
												class="glyphicon glyphicon-info-sign"></i> Stock Habis</a>
										</c:when>
										<c:otherwise>
											<a href="<c:url value='/beli-${produk.id}' />"
												class="btn btn-success"><i
												class="glyphicon glyphicon-shopping-cart"></i> Beli</a>
										</c:otherwise>
									</c:choose>
								</c:otherwise>
							</c:choose>
							<a href="#" class="btn btn-info " data-toggle="modal"
								data-target="#myModal">Lihat</a>
						</div>
					</div>
				</div>

			</c:forEach>
		</div>







	</div>



	<!-- <div class="row">
			
			<select onChange="window.location.href=this.value">
    <option value="www.google.com">A</option>
    <option value="www.aol.com">B</option>
</select>
			</div> -->
</div>






<!-- Modal -->
<c:forEach items="${produks}" var="produk">
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Keranjang Beli</h4>
				</div>
				<div class="modal-body">
					<div class="card">
						<img class="card-img-top"
							src="<c:url value='/images/${produk.fotoProduk}'/> " width="265"
							height="236" alt="Card image cap">
						<div class="card-block">
							<h4 class="card-title">${produk.namaProduk}</h4>
							<p class="card-text">Rp. ${produk.harga}</p>

							<c:choose>
								<c:when test="${produk.tipePengiriman.equals('tipe1')}">
									<p class="card-text">COD</p>
								</c:when>
								<c:when test="${produk.tipePengiriman.equals('tipe2')}">
									<p class="card-text">Transfer Bank</p>
								</c:when>
								<c:otherwise>
									<p class="card-text">COD & Transfer Bank</p>
								</c:otherwise>
							</c:choose>

							<p class="card-text">Deskripsi : ${produk.deskripsi}</p>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</c:forEach>


<jsp:include page="../views/fragments/footer.jsp"></jsp:include>