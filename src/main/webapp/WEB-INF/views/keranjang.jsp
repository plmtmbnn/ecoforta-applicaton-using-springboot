
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>


		<div class="container">

				

			<div class="col-xs-12 col-sm-10 col-sm-8 col-sm-offset-4 col-md-offset-2" id="basket">

				<div class="box">

					<form method="post">

						<h1 class="text-center">Keranjang Belanja</h1>
						<p class="text-muted text-center"><i class="glyphicon glyphicon-info-sign"></i>Total belanja dalam keranjang anda :
							${total} item(s).</p>
						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th colspan="2">Produk</th>
										<th>Jumlah</th>
										<th>Per Unit</th>
										<th colspan="2">Total</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="order">
										<tr>
											<td><a href="#"> <img
													src="<c:url value='/images/${order.fotoProduk}'/> "
													alt="White Blouse Armani" width="50" height="50">
											</a></td>
											<td><a href="#">${order.namaProduk}</a></td>
											<td>${order.jumlah}</td>
											<td>Rp ${order.harga}</td>
											<td>Rp ${order.harga*order.jumlah}</td>
											<td><a href="<c:url value='/delete-${order.id}' />"
												class="glyphicon glyphicon-trash"></a><a
												href="<c:url value='/kurang-${order.id}' />"
												class="glyphicon glyphicon-minus"></a><a
												href="<c:url value='/tambah-${order.id}' />"
												class="glyphicon glyphicon-plus"></a></td>
										</tr>
									</c:forEach>
								</tbody>
								<tfoot>
									<tr>
										<th colspan="5">Total Belanja</th>
										<th colspan="2">Rp ${totalPembayaran}</th>
									</tr>
								</tfoot>
							</table>

						</div>
						<!-- /.table-responsive -->

						<div class="box-footer">
							<div class="pull-left">
								<a href="<c:url value='/allproduk' />" class="btn btn-default"><span
									class="glyphicon glyphicon-shopping-cart"></span> Lanjut
									Belanja</a>
							</div>
							<div class="pull-right">
								<a href="<c:url value='/checkout' />" class="btn btn-success"><span
									class="glyphicon glyphicon-ok"></span> Lanjut
									Checkout</a>
							</div>
						</div>

					</form>

				</div>

			</div>

		</div>


<jsp:include page="../views/fragments/footer.jsp"></jsp:include>