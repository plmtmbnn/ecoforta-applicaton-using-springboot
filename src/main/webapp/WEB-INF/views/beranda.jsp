<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>



<div style="background:transparent !important" class="jumbotron">
<div class="container">

			<h2 >Selamat Datang Ke Ecoforta</h2>
	<h4>			Ecoforta - Situs Berita dan Jual Beli Online Tanaman</h4>
  <p>
Selamat datang! Setelah empat tahun berkecimpung di dunia tanaman online, kini hadir pasar Ecoforta, 
suatu sistem terintegrasi antara Penjual dan Pembeli yang praktis, aman dan fleksibel. 
Banyaknya penipuan berbelanja online di akun sosial media dan keamanan yang kurang terjamin serta minimnya kemampuan 
teknologi yang dimiliki petani alias Penjual adalah alasan kami untuk membuat pasar tanaman online. Dengan banyak tambahan 
fitur baru, transaksi jual beli akan semakin cepat dan nyaman. Semoga pasar Ecoforta dapat berguna bagi semua 
untuk memajukan dunia agribisnis. 

	</p>
		<p> Salam hangat, Ecorta</p>	
  <p><a class="btn btn-primary btn-lg" href="<c:url value='/allproduk' />" role="button">Belanja Yuk</a></p>
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



<jsp:include page="../views/fragments/footer.jsp"></jsp:include>