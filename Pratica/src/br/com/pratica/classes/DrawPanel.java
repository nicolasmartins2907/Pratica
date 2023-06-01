package br.com.pratica.classes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g) 
	{
		// chama paintComponent para assegurar que o painel � exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); // largura total
		int heigth = getHeight(); // altura total
		
		// desenha uma linha a partir do canto superior esquerdo at� o inferior direito
		g.drawLine(0, 0, width, heigth);
		
		// desenha uma linha a partir do canto inferior esquerdo ate o superior direito
		g.drawLine(0, heigth, width, 0);
	}
	

} //fim da classe DrawPanel 
