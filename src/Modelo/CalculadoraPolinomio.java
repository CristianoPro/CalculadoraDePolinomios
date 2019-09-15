package Modelo;

import java.util.Scanner;
import java.io.*;

/**
 * 
 * @author Cristiano Souza de Oliveira
 * 
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
			case 5:
				Mostrar();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Op��o Inv�lida!");
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
		double[] termos = new double[grau+1];
		for(int i = 0; i<termos.length; i++) {
			
			double coeficiente = 0;
			System.out.print("Digite o coeficiente: ");
			coeficiente = teclado.nextInt();
			System.out.print("Digite o expoente de x: ");
			int expoente = 0;
			expoente = teclado.nextInt();
			termos[expoente] = coeficiente;
			System.out.print("O Polinomio tem mais termos? 1=sim, 0=nao: ");
			int controle = 1;
			controle = teclado.nextInt();
			if(controle == 0) {
				break;
			}
			
		}
		
		Polinomio p = new Polinomio(grau);
		p.setTermos(termos);
		
		return p;
 		
		
	}
	private static void Calcular() {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x;
		System.out.print("Digite o valor de x: ");
		x = teclado.nextInt();
		Polinomio p = Criar();
		
		double valor = p.CalculaValorPolinomio(x);
		
		System.out.println("O resultado =" + valor  );
		
		
	}
	private static void Somar() {
		// TODO Auto-generated method stub
		
	}
	private static void Multiplicar() {
		// TODO Auto-generated method stub
		
	}
	private static void Mostrar() {
		// TODO Auto-generated method stub
		
	}
	static void montaMenu() {
		System.out.println("\n                             ### Calculadora de Polinomios ###");
		System.out.println("\n                   =======================================================");
		System.out.println("                  |  1 - Criar um Polinomio                               |");
		System.out.println("                  |  2 - Calcular o valor de um Polinomio p/ um valor P(x)|");
		System.out.println("                  |  3 - Somar dois Polinomios                            |");
		System.out.println("                  |  4 - Multiplicar dois Polinomios                      |");
		System.out.println("                  |  5 - indefinido                                       |");
		System.out.println("                  |  0 - Sair                                             |");
		System.out.println("                   =======================================================\n");
	}
	
	
}
