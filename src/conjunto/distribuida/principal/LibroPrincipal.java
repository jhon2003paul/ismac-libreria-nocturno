package conjunto.distribuida.principal;

import java.util.Date;

import conjunto.distribuida.entities.Libro;
import conjunto.distribuida.entities.Categoria;
import conjunto.distribuida.entities.Autor;

public class LibroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categoria categoria = new Categoria();
		Autor autor=new Autor();
	
		
		Libro libro = new Libro(); 
		
		libro.setIdLibro(1);
		libro.setTitulo("Don quijote");
		libro.setEditorial("Montevideo");
		libro.setNumPaginas(13400);
		libro.setEdicion("ilimitada");
		libro.setIdioma("español");
		libro.setDescripcion("Fantasia"); 
		libro.setFechaPublicacion(new Date());
		libro.setTipodePasta("Doble");
		libro.setiSBN("12313");
		libro.setNumEjemplares(123555);
		libro.setPortada("Elegante");
		libro.setPresentacion("Fuerte");
		libro.setPrecio(130.20);
		
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		
		System.out.println(libro.toString());
		

		}
	}