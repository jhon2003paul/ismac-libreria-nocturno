package conjunto.distribuida.DAO;

import java.util.List;

import conjunto.distribuida.entities.Libro;

public interface LibroDAO {

	public List <Libro> findAll();
	
	public Libro findOne(int id);
	
	public void add(Libro libro);
	
	public void up(Libro libro);
	
	public void del(int id);
}