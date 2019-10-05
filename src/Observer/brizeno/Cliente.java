package Observer.brizeno;

import Observer.brizeno.classes.Dados;
import Observer.brizeno.observers.PorcentoObserver;
import Observer.brizeno.observers.TabelaObserver;
import Observer.brizeno.subject.DadosSubject;

public class Cliente {

	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		dados.attach(new TabelaObserver(dados));
		dados.attach(new PorcentoObserver(dados));

		dados.setState(new Dados(7, 3, 1));
		dados.setState(new Dados(2, 3, 1));
	}

}
