package br.edu.eteczl.projetocorrida;

import br.edu.eteczl.projetocorrida.model.Carro;
import br.edu.eteczl.projetocorrida.model.Corrida;
import br.edu.eteczl.projetocorrida.model.Moto;
import br.edu.eteczl.projetocorrida.model.Pista;

public class App {
  public static void main(String[] args) 
  {
	  Pista p = new Pista();
	  Moto moto1 = new Moto();
	  Carro carro1 = new Carro();
	  Carro carro2 = new Carro();
	  Carro carro3 = new Carro();
	  
	  Corrida corrida = new Corrida(); 
	  corrida.pistaEscolhida(p);
	  corrida.adicionarAutomovel(moto1);
	  corrida.adicionarAutomovel(carro1);
	  corrida.adicionarAutomovel(carro2);
	  corrida.adicionarAutomovel(carro3);
	  
	  corrida.iniciarCorrida();
  }
}
