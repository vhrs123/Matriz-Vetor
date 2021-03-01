package arrays;

import java.util.Random;

public class ExercicioMatriz01 {
	
	/*
	 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		
		Random aleatorio = new Random();

		for(int i = 0; i < n1.length; i++){
			for(int j = 0; j < n1[i].length; j++){
				n1[i][j] = aleatorio.nextInt(20);  
				n2[i][j] = aleatorio.nextInt(20);
			}
		}

		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				m1[i][j] = (n1[i][j] + n2[i][j]);
				m2[i][j] = (n1[i][j] - n2[i][j]);
			}
		}
		
		System.out.println("\nMatriz 1");
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				System.out.print("["+ m1[i][j] +"]");
				
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz 2");
		for(int i = 0; i < m2.length; i++){
			for(int j = 0; j < m2[i].length; j++){
				System.out.print("["+ m2[i][j] +"]");
				
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				System.out.printf("Matriz 1 - posicao %d: %d + %d = %d \n", (j + 1), n1[i][j], n2[i][j], m1[i][j]);
				System.out.printf("Matriz 2 - posicao %d: %d - %d = %d \n", (j + 1), n1[i][j], n2[i][j], m2[i][j]);
				System.out.println();
				
			}
		}

	}

}
