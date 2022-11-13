package com.jpa.pruebas;

import com.jpa.controlador.ControladorSucursal;
import com.jpa.entidad.Sucursal;

public class InsertSucursal {
	
	public static void main(String[] args) {
		ControladorSucursal controller = new ControladorSucursal();
		Sucursal bean = new Sucursal();
		bean.setNomSucursal("prueba1");
		//Invocar al metodo
		controller.save(bean);
	}
}
