package Composite.RobsonCastilho.composite;

import java.util.ArrayList;
import java.util.List;

import Composite.RobsonCastilho.component.ElementoDoQuestionario;

public class Bloco extends ElementoDoQuestionario{

	public Bloco(String descricao) {
		super(descricao);
	}

	@Override
	public void Exibir() {
		System.out.println("Bloco: " + descricao); 
		for(ElementoDoQuestionario e : _elementos)
			e.Exibir();
	}

	public void Adicionar(ElementoDoQuestionario e) {
		_elementos.add(e);
	}
	
	public void Remover(ElementoDoQuestionario e) {
		_elementos.remove(e);
	}
	
	private List<ElementoDoQuestionario> _elementos = new ArrayList<ElementoDoQuestionario>();
}
