package conjunto.distribuida.principal;

import java.util.Date;

import conjunto.distribuida.entities.Cliente;
import conjunto.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1,"1725649800","John","Xavier","Tumbaco","0993541200","johnxavier@correo.com");
		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setFecha(new Date());
		factura.setNumFactura("FAC-0001");
		factura.setTotalNeto(100.25);
		factura.setIva(15.25);
		factura.setTotal(116.25);
		
		// inyeccion de independencias
		factura.setCliente(cliente);
		
		System.out.println(factura.toString());
		
		
	}

}
