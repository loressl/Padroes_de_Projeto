package Adapter.Use_a_Cabeca;

public class TurkeyAdapter implements Duck{
	//objeto adaptado ao pato
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
		
	}

	@Override
	public void fly() {
		//como o peru voa a curta dist�ncia, implementa o for
		//para compensar o v�o do pato
		for(int i=0; i< 5; i++)
			turkey.fly();
		
	}

}
