package com.univille.team.first.fit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int vetor[] = new int[30];
		System.out.println("tamanho total da memória atual:" + 40  
		+ "\nocupação de SO: " +  10
				+ "\ntamanho restante: " + vetor.length);
		

		Random r = new Random();
		for(int i = 0; i < vetor.length; i++) {
			if(50 < r.nextInt(100)) {
				vetor[i] = 1;
			}
		}

		System.out.println(Arrays.toString(vetor));
		Boolean haveProcessToProcess = Boolean.FALSE;
		
		haveProcessToProcess = Boolean.TRUE;
		
		while(haveProcessToProcess) {
			System.out.println("Digite o tamanho que o processo ocupará:");
			int process = scanner.nextInt();
			
			System.out.println("Deseja continuar:");
			String answer = scanner.nextLine();
			
			
			if(answer.equalsIgnoreCase("não") || answer.equalsIgnoreCase("n") ||
					answer.equalsIgnoreCase("no")) {
				haveProcessToProcess = Boolean.FALSE;
			}
			
			int j;

			for (i = 0; i < p; i++) {
				for (j = 0; j < m; j++) {
					if (vetor[j].size >= process) {
						vetor[j].size -= process;

						System.out.println("Processo " + (i + 1)
								+ ". Espaço restante após a alocação " + vetor[j].size);
						break;
					}
				}
				if (j == m) {
					System.out.println("Não há mais memória disponivel");
				}
			}
		}
	}
}
