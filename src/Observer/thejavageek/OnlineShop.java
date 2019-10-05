package Observer.thejavageek;

import Observer.thejavageek.observer.PrivilegedBuyer;
import Observer.thejavageek.observer.RegularBuyer;
import Observer.thejavageek.subject.Product;

//http://www.thejavageek.com/2016/08/04/observer-pattern-implementation/
public class OnlineShop {

	public static void main(String[] args) {
		Product product = new Product();
		RegularBuyer regularBuyer= new RegularBuyer(product);
		PrivilegedBuyer privilegedBuyer = new PrivilegedBuyer(product);
		
		product.setPrice(10000);
		regularBuyer.unSubscribe();
		System.out.println();
		product.setPrice(15000);
	}

}
