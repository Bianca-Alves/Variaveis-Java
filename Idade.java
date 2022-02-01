import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int idade;
		String nome;

		System.out.print("Digite seu nome: ");
		nome = in.nextLine();

		System.out.print("Digite sua idade: ");
		idade = in.nextInt();

		System.out.println("-------------------------");
		System.out.println(nome + ", você tem " + idade + " anos.");
		in.close();
	}
}