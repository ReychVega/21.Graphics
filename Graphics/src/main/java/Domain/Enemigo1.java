package Domain;

import java.awt.Color;
import java.awt.Graphics;

public class Enemigo1 extends Enemigo{

	public Enemigo1(double posX, double posY) {
		super(posX, posY);
	} // constuctor

	@Override
	public void dibujar(Graphics g) {
		g.setColor(Color.black);
		g.fillOval((int)this.posX, (int)this.posY, 40, 40);
	} // dibujar


} // fin clase
