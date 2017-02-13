/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TelaJogo extends JFrame{
	private static final long serialVersionUID = 1L;
	public TelaJogo(){
		add(new Fase());
		
		setTitle("Snake Game");
		setSize(900,608);
		setIconImage(new ImageIcon("res/SnakeIcon.png").getImage());
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}