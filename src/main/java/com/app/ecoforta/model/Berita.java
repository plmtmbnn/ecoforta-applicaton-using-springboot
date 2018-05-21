package com.app.ecoforta.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
 
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
 
@Entity
@Table(name="BERITA")
public class Berita 
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 
	    @Column(name = "judul", nullable = false)
	    private String judul;
	    
	    @Column(name = "konten", nullable = false)
	    private String konten;
	    
	    @Column(name = "idAuthor")
	    private int idAuthor;
	    
	    @Column(name = "foto", nullable = false)
	    private String foto;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getJudul() {
			return judul;
		}

		public void setJudul(String judul) {
			this.judul = judul;
		}

		public String getKonten() {
			return konten;
		}

		public void setKonten(String konten) {
			this.konten = konten;
		}

		public int getIdAuthor() {
			return idAuthor;
		}

		public void setIdAuthor(int idAuthor) {
			this.idAuthor = idAuthor;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}
		
	    
	    
}
