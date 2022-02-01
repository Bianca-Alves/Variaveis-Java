import java.util.Scanner;

public class Coelhos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double n, c;

		System.out.print("Digite o número de coelhos: ");
		n = in.nextDouble();

		c = (n * 0.70) / 18 + 10;

		System.out.println("--------------------------------");
		System.out.printf("O custo total é: R$ %.2f", c);
		in.close();
	}
}