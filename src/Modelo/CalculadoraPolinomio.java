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
				System.out.println("Opção Inválida!");
				break;
			}
			
		}while (opcao !=0 );
		
	}
	private static void Criar() {
		
		
	}
	private static void Calcular() {
		// TODO Auto-generated method stub
		
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
		System.out.println("                  |  5 - Mostra Polinomio                                 |");
		System.out.println("                  |  0 - Sair                                             |");
		System.out.println("                   =======================================================\n");
	}
	
	
}
