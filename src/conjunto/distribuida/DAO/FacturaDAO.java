package conjunto.distribuida.DAO;

import java.util.List;

import conjunto.distribuida.entities.Factura;

public interface FacturaDAO {

	public List<Factura> findAll();
	
	public Factura findOne(int id);
	
	public void add(Factura factura);
	
	public void up(Factura factura);
	
	public void delete(int factura);
	
}
