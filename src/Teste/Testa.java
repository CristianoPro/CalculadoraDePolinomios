package Teste;

import Modelo.Polinomio;

public class Testa {

	public static void main(String[] args) {
		Polinomio p1 = new Polinomio(3);
		double[] t1 = {2,-5,0,1 };
		p1.setTermos(t1);
		//System.out.println(p1.CalculaValorPolinomio(-1));
		
		Polinomio p2 = new Polinomio(6);
		double[] t2 = {0,3,-8,-6,0,3,4};
		p2.setTermos(t2);
		
		Polinomio p3 = new Polinomio(6);
		double[] t3 = {9,0,-4,2,6,0,-1};
		p3.setTermos(t3);
		
		//Polinomio soma = p2.SomaPolinomio(p3);
		//soma.mostra(soma);

		Polinomio p4 = new Polinomio(3);
		double[] t4 = { -1, 2, 0, 1 };
		p4.setTermos(t4);
		
		Polinomio p5 = new Polinomio(4);
		double[] t5 = {-2,3,0,2,1};
		p5.setTermos(t5);
		
		Polinomio p6 = new Polinomio(3);
		double[] t6 = { -1, 2,0, 1};
		p6.setTermos(t6);
		
		Polinomio multiplicado = p5.MultiplicaPolinomio(p6);
		
		multiplicado.mostra(multiplicado);
		

	}

}

