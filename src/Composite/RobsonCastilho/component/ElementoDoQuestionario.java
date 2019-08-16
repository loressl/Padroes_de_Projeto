package Composite.RobsonCastilho.component;

public abstract class ElementoDoQuestionario {
	
	public ElementoDoQuestionario(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract void Exibir();
	
	protected String descricao;
}
