/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import control.Opcoes;
import model.Player;
import view.TelaDoMenu;

public class Main {
	public static Opcoes opcoes = new Opcoes();
	public static Player player = new Player();
	
	public static void main(String[] args) {
		new TelaDoMenu();
	}

}