package hoang;

public class CartTest {
	public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart(0);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king", "Animation", "Roger Aliers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geore Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Geore Lucas", 87, 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		//Test the print method
		cart.searchDVDById(1);
		//To-do: Test the search methods here
	}
}