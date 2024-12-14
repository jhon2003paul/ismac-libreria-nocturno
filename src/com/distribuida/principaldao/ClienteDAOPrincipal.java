package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import conjunto.distribuida.DAO.ClienteDAO;
import conjunto.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		// INSERT
		Cliente cliente = new  Cliente(0,"1745963210","John","Xavier","Tumbaco","09987844640", "john1234@correo.com");
		clienteDAO.add(cliente);
		
		// UPDATE
		Cliente cliente2 = new  Cliente(7,"1745369810","Edison","Torres","San Roque","0954631200", "edisomsam@correo.com");
		clienteDAO.up(cliente2);
				

		//findOne
		try {
			Cliente cliente3 = clienteDAO.findOne(20);
			System.out.println(cliente3.toString());
		}catch(Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
		
		// DELETE
		clienteDAO.del(20);	
		
				
		
		//findAll
		List<Cliente> clientes = clienteDAO.findAll();
		
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		
		
		
		context.close();
	}
	}


