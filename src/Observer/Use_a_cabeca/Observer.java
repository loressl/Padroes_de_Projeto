package Observer.Use_a_cabeca;
/**
 * 
 * � implementada por todos os observadores, logo todos eles tem que implementar o m�todo update
 *
 */
public interface Observer {
	
	public void update(float temp, float humidity, float pressure);
}
