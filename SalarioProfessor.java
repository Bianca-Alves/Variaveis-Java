import java.util.Scanner;

public class SalarioProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double salario1, salario2, v1, v2, v3;

		System.out.print("Digite o valor da hora aula: ");
		v1 = in.nextDouble();

		System.out.print("Digite o número de aulas dadas no mês: ");
		v2 = in.nextDouble();

		System.out.print("Digite o percentual de desconto do INSS: ");
		v3 = in.nextDouble();

		v3 = v3 / 100;
		salario1 = v1 * v2;
		salario2 = salario1 - (salario1 * v3);

		System.out.println("-------------------------------------------");
		System.out.printf("Seu salário é: R$ %.2f", salario2);
		in.close();
	}
}