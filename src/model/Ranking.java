/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;

import main.Main;


public class Ranking {

	private ArrayList<Player> ranking ;
//	EscreverXML xml = new EscreverXML(this);
	public Ranking(){
		 ranking = new ArrayList<>();
	}

	
	public void addNoRanking(){
		ranking.add(Main.player);
	}
	

	
	public void ordenarRanking(){
		 Collections.sort(ranking);
	}
	
//	public void atualizar(){
//	this.ranking = xml.buscarXML();	
//}
	
//	public void gerarXML(){
//		xml.gerarXML();
//	}

	public void limparRanking(){
		ranking=null;
	}

//	public void addNoRanking(ArrayList<Player> p){
//	this.ranking=p;
//}

	public void morstrarDesempenho(){
		for(Player play : ranking ){
			play.desempenho();
		}
		
	}

	
	public ArrayList<Player> getRanking() {
		return ranking;
	}

	
	public void setRanking(ArrayList<Player> ranking) {
		this.ranking = ranking;
	}
	

}