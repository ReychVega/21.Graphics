package Domain;

import java.awt.Color;
import java.awt.Graphics;

public class Enemigo2 extends Enemigo{

	public Enemigo2(double posX, double posY) {
		super(posX, posY);
	} // constructor

	@Override
	public void dibujar(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval((int)this.posX, (int)this.posY, 40, 40);
	} // dibujar

	public void mover() {
		this.posY+=0.03*this.direccion;
		if(this.posY<=0)
			this.direccion=1;
		if(this.posY>=560)
			this.direccion=-1;		
	}


} // fin clase
