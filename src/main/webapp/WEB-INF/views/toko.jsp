<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>




<div class="container">



	<div class="panel panel-default">
		
<div class="panel-heading">
			<a href="<c:url value='/newproduk-${idToko}' />"
				class="btn btn-default" ><i class="glyphicon glyphicon-plus left"></i>Tambah Produk</a>
		</div>
		<div class="panel-body">
		
			<div class="row">
			 
				<c:forEach items="${produks}" var="produk">
				
					<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<div class="card">
							<img 
								src="<c:url value='/images/${produk.fotoProduk}'/> " width="304" height="236" alt="Card image cap">
							
								<h4>${produk.namaProduk}</h4>
								<p>Rp. ${produk.harga}</p>
								<p>Jumlah : ${produk.jumlah}</p>
								
								<a href="<c:url value='/tambahjumlah-${produk.id}' />"
											class="btn btn-success"><i class="glyphicon glyphicon-plus"></i></a>
								<a href="<c:url value='/kurangjumlah-${produk.id}' />"
											class="btn btn-danger"><i class="glyphicon glyphicon-minus"></i></a>
							</div>
						</div>
					</div>
					
				</c:forEach>
			</div>
</div>
		</div>

	</div>





<jsp:include page="../views/fragments/footer.jsp"></jsp:include>