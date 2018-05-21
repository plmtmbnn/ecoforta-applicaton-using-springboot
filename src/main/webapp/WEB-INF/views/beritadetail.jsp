<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>


			<div class="container ">
			<div class="row">
				<div class="panel panel-default col-xs-12 col-sm-10 col-sm-8 col-sm-offset-4 col-md-offset-2" >
					<h1 class="text-center">${berita.judul}</h1>
					<!-- Image -->
					<figure class="margin-b-2">
						<img class="img-responsive center-block" src="<c:url value='/images/${berita.foto}'/> " width="600" height="350" alt="">
						
					</figure>

					<p>${berita.konten}</p>
					<hr>

</div>
</div>
</div>
<jsp:include page="../views/fragments/footer.jsp"></jsp:include>