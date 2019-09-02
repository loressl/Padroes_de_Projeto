package Proxy.Gof.classes;

import Proxy.Gof.interfaces.Server;

public class RealServer implements Server{

	@Override
	public void authenticate() {
		System.out.println("Logged into the Real Server");
	}

	@Override
	public void get() {
		System.out.println("Get command executed");
	}

	@Override
	public void post() {
		System.out.println("Post command executed");
	}

	@Override
	public void put() {
		System.out.println("Put command executed");
	}

	@Override
	public void delete() {
		System.out.println("Delete command executed");
	}

	@Override
	public void logout() {
		System.out.println("Logged out from the Real Server");
	}

}
