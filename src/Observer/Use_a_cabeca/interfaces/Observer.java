package Observer.Use_a_cabeca.interfaces;
/**
 * 
 * é implementada por todos os observadores, logo todos eles tem que implementar o método update
 *
 */
public interface Observer {
	
	public void update(float temp, float humidity, float pressure);
}
