package Observer.brizeno.observers;

import java.text.DecimalFormat;

import Observer.brizeno.interfaces.DadosObserver;
import Observer.brizeno.subject.DadosSubject;

public class PorcentoObserver extends DadosObserver{

	public PorcentoObserver(DadosSubject subject) {
		super(subject);
	}

	@Override
	public void update() {
		int somaDosValores = subject.getState().getValorA() + subject.getState().getValorB()
                + subject.getState().getValorC();
        DecimalFormat formatador = new DecimalFormat("#.##");
        String porcentagemA = formatador.format((double) subject.getState().getValorA()
                / somaDosValores);
        String porcentagemB = formatador.format((double) subject.getState().getValorB()
                / somaDosValores);
        String porcentagemC = formatador.format((double) subject.getState().getValorC()
                / somaDosValores);
        System.out.println("Porcentagem:\nValor A: " + porcentagemA
                + "%\nValor B: " + porcentagemB + "%\nValor C: " + porcentagemC
                + "%");
		
	}

}
