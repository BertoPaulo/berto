
import java.util.Scanner;

public class Git {

	int[] vectorDeVentas = new int[12];
	private int año;

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Git(int año) {

		for (int i = 0; i < vectorDeVentas.length; i++) {
			vectorDeVentas[i] = ((int) (Math.random() * 1001));
		}
		this.año = año;
	}

	public int media() {
		int media, acumulador;
		acumulador = 0;
		for (int i = 0; i < vectorDeVentas.length; i++) {
			acumulador += vectorDeVentas[i];

		}
		media = acumulador / vectorDeVentas.length;
		return media;

	}

	public void grafica() {

		for (int i = 0; i < vectorDeVentas.length; i++) {
			System.out.print("Mes " + i + "(" + media() + ")");

			for (int j = vectorDeVentas[i]; j / 100 >= 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		int dato, resp;
		Git año;

		do {
			System.out.println("Por favor introduce el año:");
			dato = sc.nextInt();
			sc.nextLine();
			año = new Git(dato);

			año.grafica();
			System.out.println("Quieres repetir el programa?");
			System.out.println("1.-Si");
			System.out.println("2.-No");
			resp = sc.nextInt();
			sc.nextLine();
		} while (resp == 1);
		System.out.println("Adios!");
	}
}