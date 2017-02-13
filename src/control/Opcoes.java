/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import model.Missao;
import view.Fase;
import view.TelaOpcoes;

public class Opcoes {
	
	private int velocidadeBaixa = 190;
	private int velocidadeNormal = 140;
	private int velocidadeRapida = 90;
	private int quantidadeDePerguntas = 20;

	private boolean veloBaixa;
	private boolean veloNorma;
	private boolean veloRapida;
	private boolean multP;

	public Opcoes(){
		veloBaixa = false;
		veloNorma = true;
		veloRapida = false;
		multP = false;
	}

	public void carregarConfiguracoes(Fase fase,Missao missao){
		if(veloBaixa){
			fase.setVELOCIDADE(velocidadeBaixa);
		}
		if(veloNorma){
			fase.setVELOCIDADE(velocidadeNormal);
		}
		if(veloRapida){
			fase.setVELOCIDADE(velocidadeRapida);
		}

		/**
		 * 
		 * =================================  Carregar Operações =====================================
		 * 
		 * */

		
		fase.setQuantidadeDePerguntas(quantidadeDePerguntas);
	}

	public void receberConfiguracoes(TelaOpcoes tela){

		if(tela.getVelocidadeBaixa().isSelected()){
			veloBaixa = true;
			veloNorma = false;
			veloRapida = false;
		}
		if(tela.getVelocidadeNormal().isSelected()){
			veloBaixa = false;
			veloNorma = true;
			veloRapida = false;
		}
		if(tela.getVelocidadeRapida().isSelected()){
			veloBaixa = false;
			veloNorma = false;
			veloRapida = true;
		}

		/**
		 * 
		 * ===============================================configurações de operações==============================
		 * 		  
		 * */

		quantidadeDePerguntas = Integer.parseInt(tela.getQuantidade().getText());

	}

	/**
	 *
	 * ==================get e sets dos inteiros==========================
	 * 
	 * */

	public int getVelocidadeBaixa() {
		return velocidadeBaixa;
	}

	public void setVelocidadeBaixa(int velocidadeBaixa) {
		this.velocidadeBaixa = velocidadeBaixa;
	}

	public int getVelocidadeNormal() {
		return velocidadeNormal;
	}

	public void setVelocidadeNormal(int velocidadeNormal) {
		this.velocidadeNormal = velocidadeNormal;
	}

	public int getVelocidadeRapida() {
		return velocidadeRapida;
	}

	public void setVelocidadeRapida(int velocidadeRapida) {
		this.velocidadeRapida = velocidadeRapida;
	}

	public int getQuantidadeDePerguntas() {
		return quantidadeDePerguntas;
	}

	public void setQuantidadeDePerguntas(int quantidadeDePerguntas) {
		this.quantidadeDePerguntas = quantidadeDePerguntas;
	}

	


}