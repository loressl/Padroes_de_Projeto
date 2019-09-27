package Iterator.Use_a_cabeça.classes_iterator;

import java.util.ArrayList;

import Iterator.Use_a_cabeça.classes.MenuItem;
import Iterator.Use_a_cabeça.interfaces.Iterator;

public class PancakeHouseMenuIterator implements Iterator{
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	
	@Override
	public boolean hasNext() {
		if(position>=menuItems.size())
			return false;
		else
			return true;
	}
	
	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}
	
	private ArrayList<MenuItem> menuItems;
	private int position =0;

}
