
public class main {
public static void main (String args[]) {
	player  p = new player();
	p.addItemToInv("Spicy Ramen");
	p.printInv(); 
	p.removeItemFromInv("Spicy Ramen");
	p.printInv();
	p.addItemToInv("Frumious Blue Shader");
	p.addItemToInv("Legendary Engram");
	p.addItemToInv("MIDA Multi-Tool");
	p.addItemToInv("Fireteam Medallion");
	p.printInv();
	p.removeItemFromInv("Fireteam Medallion");
	p.printInv();
	p.addItemToInv("Zavala Action Snacks");
	p.printInv();
	}
}
