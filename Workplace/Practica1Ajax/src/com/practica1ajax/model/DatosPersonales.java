package com.practica1ajax.model;

public class DatosPersonales {
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String domicilio;
	private String correo;
	private String telefono;
	private String rfc;
	private double estatura;
	
	public DatosPersonales(){}
	
	
	public DatosPersonales(String nombre, String apellidoP, String apellidoM, String domicilio, String correo,
			String telefono, String rfc, double estatura) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.domicilio = domicilio;
		this.correo = correo;
		this.telefono = telefono;
		this.rfc = rfc;
		this.estatura = estatura;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	@Override
	public String toString() {
		return "DatosPersonales [nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM
				+ ", domicilio=" + domicilio + ", correo=" + correo + ", telefono=" + telefono + ", rfc=" + rfc
				+ ", estatura=" + estatura + "]";
	}


}
