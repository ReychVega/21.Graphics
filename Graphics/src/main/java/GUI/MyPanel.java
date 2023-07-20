package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import Domain.Bala;
import Domain.Enemigo;
import Domain.Enemigo1;
import Domain.Enemigo2;
import Domain.Enemigo3;
import Domain.Juego;
import Domain.Personaje;

public class MyPanel extends JPanel implements KeyListener, MouseListener{

	// atributos
	private Juego juego;
	
	
	public MyPanel() {
		this.setPreferredSize(new Dimension(800, 600));
		this.setFocusable(true);
		this.setRequestFocusEnabled(true);
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.juego=new Juego();
		
	} // constructor
	
	// metodos
	
	public void paintComponent(Graphics g) {
		
		g.setColor(new Color(39, 177, 30));
		g.fillRect(0, 0, 800, 600);
		
		this.juego.dibujar(g);
		this.juego.actualizar();
		
		repaint();
		
	} // paintComponent

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			this.juego.moverDerecha();
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
			this.juego.getPersonaje().moverIzquierda();
		if(e.getKeyCode()==KeyEvent.VK_UP)
			this.juego.getPersonaje().moverArriba();
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
			this.juego.getPersonaje().moverAbajo();
			
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.juego.disparar();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
} // fin clase
