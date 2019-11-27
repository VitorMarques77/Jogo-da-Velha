package application;

import java.util.Scanner;

import entities.Jogador;
import entities.Tabuleiro;

public class Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Tabuleiro jogo = new Tabuleiro();
		jogo.criarTabuleiro();
		
		int linha,coluna;
			System.out.println("Deseja iniciar um novo jogo?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.printf("Digite sua opção: ");
			int iniciar = sc.nextInt();
			while (iniciar==1) {
				System.out.println("NOVO JOGO");
				jogo.criarTabuleiro();
				jogo.result = " ";
				while (!jogo.check().equals("Jogador 1 Vencedor!!")&&!jogo.check().equals("Jogador 2 Vencedor!!")&&!jogo.check().equals("Empate!!")) {
					do {
					jogo.mostrarTabuleiro();
					System.out.println();
					System.out.println("Vez do jogador 1:");
					System.out.println();
					Jogador.jogador = "Jogador 1";
					Jogador.marcacao();
					System.out.printf("Digite o número da linha (1-3): ");
					linha = sc.nextInt();
					System.out.println();
					while (linha>3||linha<1) {
						System.out.println("Linha inválida!!");
						System.out.println();
						System.out.printf("Digite o número da linha entre 1 e 3: ");
						linha = sc.nextInt();
						System.out.println();
					}
					System.out.printf("Digite o número da coluna (1-3): ");
					coluna = sc.nextInt();
					while (coluna>3||coluna<1) {
						System.out.println();
						System.out.println("Coluna inválida");
						System.out.println();
						System.out.printf("Digite o número da coluna entre 1 e 3: ");
						coluna = sc.nextInt();
					}
					if(!jogo.mat[linha][coluna].equals(" - ")&&!jogo.mat[linha][coluna].equals(" -\n")){
						System.out.println();
						System.out.println("Linha e Coluna já preenchida!");
						System.out.println();
						System.out.println("Digite valores válidos para a linha e coluna");
						
					}
					}while(!jogo.mat[linha][coluna].equals(" - ")&&!jogo.mat[linha][coluna].equals(" -\n"));
					jogo.jogada(linha, coluna);
					jogo.check();
					if (!jogo.check().equals("Jogador 1 Vencedor!!")&&!jogo.check().equals("Empate!!")) {
						do {
						jogo.mostrarTabuleiro();
						System.out.println();
						System.out.println("Vez do jogador 2:");
						System.out.println();
						Jogador.jogador = "Jogador 2";
						Jogador.marcacao();
						System.out.println();
						System.out.printf("Digite o número da linha (1-3): ");
						linha = sc.nextInt();
						while (linha>3||linha<1) {
							System.out.println("Linha inválida!!");
							System.out.println();
							System.out.printf("Digite o número da linha entre 1 e 3: ");
							linha = sc.nextInt();
							System.out.println();
						}
						System.out.println();
						System.out.printf("Digite o número da coluna (1-3): ");
						coluna = sc.nextInt();
						while (coluna>3||coluna<1) {
							System.out.println();
							System.out.println("Coluna inválida");
							System.out.println();
							System.out.printf("Digite o número da coluna entre 1 e 3: ");
							coluna = sc.nextInt();
						}
						if(!jogo.mat[linha][coluna].equals(" - ")&&!jogo.mat[linha][coluna].equals(" -\n")){
							System.out.println();
							System.out.println("Linha e Coluna já preenchida!");
							System.out.println();
							System.out.println("Digite valores válidos para a linha e coluna");
						}
						}while(!jogo.mat[linha][coluna].equals(" - ")&&!jogo.mat[linha][coluna].equals(" -\n"));
						jogo.jogada(linha, coluna);
						jogo.check();
					}
					jogo.check();
					}
					jogo.mostrarTabuleiro();
					System.out.println();
					System.out.println(jogo.check());
					System.out.println();
					System.out.println("Deseja iniciar um novo jogo?");
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					System.out.printf("Digite sua opção: ");
					iniciar = sc.nextInt();
			}
			if (iniciar==2) {
				System.out.println();
				System.out.println("Saindo do jogo...");
				
			}
			else {
				System.out.println();
				System.out.println("Opção inválida!! Saindo do jogo...");
				
			}

			sc.close();
			
		}

	}

