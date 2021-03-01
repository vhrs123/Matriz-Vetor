package arrays;

import java.text.DecimalFormat;
import java.util.Random;

public class ExercicioVetor02 {
	
	/*
	 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random aleatorio = new Random();
		DecimalFormat famatacao = new DecimalFormat("0.00");
		
		int[] dado = new int[10];
		double media = 0.0;
		int maior = 0;
		int contador = 0;

		for(int i = 0; i < dado.length; i++){
			dado[i] = aleatorio.nextInt((6 - 1) + 1) + 1;
			
			System.out.printf("Valor %d: %d \n", (i + 1), dado[i]);
			
		}
		
		for(int i = 0; i < dado.length; i++){
			media = media + dado[i];
			
			if(dado[i] >= maior) {
				// se o maior numero, for maior que o valor atual, ocontador e zerado, e se comeca a contar esse nuvo valor maior
				if(dado[i] > maior) {
					contador = 0;
				}
				
				maior = dado[i];
				contador++;
			}
			
		}

		media = media / dado.length;

		System.out.println("");
		System.out.println("A media aritimetica dos lancamentos e: "+ famatacao.format(media));
		System.out.printf("O maior valor contabilizados foi %d \n", maior);
		System.out.println("O maior numero repetiu "+ contador +" "+ ((contador == 1)? "vez" : "vezes"));

	}

}
