package conjunto.distribuida.principal;

import conjunto.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente(1,"1730289631","John","Xavier","Tumbaco","0993535980","jxavier@gmail.com");
		Cliente cliente2 = new Cliente(2,"1745007836","Jonathan","Espinoza","Quito","0987844000","jnthan@gmail.com");
		
		System.out.println(cliente1.toString());
		
		
		//Cliente 2
		
		System.out.println(cliente2.toString());
	}

}