import java.util.Scanner;

public class NumAntesDepois {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int v, v1, v2;

		System.out.print("Digite um valor: ");
		v = in.nextInt();

		v1 = v - 1;
		v2 = v + 1;

		System.out.println("---------------------------------------");
		System.out.println("O n�mero antecessor deste valor �: " + v1);
		System.out.println("O n�mero sucessor deste valor �: " + v2);
		in.close();
	}
}