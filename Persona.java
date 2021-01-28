package Tarea1;

public abstract class Persona {

	String nombre;
	int edad;
	int cedula;
	int telefono;
	String direccion;

	public Persona(String nombre, int edad, int cedula, int telefono, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	abstract public void VerDatos();

}
