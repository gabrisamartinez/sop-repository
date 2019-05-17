import java.util.ArrayList;
import java.util.List;

public class Classe {

	public static void main(String[] args) {
		while(true) {
			List<String> listaDeString = new ArrayList<String>();
			
			while (sc.hasNextLine()) 
			      listaDeString.add(sc.nextLine()) ;
			
			for (String outraCoisa : listaDeString) {
				if(outraCoisa.contains(" ")) {
					String[] sliptDoBagulho = outraCoisa.split(" ");
					String nomeDoProcesso = sliptDoBagulho[0];
					String tipoDeProcesso = sliptDoBagulho[1];
					Integer duracao = Integer.valueOf(sliptDoBagulho[2]);
					
					for (int i = duracao; i >= 0; i--) {
						System.out.println(nomeDoProcesso);
						System.out.println(tipoDeProcesso);
						System.out.println(duracao);
						System.out.println(i);
//						Integer tempoRestante = duracao; 
//						System.out.println(tempoRestante);
//						tempoRestante = duracao != null ? duracao - 1 : 0;
					}
				}
			}
		}
	}

}