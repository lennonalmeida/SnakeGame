/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Life {
	BufferedImage spriteSheet = ImageIO.read(new File("res/life.png"));   

	int largura = 30, tamanho = 28;
	int rows=1, columns=5;
	public int posX;

	public int posY;
	public BufferedImage[] sprites;
	public int aparencia=0;
	
	public Life( int posX, int posY) throws IOException {
		this.posX=posX;
		this.posY=posY;

		sprites = new BufferedImage[columns * rows];
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				sprites[(i * rows) + j] = spriteSheet.getSubimage(i * largura, j * tamanho, largura, tamanho);
			}
		}
		if(aparencia>=5){
			aparencia++;
		}
	}

}