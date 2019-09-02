package Proxy.Gof;

import Proxy.Gof.classes.ProxyServer;
import Proxy.Gof.interfaces.Server;

public class ProxyClient {
	public static void main(String[] args) {
		/*Client can acess only the proxy server*/
		Server server = new ProxyServer();
		
		/*Client works with the same interface*/
		server.authenticate();
		server.get();
		server.post();
		server.put();
		server.delete();
		server.logout();
	}
}
