import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double m, b, a;

		System.out.print("Digite a base: ");
		b = in.nextDouble();
		System.out.print("Digite a altura: ");
		a = in.nextDouble();

		m = b * a;

		System.out.println("----------------------------------");
		System.out.println("A área da sala retangular é: " + m);
		in.close();
	}
}