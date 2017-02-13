/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import main.Main;
import model.Som;


public class TelaDoMenu extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private Som audio;

	private JLabel primeiroPlayerLabel, titleLabel;
	private JTextField primeiroPlayerField;
	private JButton jogarButton,sairButton,optionButton;
	private JLabel imagemLabel;
	private JRadioButton doisJogador;
	public TelaDoMenu(){
		audio = new Som();
		audio.menuIniciar();

		ImageIcon imagem = new ImageIcon("res/Menu.png");
		imagemLabel = new JLabel(imagem);
		add(imagemLabel);

		primeiroPlayerLabel = new JLabel(new ImageIcon("res/PlayerLabel.png"));
		imagemLabel.add(primeiroPlayerLabel);
                
		primeiroPlayerField = new JTextField(10);
		imagemLabel.add(primeiroPlayerField);
		
                titleLabel = new JLabel("SNAKE GAME");
		imagemLabel.add(titleLabel);


		jogarButton = new JButton();
		jogarButton.setIcon(new ImageIcon("res/StartButton.png"));
		imagemLabel.add(jogarButton);

		sairButton = new JButton();
		sairButton.setIcon(new ImageIcon("res/QuitBar.png"));
		imagemLabel.add(sairButton);

		optionButton =new JButton();
		optionButton.setIcon(new ImageIcon("res/OpcoesButton.png"));
		imagemLabel.add(optionButton);

		jogarButton.addActionListener(this);
		sairButton.addActionListener(this);
		optionButton.addActionListener(this);

		imagemLabel.setBounds(1,1,1,1);

		primeiroPlayerLabel.setBounds(100, 50, 130, 30);
		primeiroPlayerField.setBounds(300, 50, 130, 30);
                titleLabel.setBounds(225, 0, 100, 50);

		

		jogarButton.setBounds(100,400 , 132, 40);
		jogarButton.setContentAreaFilled(false);
		jogarButton.setBorder(null);
		
		sairButton.setBounds(300, 400, 132, 40);
		sairButton.setContentAreaFilled(false);
		sairButton.setBorder(null);

		optionButton.setBounds(250, 400, 40, 38);
		optionButton.setContentAreaFilled(false);
		optionButton.setBorder(null);

		setUndecorated(true);
		setTitle("Snake Game");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("res/SnakeIcon.png").getImage());
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);

	}


	public void actionPerformed(ActionEvent e) {
		
		if((e.getSource()==jogarButton)){
			audio.botaoInicius();
                            if (primeiroPlayerField.getText().trim().equals("")) {  
					JOptionPane.showMessageDialog(null, "Digite um nome para iniciar a partida");
                            } else {  
					audio.menuParar();
					Main.player.setNome(primeiroPlayerField.getText());
					setVisible(false);

					new TelaJogo();
				}
			}
		

		
		if((e.getSource()==sairButton)){
			audio.botaoInicius();
                        System.exit(0);
                }
		if((e.getSource()==optionButton)){
			audio.botaoInicius();
			new TelaOpcoes();

		}

	}

}