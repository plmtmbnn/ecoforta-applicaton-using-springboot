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
				<li><a href="<c:url value='profile' />"><i
						class="glyphicon glyphicon-user"></i> ${user.nama}</a></li>
				<li><a href="<c:url value='/editprofile' />"><i
						class="glyphicon glyphicon-edit"></i> Edit Profile</a></li>
				<li class="active"><a href="#"><i class="fa fa-certificate"></i>
						Toko Saya <span
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
						<div class="col-lg-12">

							<div class="col-xs-12 col-sm-10 col-sm-8 col-sm-offset-4 col-md-offset-2">
								
									
								
								<div class="list-group">
	
									<c:forEach items="${tokos}" var="toko">
										<a class="list-group-item"
											href="<c:url value='/allproduk-${toko.id}' />"
											> ${toko.namaToko}</a>
									</c:forEach>
									
									<a href="<c:url value='/newtoko' />"
										class="btn btn-info btn-lg btn-block"><i class="glyphicon glyphicon-plus"></i>Tambah Toko</a>
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>