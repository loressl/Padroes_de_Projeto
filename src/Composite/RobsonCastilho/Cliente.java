package Composite.RobsonCastilho;

import Composite.RobsonCastilho.composite.Bloco;
import Composite.RobsonCastilho.leaf.Questao;

public class Cliente {

	public static void main(String[] args) {
		Bloco blocoA= new Bloco("A) Forma��o Educacional");
		Questao questao1 = new Questao("Qual sua forma��o?");
		Questao questao2 = new Questao("Pretende fazer alguma p�s-gradua��o?");
		
		blocoA.Adicionar(questao1);
		blocoA.Adicionar(questao2);
		
		Bloco blocoB= new Bloco("B) Habilidades");
		Bloco blocoB1= new Bloco("B1) Habilidades t�cnicas");
		Questao questao3 = new Questao("O que � SOLID?");
		
		blocoB1.Adicionar(questao3);
		blocoB.Adicionar(blocoB1);
		
		Bloco blocoRaiz = new Bloco("In�cio");
		blocoRaiz.Adicionar(blocoA);
		blocoRaiz.Adicionar(blocoB);
		
		blocoRaiz.Exibir();
	}

}
