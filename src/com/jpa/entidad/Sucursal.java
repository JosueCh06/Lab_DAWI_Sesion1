package com.jpa.entidad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_sucursales database table.
 * 
 */
@Entity
@Table(name="tb_sucursales")
@NamedQuery(name="Sucursal.findAll", query="SELECT s FROM Sucursal s")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_sucursal")
	private int codSucursal;

	@Column(name="nom_sucursal")
	private String nomSucursal;

	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="tbSucursale")
	private List<Empleado> tbEmpleados;

	public Sucursal() {
	}

	public int getCodSucursal() {
		return this.codSucursal;
	}

	public void setCodSucursal(int codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getNomSucursal() {
		return this.nomSucursal;
	}

	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}

	public List<Empleado> getTbEmpleados() {
		return this.tbEmpleados;
	}

	public void setTbEmpleados(List<Empleado> tbEmpleados) {
		this.tbEmpleados = tbEmpleados;
	}

	public Empleado addTbEmpleado(Empleado tbEmpleado) {
		getTbEmpleados().add(tbEmpleado);
		tbEmpleado.setTbSucursale(this);

		return tbEmpleado;
	}

	public Empleado removeTbEmpleado(Empleado tbEmpleado) {
		getTbEmpleados().remove(tbEmpleado);
		tbEmpleado.setTbSucursale(null);

		return tbEmpleado;
	}

}