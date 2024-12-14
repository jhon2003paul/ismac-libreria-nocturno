package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import conjunto.distribuida.DAO.FacturaDAO;
import conjunto.distribuida.DAO.FacturaDetalleDAO;
import conjunto.distribuida.DAO.FacturaDetalleDAOImpl;
import conjunto.distribuida.entities.Factura;
import conjunto.distribuida.entities.FacturaDetalle;

public class FacturaDetalleDAOPrincipal {

	public static void main(String[] args) {

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl",FacturaDetalleDAO.class);
			List<FacturaDetalle> facturasDetalle= facturaDetalleDAO.findAll();
			for (FacturaDetalle item: facturasDetalle) {
				System.out.println(item.toString());
			}
			context.close();

		}
	}
