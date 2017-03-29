package IRRF

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IRRF {
private static DecimalFormat df2 = new DecimalFormat(".##");
public static void main (String[] args) throws IOException {
double salario = 0, irrf = 0;
int opcao;
char resp = 0;
Scanner scn = new Scanner(System.in);
String newline = System.getProperty("line.separator");
  do {	
	
	System.out.println("Escolha entre as opções abaixo: " + newline + newline + "1 - Minha renda é abaixo de 1903.98" + newline + "2 - Minha renda está entre 1903.98 e 2826.65" + newline + "3 - Minha renda está entre 2826.65 e 3751.05" + newline + "4 - Minha renda está entre 3751.05 e 4664.68" + newline + "5 - Minha renda é superior a 4664.68");
	opcao = scn.nextInt();
	

	switch (opcao){
	case 1: 
		System.out.println("Você não tem renda suficiente para declarar IRRF");
		System.out.println("Deseja fazer outra consulta? s/n");
		resp = scn.next().charAt(0);
		break;
			
	case 2: 
		System.out.println("Digite o valor do seu salário: ");
		salario = scn.nextDouble();
		if (salario > 1903.98 && salario < 2826.65) {
			irrf = (salario * (7.5/100));
			System.out.println(df2.format(irrf) + " R$ por mês");
			System.out.println("O valor a ser deduzido segundo a tabela de 2016 é de 142.80 R$");
			irrf = irrf - 142.80;
			System.out.println("O Valor final a ser deduzido é de: " + df2.format(irrf)); 
			irrf = irrf * 12;
			System.out.println("O valor anual pago de IRRF por você é: " + df2.format(irrf));
		}
		
		else if (salario < 1903.98){
			System.out.println("O valor informado está abaixo do valor mínimo esperado, faça outra consulta!");
		}
		
		else if (salario > 2826.65){
			System.out.println("O valor informado está acima do valor máximo esperado, faça outra consulta!" );
		}
		
		System.out.println("Deseja fazer outra consulta? s/n");
		resp = scn.next().charAt(0);
		break;
	
	case 3:
		System.out.println("Digite o valor do seu salário: ");
		salario = scn.nextDouble();
		if (salario > 2826.65 && salario < 3751.05) {
			System.out.println("Seu salário alcançou o teto estimado de 5189.82" + newline + "este valor será utilizado para fazer os devidos cálculos!" );
			irrf = (5189.82 * (22.5/100));
			System.out.println(df2.format(irrf) + " R$ por mês");
			System.out.println("O valor a ser deduzido segundo a tabela de 2016 é de 354.80 R$");
			irrf = irrf - 354.80;
			System.out.println("O Valor final a ser deduzido é de: " + df2.format(irrf)); 
			irrf = irrf * 12;
			System.out.println("O valor anual pago de IRRF por você é: " + df2.format(irrf));
		}
		
		else if (salario < 2826.65){
			System.out.println("O valor informado está abaixo do valor mínimo esperado, faça outra consulta!");
		}
		
		else if (salario > 3751.05){
			System.out.println("O valor informado está acima do valor máximo esperado, faça outra consulta!" );
		}
		
		System.out.println("Deseja fazer outra consulta? s/n");
		resp = scn.next().charAt(0);
		break;
		
	case 4: 
		System.out.println("Digite o valor do seu salário: ");
		salario = scn.nextDouble();
		if (salario > 3751.05 && salario < 4664.68) {
			System.out.println("Seu salário alcançou o teto estimado de 5189.82" + newline + "este valor será utilizado para fazer os devidos cálculos!" );
			irrf = (5189.82 * (22.5/100));
			System.out.println(df2.format(irrf) + " R$ por mês");
			System.out.println("O valor a ser deduzido segundo a tabela de 2016 é de 636.13 R$");
			irrf = irrf - 636.13;
			System.out.println("O Valor final a ser deduzido é de: " + df2.format(irrf)); 
			irrf = irrf * 12;
			System.out.println("O valor anual pago de IRRF por você é: " + df2.format(irrf));
		}
		
		else if (salario < 3751.05){
			System.out.println("O valor informado está abaixo do valor mínimo esperado, faça outra consulta!");
		}
		
		else if (salario > 4664.68){
			System.out.println("O valor informado está acima do valor máximo esperado, faça outra consulta!" );
		}
		
		System.out.println("Deseja fazer outra consulta? s/n");
		resp = scn.next().charAt(0);
		break;
		
	case 5: 
		System.out.println("Digite o valor do seu salário: ");
		salario = scn.nextDouble();
		if (salario > 4664.68) {
			System.out.println("Seu salário alcançou o teto estimado de 5189.82" + newline + "este valor será utilizado para fazer os devidos cálculos!" );
			irrf = (5189.82 * (27.5/100));
			System.out.println(df2.format(irrf) + " R$ por mês");
			System.out.println("O valor a ser deduzido segundo a tabela de 2016 é de 869.36 R$");
			irrf = irrf - 869.36;
			System.out.println("O Valor final a ser deduzido é de: " + df2.format(irrf)); 
			irrf = irrf * 12;
			System.out.println("O valor anual pago de IRRF por você é: " + df2.format(irrf));
		}
		
		
		else if (salario < 4664.68){
			System.out.println("O valor informado está abaixo do valor máximo esperado, faça outra consulta!" );
		}
		
		System.out.println("Deseja fazer outra consulta? s/n");
		resp = scn.next().charAt(0);
		break;
		
	}


  } while (resp == 's');
  
System.out.println("Sistema Finalizado!");

} 
}