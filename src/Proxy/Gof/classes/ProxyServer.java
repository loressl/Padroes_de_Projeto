package Proxy.Gof.classes;

import Proxy.Gof.interfaces.Server;

public class ProxyServer implements Server{

	public ProxyServer() {
		this.realServer = new RealServer();
		sessionActive = false;
	}
	
	@Override
	public void authenticate() {
		/* Get the user credentials and login*/
		realServer.authenticate();
		
		/*Track the session*/
		sessionActive = true;
	}

	@Override
	public void get() {
		if(sessionActive)
			realServer.get();
		else
			System.out.println("Invalid Session");
	}

	@Override
	public void post() {
		if(sessionActive)
			realServer.post();
		else
			System.out.println("Invalid Session");
	}

	@Override
	public void put() {
		if(sessionActive)
			realServer.put();
		else
			System.out.println("Invalid Session");
	}

	@Override
	public void delete() {
		if(sessionActive)
			realServer.delete();
		else
			System.out.println("Invalid Session");
	}

	@Override
	public void logout() {
		realServer.logout();
		
		/*Deactivate the session*/
		sessionActive = false;
	}
	
	/*Reference to RealServer*/
	private RealServer realServer;
	private boolean sessionActive;

}
