
public class player {
	//Adds Item to inventory 
	public void addItemToInv(String name) {
	for (int i= 0;  i < inv.length; i++) {
		if (inv[i] == "") {
			inv[i] = name;
			System.out.println("You have added:" + name + ".");
			return;
		}
	}
	System.out.println("You Have no room in your inventory");
}
	//prints inventory
	public void printInv() {
		for(String x: inv) {
			System.out.println(x);
		}
	}
	//removes item from inventory
	public void removeItemFromInv(String name) {
		for(int i=0; i<inv.length; i++) {
			if(inv[i].equals(name)) {
				inv[i]="";
			}
		}
		System.out.println("Item removed");
	}
	
	
	private static String inv[] = {"","","","",""};

}
