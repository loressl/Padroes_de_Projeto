package Composite.SlideShare.composite;

import java.util.ArrayList;
import java.util.List;

import Composite.SlideShare.interfaces.Grafico;

public class Foto extends Grafico{
	
	public Foto() {
		this.graficos = new ArrayList<Grafico>();
	}
	
	@Override
	public void adicionar(Grafico grafico) {
		if(grafico != null)
			this.graficos.add(grafico);
	}
	
	@Override
	public void remover(Grafico grafico) {
		if(!this.graficos.isEmpty())
			this.graficos.remove(grafico);
	}
	
	@Override
	public Grafico getChild(int i) {
		if(!this.graficos.isEmpty() && i >=0)
			return this.graficos.get(i);
		throw new UnsupportedOperationException("Operação não suportada!!");
	}
	
	@Override
	public void desenhar() {
		for(Grafico grafico: this.graficos)
			grafico.desenhar();
	}
	
	private List<Grafico> graficos;
}
