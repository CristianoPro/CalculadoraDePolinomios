package Modelo;

import java.util.Scanner;
/**
 * 
 * @author Cristiano Souza de Oliveira
 * tia 41612590
 *
 */

public class CalculadoraPolinomio {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			montaMenu();
			System.out.print("Digite sua opcao: ");
			opcao = teclado.nextInt();
			System.out.println("=======================================================\n");
			
			switch (opcao) {
			case 1:
				Criar();
				break;
			case 2:
				Calcular();
				break;
				//case3 , 4  , etc...
			case 3:
				Somar();
				break;
			case 4:
				Multiplicar();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			
		}while (opcao !=0 );
		
	}
	
	private static Polinomio Criar() {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int grau;
		System.out.print("Informe o grau do Polinomio: ");
		grau = teclado.nextInt();
		System.out.println("");
		double[] termos = new double[grau+1];
		for(int i = 0; i<termos.length; i++) {
			
			double coeficiente = 0;
			System.out.print("Digite o coeficiente: ");
			coeficiente = teclado.nextInt();
			System.out.print("Digite o expoente de x (Para o termo independente digite 0): ");
			int expoente = 0;
			expoente = teclado.nextInt();
			System.out.println("===========================================================");
			termos[expoente] = coeficiente;
			System.out.print("O Polinomio tem mais termos? 1 = sim, 0 = nao: ");
			int controle = 1;
			controle = teclado.nextInt();
			System.out.println("===========================================================");
			if(controle == 0) {
				break;
			}
			
		}
		
		Polinomio p = new Polinomio(grau);
		p.setTermos(termos);
		System.out.print("Polinomio: ");
		p.mostra(p);
		System.out.println("===========================================================");
		return p;
 		
		
	}
	private static void Calcular() {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x;
		System.out.print("Digite o valor de x: ");
		x = teclado.nextInt();
		Polinomio polinomio = Criar();
		
		double valor = polinomio.CalculaValorPolinomio(x);
		
		System.out.println("O resultado  P("+x+") = " + valor  );
		
		
	}
	private static void Somar() {
		System.out.println("=============== Crie o Primeiro polinomio! ================\n");
		Polinomio polinomio1 = Criar();
		System.out.println("===========================================================\n");
		System.out.println("=============== Crie o Segundo polinomio! =================\n");
		Polinomio Polinomio2 = Criar();
		
		Polinomio polinomioSoma = polinomio1.SomaPolinomio(Polinomio2);
		System.out.println("===========================================================\n");
		System.out.print("Resultado da Soma = ");
		polinomioSoma.mostra(polinomioSoma);
		System.out.println("===========================================================\n");
	}
	private static void Multiplicar() {
		System.out.println("================ Crie o Primeiro polinomio! ===============\n");
		Polinomio polinomio1 = Criar();
		System.out.println("===========================================================\n");
		System.out.println("================ Crie o Segundo polinomio! ================\n");
		Polinomio Polinomio2 = Criar();
		
		Polinomio polinomioMultiplicado = polinomio1.MultiplicaPolinomio(Polinomio2);
		System.out.println("===========================================================\n");
		System.out.print("Resultado da Multiplicao = ");
		polinomioMultiplicado.mostra(polinomioMultiplicado);
		System.out.println("===========================================================\n");
		
	}
	
	static void montaMenu() {
		System.out.println("\n                             ### Calculadora de Polinomios ###");
		System.out.println("\n                   =======================================================");
		System.out.println("                  |  1 - Criar um Polinomio                               |");
		System.out.println("                  |  2 - Calcular o valor de um Polinomio p/ um valor P(x)|");
		System.out.println("                  |  3 - Somar dois Polinomios                            |");
		System.out.println("                  |  4 - Multiplicar dois Polinomios                      |");
		System.out.println("                  |  0 - Sair                                             |");
		System.out.println("                   =======================================================\n");
	}
	
	
}
