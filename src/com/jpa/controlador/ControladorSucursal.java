package com.jpa.controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.entidad.Sucursal;

public class ControladorSucursal {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lab_DAWI_Sesion1");
	
	//Metodos
	public void save(Sucursal bean) {
		EntityManager manager = factory.createEntityManager();
		try {
			//Iniciar transacci�n
			manager.getTransaction().begin();
			//Insert into
			manager.persist(bean);
			//Confirmar transacci�n
			manager.getTransaction().commit();
		} catch (Exception e) {
			//Anular transacci�n
			manager.getTransaction().rollback();
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
	}
}
