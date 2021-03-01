package arrays;

import java.util.Scanner;

public class ExercicioVetor01 {
	
	/*
     * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
        atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
     */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[5];
		int maior = 0;
		
		Scanner entradaInt = new Scanner(System.in);
		
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite a pontuacao "+ (i + 1) +": ");
            vetor[i] = entradaInt.nextInt();
            
            if(vetor[i] > maior){
                maior = vetor[i];
            }
            
            System.out.println("A pontuacao "+ (i + 1) +" e: "+ vetor[i]);
            
        }

        System.out.println("A maior pontuacao e: "+ maior);

	}

}
