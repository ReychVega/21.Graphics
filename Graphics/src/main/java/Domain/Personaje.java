package Domain;

import java.awt.Color;
import java.awt.Graphics;

public class Personaje {

	private int posX;
	private int posY;
	private int vida;
	
	private int cantidaBalas;
	
	public Personaje() {
		this.posX=0;
		this.posY=0;
		this.vida=100;
		this.cantidaBalas=10;
	} // constructor
	
	public Personaje(int posX, int posY) {
		this.posX=posX;
		this.posY=posY;
		this.vida=100;
		this.cantidaBalas=10;
	} // constructor	
	
        
        /*
         Este método disparar es utilizado para que el personaje dispare una bala. Si el personaje 
         tiene balas disponibles (cantidaBalas > 0), decrementa la cantidad de balas en 1 y devuelve 
         una nueva instancia de Bala ubicada en una posición ligeramente adelante y arriba del personaje 
        (this.posX + 40, this.posY + 15). Si no hay balas disponibles, retorna null.*/
	public Bala disparar() {//a la derecha
		if(this.cantidaBalas>0) {
			this.cantidaBalas=this.cantidaBalas-1;
			return new Bala(this.posX+40, this.posY+15);
		}
		return null;
	} // disparar

	public void dibujar(Graphics g) {
		g.setColor(new Color(221, 27, 18));
		g.fillOval(this.posX, this.posY, 40, 40);
		g.setColor(Color.white);
		g.drawString(this.vida+"", this.posX+10, this.posY+25);
	} // dibujar
	
	public void atacar() {}
	
        
        /*
        Estos métodos son utilizados para mover al personaje en diferentes 
        direcciones. Cada método ajusta las coordenadas posX o posY del personaje en una cantidad específica (4 píxeles) para desplazarlo hacia la derecha, izquierda, arriba o abajo.
        */
	public void moverDerecha() {
		this.posX+=4;
	}
	
	public void moverIzquierda() {
		this.posX-=4;
	}
	
	public void moverArriba() {
		this.posY-=4;
	}
	
	public void moverAbajo() {
		this.posY+=4;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	
} // fin clase
