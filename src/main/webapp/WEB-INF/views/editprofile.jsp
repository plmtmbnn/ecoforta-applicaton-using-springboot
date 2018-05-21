<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>





<!-- nav bar -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet">
<div class="container">
	<div class="row">
		<div class="col-sm-3">

			<ul class="nav nav-pills nav-stacked nav-email shadow mb-20">
				<li><a href="<c:url value='/profile' />"> <i
						class="glyphicon glyphicon-user"></i> ${user.nama}
				</a></li>
				<li class="active"><a href="<c:url value='/editprofile' />"><i
						class="glyphicon glyphicon-edit"></i> Edit Profile</a></li>
				<li><a href="<c:url value='/alltoko' />"><i
						class="fa fa-certificate"></i> Toko Saya <span
						class="label label-info pull-right inbox-notification">${total}</span></a>
				</li>
				<li><a href="<c:url value='/penjualan' />"><i
						class="glyphicon glyphicon-stats"></i> Penjualan <span
						class="label label-info pull-right inbox-notification">${totalOrderJual}</span></a>
				</li>
				<li><a href="<c:url value='/pembelian' />"><i
						class="glyphicon glyphicon-shopping-cart"></i> Pembelian <span
						class="label label-info pull-right inbox-notification">${totalOrderBeli}</span></a>
				</li>
			</ul>
			<!-- /.nav -->


		</div>
		<div class="col-sm-9">

			<!-- resumt -->
			<div class="panel panel-default">
				<div class="panel-heading resume-heading">
					<div class="row">
							<div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
								<form:form method="POST" modelAttribute="user"
									enctype="multipart/form-data">
									<form:input type="hidden" path="id" id="id" />
									<form:input type="hidden" path="role" id="role" />

									<div class="form-group">
										<form:input class="form-control" path="nama" id="nama"
											placeholder="Nama Lengkap" />
									</div>

									<div class="form-group">
										<form:input class="form-control" path="jenisKelamin"
											id="jenisKelamin" placeholder="Jenis Kelamin" />
									</div>

									<div class="form-group">
										<form:input class="form-control" path="tanggalLahir"
											id="tanggalLahir" placeholder="Tanggal Lahir" />
									</div>

									<div class="form-group">
										<form:input class="form-control" path="lokasi" id="lokasi"
											placeholder="Lokasi" />
									</div>

									<div class="form-group">
										<form:input class="form-control" path="alamat" id="alamat"
											placeholder="Alamat" />
									</div>

									<div class="form-group">
										<form:input class="form-control" path="username" id="username"
											placeholder="Username" />
									</div>

									<div class="form-group">
										<form:input class="form-control" path="password" id="password"
											placeholder="Password" />
									</div>

									<div class="form-group">
										<form:input class="form-control" path="email" id="email"
											placeholder="Email" />
									</div>



									

									<input type="submit" value="EDIT" class="btn btn-lg btn-primary btn-block"/>

								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


<jsp:include page="../views/fragments/footer.jsp"></jsp:include>