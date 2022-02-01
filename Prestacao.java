import java.util.Scanner;

public class Prestacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double v, t, d, p1, p2;

		System.out.print("Digite o valor da prestação: ");
		v = in.nextDouble();

		System.out.print("Digite a taxa de juros: ");
		t = in.nextDouble();

		System.out.print("Digite a quantidade de dias em atraso: ");
		d = in.nextDouble();

		t = t / 100;
		p1 = v * d;
		p2 = v + (p1 * t);

		System.out.println("-----------------------------------------");
		System.out.printf("O valor da sua prestação é: R$ %.2f", p2);
		in.close();
	}
}