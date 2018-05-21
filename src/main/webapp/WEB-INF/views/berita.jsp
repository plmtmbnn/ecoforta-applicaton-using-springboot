<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>



<div class="container-fluid">
			<div class="row">
				<div class="col-sm-12">
					<div class="page-header">
						<h3 class="text-center">Berita Seputar Pertanian dan Perkebunan</h3>
						
						
						
						
						
					</div>
				</div>
			</div>
</div>

<div class="container">
		
		<c:forEach items="${beritas}" var="berita">
		
			
				<div class="col-sm-4">
					<img class="img-responsive thumbnail" src="<c:url value='/images/${berita.foto}'/> " width="400" height="350" alt="">
					<div class="caption">
						<h4><a href="<c:url value='/bacaberita-${berita.id}' />">${berita.judul}</a></h4>
						
					</div>
				</div>
				
			
			<!-- /.row -->
</c:forEach>




</div>


<div class="container ">
			<div class="row">
				<div class="col-xs-12 col-sm-10 col-sm-8 col-sm-offset-4 col-md-offset-2" >
			
<c:choose>
											<c:when test="${user.role.equals('admin')}">
													<a href="<c:url value='/newberita' />"
										class="btn btn-md btn-primary btn-block"><i class="glyphicon glyphicon-plus left text-center"></i>Tambah Berita</a>							
											</c:when>
										</c:choose>
</div>
</div>
</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>