package arrays;

import java.util.Scanner;

public class ExercicioMatriz02 {
	
	/*
	 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[3][3];
		int soma = 0;
		int diagonalPrincipal = 0;
		
		Scanner entradaInt = new Scanner(System.in);

		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				System.out.printf("Digite o %d° valor da linha %d: ", (j + 1), (i + 1));
				matriz[i][j] = entradaInt.nextInt();
			}
		}

		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				soma = soma + matriz[i][j];
				
			}
			diagonalPrincipal = diagonalPrincipal + matriz[i][i];
		}
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				System.out.print("["+ matriz[i][j] +"]");
				
				if(j == 2) {
					System.out.println();
				}
				
			}
		}

		System.out.printf("Soma dos elementos da Matriz: %d \n", soma);
		System.out.printf("Soma da diagonal principal da Matriz: %d \n", diagonalPrincipal);

	}

}
