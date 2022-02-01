import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double media, n1, n2, n3, n4;

		System.out.print("Digite a primeira nota: ");
		n1 = in.nextDouble();

		System.out.print("Digite a segunda nota: ");
		n2 = in.nextDouble();

		System.out.print("Digite a terceira nota: ");
		n3 = in.nextDouble();

		System.out.print("Digite a quarta nota: ");
		n4 = in.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;

		System.out.println("----------------------------");
		System.out.println("Sua média aritmética é: " + media);
		in.close();
	}
}