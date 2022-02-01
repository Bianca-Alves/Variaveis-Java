import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double salario = 0, gastos = 0;

		System.out.print("Digite o valor do salário: ");
		salario = entrada.nextDouble();

		gastos = (salario * 30) / 100;
		System.out.println("---------------------------------------------------------------");
		System.out.printf("O salário é: R$ %.2f%n", salario);
		System.out.print("O usuário poderá comprometer até 30% ");
		System.out.printf("do seu salário: R$ %.2f", gastos);
		entrada.close();
	}
}