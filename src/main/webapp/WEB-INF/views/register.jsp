<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<jsp:include page="../views/fragments/header.jsp"></jsp:include>



<div class="container">

	<div class="row" style="margin-top: 60px">
	
		<div
			class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
<h2 class="text-center">Daftar Akun Baru</h2>
		<form:form method="POST" modelAttribute="user" enctype="multipart/form-data">
			
			<form:input type="hidden" path="id" id="id" />
			<form:input type="hidden" path="role" id="role" />

			<div class="form-group">
				<form:input class="form-control" path="nama" id="nama"
					placeholder="Nama Lengkap" />
			</div>

			<div class="form-group">
				<form:input class="form-control" path="jenisKelamin"
					id="jenisKelamin" placeholder="Jenis Kelamin" />
			</div>

			<div class="form-group">
				<input type="date" class="form-control" name="tanggalLahir"
					id="tanggalLahir" placeholder="Tanggal Lahir" />
			</div>

			<div class="form-group">
				<form:select class="form-control" id="lokasi" path="lokasi"
													name="lokasi">
														<option value="Balige">Balige</option>
														<option value="Laguboti">Laguboti</option>
														<option value="Porsea">Porsea</option>
														<option value="Tambunan">Tambunan</option>
														<option value="Parapat">Parapat</option>
														<option value="Tarutung">Tarutung</option>
														<option value="Siborong-borong">Siborong-borong</option>
												</form:select>
			</div>

			<div class="form-group">
				<form:input class="form-control" path="alamat" id="alamat"
					placeholder="Alamat" />
			</div>

			<div class="form-group">
				<form:input class="form-control" path="username" id="username"
					placeholder="Username" />
			</div>

			<div class="form-group">
				<form:input class="form-control" path="password" id="password"
					placeholder="Password" />
			</div>

			<div class="form-group">
				<form:input class="form-control" path="email" id="email"
					placeholder="Email" />
			</div>



			<div class="form-group">
				<form:input class="form-control" type="file" path="avatar"
					id="avatar" />
			</div>

			<input type="submit" value="Register" class="btn btn-lg btn-primary btn-block"/>

		</form:form>

	</div>
</div>
</div>
	
<jsp:include page="../views/fragments/footer.jsp"></jsp:include>