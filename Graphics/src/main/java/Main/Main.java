package Main;

import javax.swing.JFrame;
import GUI.MyPanel;



public class Main {

	public static void main(String[] args) {

            //creamos nuestro frame
		JFrame ventana=new JFrame();
                
            //se configuran algunas propiedades.     
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		
            //Aquí se agrega un nuevo panel a la ventana. El panel es una instancia de la clase MyPanel
		ventana.add(new MyPanel());
                
            //Con pack(), se ajusta automáticamente el tamaño de la ventana para que quepa exactamente el contenido que contiene
		ventana.pack();
		
		ventana.setLocationRelativeTo(null);
		
		ventana.setVisible(true);
		
		
	} // main

} // fin clase

