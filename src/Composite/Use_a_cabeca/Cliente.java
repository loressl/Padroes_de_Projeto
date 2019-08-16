package Composite.Use_a_cabeca;

import Composite.Use_a_cabeca.composite.CompositeGraphic;
import Composite.Use_a_cabeca.leaf.Ellipse;

public class Cliente {

	public static void main(String[] args) {

		// Inicializa quatro elipses
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse();
		Ellipse ellipse3 = new Ellipse();
		Ellipse ellipse4 = new Ellipse();

		// Inicializa tres componentes do grafico.
		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();
		
		//Faz o grafico
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);
        
        graphic2.add(ellipse4);
        
        graphic.add(graphic1);
        graphic.add(graphic2);
       // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();
	}

}
