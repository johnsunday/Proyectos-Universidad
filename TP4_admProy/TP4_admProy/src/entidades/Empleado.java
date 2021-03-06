package entidades;

public class Empleado {


	private int legajo;
	private int sueldoHora;
	private String nombreCompleto;

	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getSueldoHora() {
		return sueldoHora;
	}
	public void setSueldoHora(int sueldoHora) {
		this.sueldoHora = sueldoHora;
	}
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", nombreCompleto=" + nombreCompleto + ", sueldoHora=" + sueldoHora + "]";
	}

	public Empleado(int legajo, int sueldoHora, String nombreCompleto) {
		this.legajo = legajo;
		this.sueldoHora = sueldoHora;
		this.nombreCompleto = nombreCompleto;
	}
	public Empleado(int sueldoHora, String nombreCompleto) {
		
		this.sueldoHora = sueldoHora;
		this.nombreCompleto = nombreCompleto;
	}
	public Empleado() {
	
	}
	public Empleado(int legajo) {
		this.legajo=legajo;
	}

	
	}

