package Modelo;
/**
 * 
 * @author Cristiano Souza de Oliveira
 *@tia	41612590
 */

public class Polinomio {
	
	// vetor para representar os termos do polinomio
	private double[] termos;
	private int grau;

	// recebe um grau de polinomio e instancia os termos do polinomio
	public Polinomio(int grau) {
		this.grau = grau;
		double[] termos = new double[grau + 1];
		this.termos = termos;

	}

	// imprime o polinomio
	public void mostra(Polinomio p) {
		System.out.println("grau: " + p.grau + "\n");

		double[] termos = p.getTermos();

		for (int i = 0; i <= p.grau; i++) {
			System.out.print("Termo:" + i + " = " + termos[i] + "\n");
		}
		System.out.println("\n");

		for (int k = p.getGrau(); k >= 0; k--) {
			System.out.print(termos[k] + "^" + k + " ");
		}
		System.out.println("\n");
	}

	// Calcula o valor do polinomio
	public double CalculaValorPolinomio(double x) {
		double valor = 0;
		double[] termos = this.getTermos();
		//for para calcular o valor do polinomio pra P(x), atribui o resultado do calculo a valor
		for (int i = this.grau; i >= 0; i--) {
			valor += termos[i] * Math.pow(x, i);
		}
		
		return valor;
	}

	//Calcula a soma de dois polinomios
	public Polinomio SomaPolinomio(Polinomio p) {
		int grau = Math.max(this.grau,p.grau);
		double[] termos1 = this.getTermos();
		double[] termos2 = p.getTermos();
		double[] termosSoma = new double[grau + 1];
		//recebe os termos e efetua a soma 
		for (int i = 0; i < termosSoma.length; i++) {
			termosSoma[i] = termos1[i] + termos2[i];
		}
		//instancia o polinomio resultante da soma e retorna um objeto do tipo polinomio
		Polinomio resultado = new Polinomio(grau);
		resultado.setTermos(termosSoma);

		return resultado;
	}
	
	// Multiplicacao de dois polinomios
	public Polinomio MultiplicaPolinomio(Polinomio p) {
		int grau = this.grau + p.getGrau();
		double[] termos1 = this.getTermos();
		double[] termos2 = p.getTermos();
		double[] termosResultantes = new double[grau + 1];
		//realiza a multiplicacao dos termos e atribui os resultados a termosResultantes
		for (int i = 0; i <= this.getGrau(); i++) {
			for (int j = 0; j <= p.getGrau(); j++) {
				termosResultantes[i + j] += termos1[i] * termos2[j];
			}
		}
		//instancia o polinomio resultante da multiplicacao e retorna um objeto do tipo polinomio
		Polinomio resultado = new Polinomio(grau);
		resultado.setTermos(termosResultantes);
		
		return resultado;
	}

	// Getters and Setters
	public double[] getTermos() {
		return termos;
	}

	public void setTermos(double[] termos) {
		this.termos = termos;
	}

	public int getGrau() {
		return grau;
	}

	public void setGrau(int grau) {
		this.grau = grau;
	}
}
