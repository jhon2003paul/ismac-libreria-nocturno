package conjunto.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private int idLibro; 
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "editorial")
	private String editorial;
	@Column(name = "num_paginas")
	private double numPaginas; 
	@Column(name = "edicion")
	private String edicion;
	@Column(name = "idioma")
	private String idioma;
	@Column(name = "fecha_publicacion")
	private Date fechaPublicacion;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "tipo_pasta")
	private String tipodePasta;
	@Column(name = "ISBN")
	private String iSBN;
	@Column(name = "num_ejemplares")
	private int numEjemplares;  
	@Column(name = "portada")
	private String portada;
	@Column(name = "presentacion")
	private String presentacion;
	@Column(name = "precio")
	private Double precio;
	
	@JoinColumn (name= "id_categoria")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private Categoria categoria;
	@JoinColumn (name= "id_autor")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private Autor autor; 
	
				
	
	
	


	public Libro() {}

	public Libro(int idLibro, String titulo, String editorial, double numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipodePasta, String iSBN, int numEjemplares,
			String portada, String presentacion, Double precio, Categoria categoria, Autor autor) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechaPublicacion = fechaPublicacion;
		this.descripcion = descripcion;
		this.tipodePasta = tipodePasta;
		this.iSBN = iSBN;
		this.numEjemplares = numEjemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		this.categoria = categoria;
		this.autor = autor;
	}


	public int getIdLibro() {
		return idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public double getNumPaginas() {
		return numPaginas;
	}

	public String getEdicion() {
		return edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipodePasta() {
		return tipodePasta;
	}

	public String getiSBN() {
		return iSBN;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public String getPortada() {
		return portada;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setNumPaginas(double numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setTipodePasta(String tipodePasta) {
		this.tipodePasta = tipodePasta;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numPaginas="
				+ numPaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechaPublicacion=" + fechaPublicacion
				+ ", descripcion=" + descripcion + ", tipodePasta=" + tipodePasta + ", iSBN=" + iSBN
				+ ", numEjemplares=" + numEjemplares + ", portada=" + portada + ", presentacion=" + presentacion
				+ ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
	}


	
	

}
