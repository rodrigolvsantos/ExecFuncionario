package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Funcionario funcionario = new Funcionario();
		
		System.out.print("Digite o nome do funcionario: ");
		funcionario.name = sc.next();
		
		System.out.print("Digite o valor do salário");
		funcionario.grossalary = sc.nextDouble();
		
		System.out.print("Digite o valor da taxa de desconto");
		funcionario.tax= sc.nextDouble();
		
		System.out.print(funcionario.name);
		System.out.print(funcionario.grossalary);
		System.out.print(funcionario.tax);
		
		
		sc.close();
	}


}
