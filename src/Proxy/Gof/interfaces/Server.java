package Proxy.Gof.interfaces;

public interface Server {
	public void authenticate();
	public void get();
	public void post();
	public void put();
	public void delete();
	public void logout();
}
