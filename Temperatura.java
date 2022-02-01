import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double f, c;

		System.out.print("Digite a temperatura em Fahrenheit: ");
		f = in.nextDouble();

		c = f - 32 * 5 / 9;

		System.out.println("--------------------------------------");
		System.out.println("A temperatura convertida é: " + c);
		in.close();
	}
}