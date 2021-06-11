
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		int altura=0;
		int contador=0;
		int edad=0;
		int hombres=0;
		int mujeres=0;
		int promalthombre=0;
		int promaltmujer=0;
		int promedad=0;
		String sexo;
		int sumaalturam=0;
		int sumaedad=0;
		int sumalturah=0;
		int sumalturam=0;
		do {
			System.out.println("Datos de Persona "+(contador+1));
			System.out.println("Ingrese la altura:(cm)");
			altura =scanner.nextInt();
			if (altura>0) {
				System.out.println("Ingrese la edad:");
				edad =scanner.nextInt();
				System.out.println("Ingrese el sexo:(M/F)");
				sexo = scan.nextLine();
				sumaedad = sumaedad+edad;
				contador = contador+1;
				if (sexo.equals("M") || sexo.equals("m")) {
					sumalturah = sumalturah+altura;
					hombres = hombres+1;
				}
				if (sexo.equals("F") || sexo.equals("f")) {
					sumalturam = sumalturam+altura;
					mujeres = mujeres+1;
				}
			} else {
				System.out.println("Valor incorrecto");
			}
		} while (altura>=0);
		promalthombre = sumalturah/hombres;
		promaltmujer = sumalturam/mujeres;
		promedad = sumaedad/contador;
		System.out.println("Promedio de altura de mujeres: "+promaltmujer);
		System.out.println("Promedio de altura de hombres: "+promalthombre);
		System.out.println("Promedio de edades: "+promedad);
	}


}

