package com.project.sop;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception  {
		while(true) {
			List<String> listaDeString = new ArrayList<String>();
      Integer duracaoTotalCPU = null;
      Integer duracaoTotalES = null;
      Double tempoMedio = null;
      Integer tempoTotalDeDuracao = null;

			File file = new File("strings.txt");

      Map<String, String> mapString = new HashMap<String, String>();
			 
			Scanner sc = new Scanner(file);
			 
			while (sc.hasNextLine()) {
				listaDeString.add(sc.nextLine());
				sc.close();
			}   
			
			for (String strings : listaDeString) {
				if(strings.contains(" ")) {
					String[] sliptThing = strings.split(" ");
					String nomeDoProcesso = sliptThing[0];
					String tipoDeProcesso = sliptThing[1];
					Integer duracao = Integer.valueOf(sliptThing[2]);
					
					for (int i = duracao; i >= 0; i--) {
						System.out.println(nomeDoProcesso);
						System.out.println(tipoDeProcesso);
						System.out.println(duracao);
						System.out.println(i);
          }

          if(nomeDoProcesso.equals("CPU")) {
              duracaoTotalCPU += duracao;
            } else if (nomeDoProcesso.equals("ES")) {
                duracaoTotalES += duracao;
            }

            tempoTotalDeDuracao += duracao;

					}

          tempoMedio = tempoTotalDeDuracao / listaDeString.size();
            
          mapString.add("Tempo total de execução processos CPU:", tempoTotalDeDuracao);

          mapString.add("Tempo total de execução processos CPU:", duracaoTotalCPU);

          mapString.add("Tempo total de execução processos ES:", duracaoTotalES);

          mapString.add("Tempo de espera médio dos processos:", tempoMedio);

          BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
            writer.write(mapString);
            
            writer.close();
				}
			}
		}
	}
}
