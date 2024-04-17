package br.edu.eteczl.projetocorrida.model;

import java.util.ArrayList;
import java.util.Date;

public class Corrida {
	public Date inicio;
	private Pista pistaEscolhida;
	private ArrayList<Automovel> automoveis = new ArrayList<>();
	
	public void adicionarAutomovel (Automovel a) {
		this.automoveis.add(a);
	}
	public void pistaEscolhida(Pista p) {
		this.pistaEscolhida = p;
	}
	
	private void ligemSeusMotores() {
		for (Automovel a : this.automoveis) {
			System.out.println(a.acelerar());
		}
	}
	
	public void iniciarCorrida() {
		this.ligemSeusMotores();
	}
}
