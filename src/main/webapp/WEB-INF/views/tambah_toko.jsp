<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>



<div class="container">

	<div class="row" style="margin-top: 60px">
	
		<div
			class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
<h2 class="text-center">Tambah Toko Baru</h2>

<form:form method="POST" modelAttribute="toko"
	enctype="multipart/form-data" class="form-horizontal">
	<form:input type="hidden" path="id" id="id" />
	<form:input type="hidden" path="idSeller" id="idSeller" />
	
	<div class="form-group">
			<form:input path="namaToko" class="form-control" id="namaToko" placeholder="Nama Toko"/>
		</div>
		<div class="form-group">
		<form:input path="domainToko" class="form-control" id="domainToko" placeholder="Domain Toko"/>
			</div>
			<div class="form-group">
		<form:textarea path="alamat" class="form-control" id="alamat" />
		</div>
		<div class="form-group">
		<form:input type="tel" path="kontak" id="kontak" class="form-control" placeholder="Nomor Kontak" />
			</div>
			<div class="form-group">
		<form:input type="file" path="foto" id="foto" name="foto"
					class="form-control" />
					</div>
					<c:choose>
					<c:when test="${edit}">
						<input type="submit" value="Update" class="btn btn-primary btn-sm" />
					</c:when>
					<c:otherwise>
						<input type="submit" value="TAMBAH TOKO"
							 class="btn btn-lg btn-primary btn-block" />
					</c:otherwise>
				</c:choose>
		
</form:form>
</div>
</div>
</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>