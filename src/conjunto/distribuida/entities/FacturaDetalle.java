package conjunto.distribuida.entities;

public class FacturaDetalle {
	private int FacturaDetalle;
	private String cantidad;
	private Double subtotal;
	
	private Factura factura;
	private Libro libro;
	
	
	public FacturaDetalle(int facturaDetalle, String cantidad, Double subtotal, Factura factura, Libro libro) {
		super();
		FacturaDetalle = facturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
		this.libro = libro;
	}


	public int getFacturaDetalle() {
		return FacturaDetalle;
	}


	public void setFacturaDetalle(int facturaDetalle) {
		FacturaDetalle = facturaDetalle;
	}


	public String getCantidad() {
		return cantidad;
	}


	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}


	public Double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	@Override
	public String toString() {
		return "FacturaDetalle [FacturaDetalle=" + FacturaDetalle + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	
	

}
