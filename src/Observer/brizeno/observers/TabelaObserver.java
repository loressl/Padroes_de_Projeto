package Observer.brizeno.observers;

import Observer.brizeno.interfaces.DadosObserver;
import Observer.brizeno.subject.DadosSubject;

public class TabelaObserver extends DadosObserver{

	public TabelaObserver(DadosSubject subject) {
		super(subject);
	}

	@Override
	public void update() {
	     System.out.println("Tabela:\nValor A: " + subject.getState().getValorA()
	                + "\nValor B: " + subject.getState().getValorB() + "\nValor C: "
	                + subject.getState().getValorC());
	}

}
