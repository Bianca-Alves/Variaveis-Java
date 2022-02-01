import java.util.Scanner;

public class ConverterReaisEmDolares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double v;

		System.out.print("Digite um valor em reais: ");
		v = in.nextDouble();

		v = v / 5.27;

		System.out.println("--------------------------------------------");
		System.out.printf("O valor convertido em dólares é: US$ %.2f", v);
		in.close();
	}
}