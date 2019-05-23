import java.util.ArrayList;
import java.util.List;

package com.project.sop;


public class Classe {

	public static void main(String[] args) {
		while(true) {
			List<String> listaDeString = new ArrayList<String>();
			
			 File file = new File("strings.txt");
			 
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
						
						 Files.write(Paths.get("strings.txt"),strings.getBytes(), StandardOpenOption.APPEND);
						
					}
				}
			}
		}
	}

}
