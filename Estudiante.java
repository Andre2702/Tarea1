package Tarea1;

public class Estudiante extends Persona {

	int numeroDeEstudiante;
	double promNotas;

	public Estudiante(String nombre, int edad, int cedula, int telefono, String direccion, int numeroDeEstudiante,
			double promNotas) {
		super(nombre, edad, cedula, telefono, direccion);
		this.numeroDeEstudiante = numeroDeEstudiante;
		this.promNotas = promNotas;
	}

	@Override
	public void VerDatos() {
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nCedula: " + cedula + "\nTelefono: " + telefono
				+ "\nDirección: " + direccion + "\nNumero de Estudiante: " + numeroDeEstudiante + "\nProm notas: "
				+ promNotas);

	}

}
