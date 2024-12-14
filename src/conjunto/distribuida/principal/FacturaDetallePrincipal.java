package conjunto.distribuida.principal;


import java.util.Date;

import conjunto.distribuida.entities.Factura;
import conjunto.distribuida.entities.FacturaDetalle;
import conjunto.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura factura = new Factura(); 
		Libro libro = new Libro();
		
		FacturaDetalle facturaDetalle=new FacturaDetalle();
		facturaDetalle.setFacturaDetalle(207);
		facturaDetalle.setCantidad(5);
		facturaDetalle.setSubtotal(15.22);
		facturaDetalle.setLibro(libro);
		facturaDetalle.setFactura(factura);
		System.out.println(facturaDetalle.toString());
	
	}
 
}