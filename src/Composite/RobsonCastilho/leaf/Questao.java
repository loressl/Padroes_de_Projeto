package Composite.RobsonCastilho.leaf;

import Composite.RobsonCastilho.component.ElementoDoQuestionario;

public class Questao extends ElementoDoQuestionario{

	public Questao(String descricao) {
		super(descricao);
	}

	@Override
	public void Exibir() {
		System.out.println("Questão: " + descricao);
	}

}
