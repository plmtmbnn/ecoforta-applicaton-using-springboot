<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>





<div class="container">

	<div class="row" style="margin-top: 60px">
	
		<div
			class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
<h2 class="text-center">Tambah Berita</h2>

		<form:form method="POST" modelAttribute="berita"
			enctype="multipart/form-data">
			<form:input type="hidden" path="id" id="id" />

			<label for="judul">Judul: </label>
			<div class="form-group">
				<form:input class="form-control" path="judul" id="judul" />
			</div>
			

			<label for="konten">Deskripsi: </label>
			<div class="form-group">
				<form:textarea class="form-control" path="konten" id="konten" />
			</div>
			<div class="form-group">
				<label for="foto">Foto: </label>
			</div>
			<div class="form-group">
				<form:input class="form-control" type="file" path="foto"
					id="foto" />
			</div>
			<td colspan="3"><c:choose>
					<c:when test="${edit}">
						<input type="submit" value="Update" />
					</c:when>
					<c:otherwise>
						<input type="submit" value="Publish" class="btn btn-lg btn-primary btn-block"/>
					</c:otherwise>
				</c:choose>
		</form:form>
		
	</div>
</div>
</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>