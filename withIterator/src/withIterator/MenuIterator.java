package withIterator;

public class MenuIterator implements Iterator<Food> {
	private Food[] menu;
	private int index;
	public MenuIterator(Food [] menu) {
		this.menu = menu;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if (index >= menu.length) return false;
		return true;
	}@Override
	public Food next() {
		if (hasNext())
		{
			Food food = menu[this.index];
			this.index++;
			return food;
		}
		return null;
	}
}
