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
				<li><a href="<c:url value='/alltoko' />"><i
						class="fa fa-certificate"></i> Toko Saya <span
						class="label label-info pull-right inbox-notification">${total}</span></a>
				</li>
				<li class="active"><a href="<c:url value='/penjualan' />"><i
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
				<div class="container">
					<div class="panel-heading resume-heading">



						<div class="row col-md-6 col-md-offset-2 custyle">
							<table class="table table-striped custab">
								<thead>
									<tr>

										<th>Nama Produk</th>
										<th>Jumlah</th>
										<th>Harga</th>
										<th>Status</th>
										<th class="text-center">Action</th>
									</tr>
								</thead>
								<c:forEach items="${list}" var="order">
									<tr>
										<td>${order.namaProduk}</td>
										<td>${order.jumlah}</td>
										<td>${order.harga}</td>
										
										<c:choose>
											<c:when test="${order.status.equals('A')}">
													<td>
													<div class="alert alert-info" role="alert">
  <span class="glyphicon glyphicon-info" aria-hidden="true"></span>
  <span class="sr-only">Error:</span>
 Pembayaran telah diterima ECOFORTA
</div>
													</td>								
											</c:when>
											<c:when test="${order.status.equals('B')}">
													<td>
													
													<div class="alert alert-info" role="alert">
  <span class="glyphicon glyphicon-primary" aria-hidden="true"></span>
  <span class="sr-only">Error:</span>
 Pesanan sedang diproses
</div>
													</td>								
											</c:when>
											<c:when test="${order.status.equals('C')}">
													<td>
													<div class="alert alert-info" role="alert">
  <span class="glyphicon glyphicon-primary" aria-hidden="true"></span>
  <span class="sr-only">Error:</span>
 Pesanan dalam pengiriman
</div>
													
													</td>								
											</c:when>
											<c:when test="${order.status.equals('D')}">
													<td><div class="alert alert-success" role="alert">
  <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
  <span class="sr-only">Error:</span>
  Pesanan telah diterima
</div></td>								
											</c:when>
											<c:when test="${order.status.equals('E')}">
													<td>
													<div class="alert alert-danger" role="alert">
  <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
  <span class="sr-only">Error:</span>
  Pesanan dibatalkan penjual
</div></td>								
											</c:when>
											
										</c:choose>
										
										
										
										<c:choose>
											<c:when test="${order.status.equals('A')}">
													<td class="text-center"><a class='btn btn-info btn-xs'
													href="<c:url value='/prosespesanan-${order.id}' />"><span class="glyphicon glyphicon-ok">
													</span>
														Proses Pesanan </a>
														<br>
														
														<a class='btn btn-danger btn-xs'
													href="<c:url value='/batalpesanan-${order.id}' />"><span class="glyphicon glyphicon-remove">
													</span>
														Batalkan Pesanan </a>
														
														</td>							
											</c:when>
											<c:when test="${order.status.equals('B')}">
													<td class="text-center"><a class='btn btn-info btn-xs'
													href="<c:url value='/kirimpesanan-${order.id}' />"><span class="glyphicon glyphicon-ok">
													</span>
														Kirim Pesanan</a></td>							
											</c:when>
											
											
										</c:choose>
										
										
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>


				</div>
			</div>
			
		</div>
	</div>
</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>