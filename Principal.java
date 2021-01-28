package Tarea1;

import java.io.PrintStream;
import java.util.Scanner;

public class Principal {

	private static PrintStream output = new PrintStream(System.out);
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("André ", 18, 118680684, 86881055, "SantaAna ", 500000);
		Estudiante est1 = new Estudiante("Pablo ", 25, 205240783, 88162244, "Escazu ", 000703, 87);
		EstudianteIngenieria ing1 = new EstudianteIngenieria("Maria ", 22, 205120882, 86227294, "Piedades ", 000520, 92,
				98);

		int opcion = 0;

		do {
			output.print("\n");
			System.out.println("Que datos desea ver");
			System.out.println("1.Empleado");
			System.out.println("2.Estudiante");
			System.out.println("3.Estudiante de Ingenieria");
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				emp1.VerDatos();
				break;
			case 2:
				est1.VerDatos();
				break;
			case 3:
				ing1.VerDatos();
				break;
			}
		} while (opcion != 3);

	}
}
