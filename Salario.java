import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double salario = 0, gastos = 0;

		System.out.print("Digite o valor do sal�rio: ");
		salario = entrada.nextDouble();

		gastos = (salario * 30) / 100;
		System.out.println("---------------------------------------------------------------");
		System.out.printf("O sal�rio �: R$ %.2f%n", salario);
		System.out.print("O usu�rio poder� comprometer at� 30% ");
		System.out.printf("do seu sal�rio: R$ %.2f", gastos);
		entrada.close();
	}
}