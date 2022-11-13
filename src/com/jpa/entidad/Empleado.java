package com.jpa.entidad;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_empleados database table.
 * 
 */
@Entity
@Table(name="tb_empleados")
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_emp")
	private int codEmp;

	@Column(name="ape_emp")
	private String apeEmp;

	@Column(name="dni_emp")
	private int dniEmp;

	@Column(name="nom_emp")
	private String nomEmp;

	@Column(name="sex_emp")
	private String sexEmp;

	//bi-directional many-to-one association to Sucursal
	@ManyToOne
	@JoinColumn(name="cod_sucursal")
	private Sucursal tbSucursale;

	public Empleado() {
	}

	public int getCodEmp() {
		return this.codEmp;
	}

	public void setCodEmp(int codEmp) {
		this.codEmp = codEmp;
	}

	public String getApeEmp() {
		return this.apeEmp;
	}

	public void setApeEmp(String apeEmp) {
		this.apeEmp = apeEmp;
	}

	public int getDniEmp() {
		return this.dniEmp;
	}

	public void setDniEmp(int dniEmp) {
		this.dniEmp = dniEmp;
	}

	public String getNomEmp() {
		return this.nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getSexEmp() {
		return this.sexEmp;
	}

	public void setSexEmp(String sexEmp) {
		this.sexEmp = sexEmp;
	}

	public Sucursal getTbSucursale() {
		return this.tbSucursale;
	}

	public void setTbSucursale(Sucursal tbSucursale) {
		this.tbSucursale = tbSucursale;
	}

}