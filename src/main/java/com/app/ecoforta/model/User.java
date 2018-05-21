package com.app.ecoforta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="USER")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 
    @Size(min=3, max=255)
    @Column(name = "ROLE", nullable = false)
    private String role;

    @Size(min=3, max=255)
    @Column(name = "NAMA", nullable = false)
    private String nama;
 
    @Size(min=3, max=255)
    @Column(name = "JENIS_KELAMIN", nullable = false)
    private String jenisKelamin;

    @NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy") 
    @Column(name = "TANGGAL_LAHIR", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate tanggalLahir;
 

    @Size(min=3, max=255)
    @Column(name = "LOKASI", nullable = false)
    private String lokasi;

    @Size(min=3, max=255)
    @Column(name = "ALAMAT", nullable = false)
    private String alamat;

    @Size(min=3, max=255)
    @Column(name = "username", nullable = false)
    private String username;

    @Size(min=3, max=255)
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    
    @Size(min=3, max=255)
    @Column(name = "AVATAR", nullable = false)
    private String avatar;
    
    @Size(min=3, max=255)
    @Column(name = "EMAIL", nullable = false)
    private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public LocalDate getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(LocalDate tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    
}
