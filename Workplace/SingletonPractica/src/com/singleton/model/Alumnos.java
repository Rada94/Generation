package com.singleton.model;

public class Alumnos {
	private String idAlumno;
	private String nombreAlumno;
	
	private static Alumnos miUnicoAlumno;
	
	public static Alumnos getInstanceofAlumnos() {
		if(miUnicoAlumno==null) {
			miUnicoAlumno=new Alumnos();
		}
		else {
			throw new RuntimeException("Solo me instanceo una vez, ¡PERRA!");
		}
		return miUnicoAlumno;
	}
	
	private Alumnos() {
		
	}

	private Alumnos(String idAlumno, String nombreAlumno) {
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
	}

	public String getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	@Override
	public String toString() {
		return "Alumnos [idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + "]";
	}
	
	
}
