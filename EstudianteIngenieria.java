package Tarea1;

public class EstudianteIngenieria extends Estudiante {

	int notaAdmisionIng;

	public EstudianteIngenieria(String nombre, int edad, int cedula, int telefono, String direccion,
			int numeroDeEstudiante, double promNotas, int notaAdmisionIng) {
		super(nombre, edad, cedula, telefono, direccion, numeroDeEstudiante, promNotas);
		this.notaAdmisionIng = notaAdmisionIng;
	}

	@Override
	public void VerDatos() {
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nCedula: " + cedula + "\nTelefono: " + telefono
				+ "\nDirección: " + direccion + "\nNumero de Estudiante: " + numeroDeEstudiante + "\nProm notas: "
				+ promNotas + "\nNota de admisión Ingenieria: " + notaAdmisionIng);

	}

}
