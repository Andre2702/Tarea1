package Tarea1;

public class Empleado extends Persona {

	int sueldo;

	public Empleado(String nombre, int edad, int cedula, int telefono, String direccion, int sueldo) {
		super(nombre, edad, cedula, telefono, direccion);
		this.sueldo = sueldo;

	}

	@Override
	public void VerDatos() {
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nCedula: " + cedula + "\nTelefono: " + telefono
				+ "\nDirección: " + direccion + "\nSueldo: " + sueldo);

	}

}
