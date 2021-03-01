package arrays;

import java.util.Scanner;

public class MinhaAgenda {
	
	/*
	 * Sistema: Minha Agenda Pessoal
	 * 24h por dia
	 * 31 dias por mes
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0;
		int linha;
		int coluna;
		int contador = 0;
		String mensagem = "";
		String[][] agendaPessoa = new String[24][31];
		
		Scanner entradaDado = new Scanner(System.in);
		
		do {
			System.out.println("Ola, seja Bem-Vindo a sua agenda Pessoal");
			
			System.out.println();
			
			System.out.println("1 | Cadastrar um Evento");
			System.out.println("2 | Verificar meus Eventos");
			System.out.println("3 | Filtro: Hora e Data");
			System.out.println("0 | Fechar Agenda");
			
			System.out.print("==> ");
			opcao = entradaDado.nextInt();
			entradaDado.nextLine();
			
			System.out.println();
			
			switch(opcao) {
				case 1:
					do {
						System.out.println("Cadastrar um Evento");
						
						System.out.print("Informe o Dia: ");
						coluna = entradaDado.nextInt();
						entradaDado.nextLine();
						
						System.out.print("Informe a Hora: ");
						linha = entradaDado.nextInt();
						entradaDado.nextLine();
						
					}while(!(coluna >= 1 && coluna <= 31) && !(linha >= 0 && linha <= 24));
					
					System.out.print("Descricao do Evento: ");
					mensagem = entradaDado.nextLine();
					
					if(linha == 24) {
						linha = 0;
					}
					
					coluna = coluna - 1;

					agendaPessoa[linha][coluna] = mensagem;
					
					System.out.println();

				break;
				
				case 2:
					System.out.println("Listar meus Eventos cadastrados");

					for(int i = 0; i < agendaPessoa.length; i++) {
						for(int j = 0; j < agendaPessoa[i].length; j++) {
							if(agendaPessoa[i][j] != null) {
								System.out.println("Evento: "+ (j + 1) +" as "+ i +"h - "+ agendaPessoa[i][j]);
								
								contador++;
								
								System.out.printf("\nEventos cadastrados: %d \n", contador);

							}
						}
					}
					
					System.out.println();
					
				break;
					
				case 3:
					do {
						System.out.println("Filtro: Hora e Data");
						
						System.out.print("Informe o Dia: ");
						coluna = entradaDado.nextInt();
						entradaDado.nextLine();
						
						System.out.print("Informe a Hora: ");
						linha = entradaDado.nextInt();
						entradaDado.nextLine();
						
					}while(!(coluna >= 1 && coluna <= 31) && !(linha >= 0 && linha <= 24));
					
					if(linha == 24) {
						linha = 0;
					}
					
					coluna = coluna - 1;
					
					System.out.println();
					System.out.println("Resultados da Pesquisa: ");
					if(agendaPessoa[linha][coluna] != null) {
						System.out.println("Evento: "+ (coluna + 1) +" as "+ linha +"h - "+ agendaPessoa[linha][coluna]);
						System.out.println();
						
					}else {
						System.out.println("Nao ha eventos cadastrados no dia "+ (coluna + 1) +" as "+ linha +"h");
						System.out.println();
						
					}
					
				break;
					
				case 0:
					System.out.println("Fechar Agenda");
					opcao = 0;
					
				break;
					
				default:
					System.out.println("Opcao invalida, digite novamente!!");
					
				break;
			
			}
			
		}while(opcao != 0);

	}

}
