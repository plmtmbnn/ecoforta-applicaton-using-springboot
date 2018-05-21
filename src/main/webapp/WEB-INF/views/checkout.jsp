<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>



<div class='container'>
	<div class='row' style='padding-top: 25px; padding-bottom: 25px;'>
		<div class='col-md-12'>
			<div id='mainContentWrapper'>
				<div class="col-md-8 col-md-offset-2">
					<h2 style="text-align: center;">Review Pesananan Anda &
						Melengkapi Checkout</h2>
					<hr />
					<a href="<c:url value='/allproduk' />" class="btn btn-info"
						style="width: 100%;">Tambah Produk Lain</a>
					<hr />
					<div class="shopping_cart">

						<div class="panel-group" id="accordion">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-parent="#accordion"
											href="#collapseOne">Review Pesananan Anda</a>
									</h4>
								</div>
								<div id="collapseOne" class="panel-collapse collapse in">
									<div class="panel-body">
										<div class="items">
											<div class="col-md-9">
												<table class="table table-striped">
													<tr>
														<td colspan="2"><b> Belanja Anda</b></td>
													</tr>
													<tr>
														<td>
															<ul>
																<c:forEach items="${list}" var="order">
																	<li>${order.namaProduk}[${order.jumlah} ]</li>
																</c:forEach>
															</ul>
														</td>

													</tr>
												</table>
											</div>
											<div class="col-md-3">
												<div style="text-align: center;">
													<h3>Order Total</h3>
													<h3>
														<span style="color: green;">Rp ${totalPembayaran}</span>
													</h3>
												</div>
											</div>
										</div>
									</div>
								</div>

							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<div style="text-align: center; width: 100%;">
										<a style="width: 100%;" data-toggle="collapse"
											data-parent="#accordion" href="#collapseTwo"
											class=" btn btn-success"
											onclick="$(this).fadeOut(); $('#payInfo').fadeIn();">
											Lanjut ke Informasi Pembayaran»</a>
									</div>
								</h4>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseTwo">Contact and Billing Information</a>
								</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse">
								<div class="panel-body">
									<b>Bantu kami untuk menjaga akun Anda tetap aman, mohon
										mengisi form dibawah ini.</b> <br /> <br />
									<form:form method="POST" class="form-horizontal">
										<table class="table table-striped" style="font-weight: bold;">
											<tr>
												<td style="width: 175px;"><label for="namaPenerima">Nama
														Penerima:</label></td>
												<td><input class="form-control" id="namaPenerima"
													name="namaPenerima" required="required" type="text" /></td>
											</tr>
											<tr>
												<td style="width: 175px;"><label for="rekeningBank">No.
														Rekening Bank:</label></td>
												<td><input class="form-control" id="rekeningBank"
													name="rekeningBank" required="required" type="text" /></td>
											</tr>

											<tr>
												<td style="width: 175px;"><label for="lokasi">Lokasi:</label></td>
												<td><select class="form-control" id="lokasi"
													name="lokasi">
														<option value="Balige">Balige</option>
														<option value="Laguboti">Laguboti</option>
														<option value="Porsea">Porsea</option>
														<option value="Tambunan">Tambunan</option>
														<option value="Parapat">Parapat</option>
														<option value="Tarutung">Tarutung</option>
														<option value="Siborong-borong">Siborong-borong</option>
												</select></td>
											</tr>
											<tr>
												<td style="width: 175px;"><label for="alamat">Alamat:</label></td>
												<td><textarea class="form-control" id="alamat"
														name="alamat"> </textarea></td>
											</tr>
											<tr>
												<td style="width: 175px;"><label for="keterangan">Keterangan:</label></td>
												<td><textarea class="form-control" id="keterangan"
														name="keterangan"> </textarea></td>
											</tr>


										</table>

										<input type="submit" value="Checkout"
											class="btn btn-lg btn-success btn-block" />

									</form:form>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>



<jsp:include page="../views/fragments/footer.jsp"></jsp:include>