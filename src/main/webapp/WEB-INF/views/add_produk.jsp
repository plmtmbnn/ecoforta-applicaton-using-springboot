<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>


<div class="container">

	<div class="row" style="margin-top: 60px">
	
		<div
			class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
<h2 class="text-center">Tambah Produk</h2>

		<form:form method="POST" modelAttribute="produk"
			enctype="multipart/form-data">
			<form:input type="hidden" path="id" id="id" />

			<label for="namaProduk">Name Produk: </label>
			<div class="form-group">
				<form:input class="form-control" path="namaProduk" id="namaProduk" />
			</div>
			<label for="jumlah">Jumlah: </label>
			<div class="form-group">
				<form:input class="form-control" type="number" path="jumlah"
					id="jumlah" />
			</div>
			<label for="harga">Harga: </label>
			<div class="form-group">
				<form:input class="form-control" type="number" path="harga"
					id="harga" />
			</div>
			<label for="jenisProduk">Jenis Produk: </label>
			<div class="form-group">
				<form:select class="form-control" path="jenisProduk"
					items="${jenisProduks}" cssClass="selectpicker" />
			</div>
			<label for="tipePengiriman">Tipe Pengiriman: </label>
			<div class="form-group">
				<form:checkbox path="tipePengiriman" value="COD" />
				COD
				<form:checkbox path="tipePengiriman" value="Transfer" />
				Transfer
			</div>

			<label for="deskripsi">Deskripsi: </label>
			<div class="form-group">
				<form:textarea class="form-control" path="deskripsi" id="deskripsi" />
			</div>
			<div class="form-group">
				<label for="fotoProduk">Foto: </label>
			</div>
			<div class="form-group">
				<form:input class="form-control" type="file" path="fotoProduk"
					id="fotoProduk" />
			</div>
			<c:choose>
					<c:when test="${edit}">
						<input type="submit" value="Update" />
					</c:when>
					<c:otherwise>
						<input type="submit" value="Tambahkan" class="btn btn-lg btn-primary btn-block" />
					</c:otherwise>
				</c:choose>
		</form:form>
	</div>
</div>
</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>