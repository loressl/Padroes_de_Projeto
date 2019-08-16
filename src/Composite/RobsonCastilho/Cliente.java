package Composite.RobsonCastilho;

import Composite.RobsonCastilho.composite.Bloco;
import Composite.RobsonCastilho.leaf.Questao;

public class Cliente {

	public static void main(String[] args) {
		Bloco blocoA= new Bloco("A) Formação Educacional");
		Questao questao1 = new Questao("Qual sua formação?");
		Questao questao2 = new Questao("Pretende fazer alguma pós-graduação?");
		
		blocoA.Adicionar(questao1);
		blocoA.Adicionar(questao2);
		
		Bloco blocoB= new Bloco("B) Habilidades");
		Bloco blocoB1= new Bloco("B1) Habilidades técnicas");
		Questao questao3 = new Questao("O que é SOLID?");
		
		blocoB1.Adicionar(questao3);
		blocoB.Adicionar(blocoB1);
		
		Bloco blocoRaiz = new Bloco("Início");
		blocoRaiz.Adicionar(blocoA);
		blocoRaiz.Adicionar(blocoB);
		
		blocoRaiz.Exibir();
	}

}
