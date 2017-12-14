
public class Liste {
	static ListenElement start;

	public Liste() {
		start = new ListenElement("Erstes Element");
	}

	public void insertLast(String s) {
		ListenElement newEle = Liste.start;
		while (newEle.next != null) {
			newEle = newEle.next;
		}
		newEle.next = new ListenElement(s);
	}

	public void insertFirst(String s) {
		ListenElement newEle = new ListenElement(s);
		newEle.next = Liste.start;
		Liste.start = newEle;

	}

	public void deleteLast() {
		ListenElement Ele = Liste.start;
		while (Ele.next.next != null) { // weil ich auf das vorherige element
										// zugreifen muss und nicht auf das
										// letze
			Ele = Ele.next;
		}
		Ele.next = null;
	}

	public void deleteFirst() {
		Liste.start = Liste.start.next;
	}

	public void deleteMiddle(int i) {
		ListenElement Ele = Liste.start;
		int a = 1;
		while (a < i && Ele.next != null) {
			Ele = Ele.next;
			a++;
		}
		if (Ele.next != null) {
			Ele.next = Ele.next.next;
		}
	}

	public void listeAusgeben() {
		ListenElement Ele = Liste.start;
		while (Ele.next != null) {
			System.out.print(Ele.s);
			Ele = Ele.next;
		}
		System.out.println(Ele.s);
	}

	public static void main(String[] args) {
		Liste a = new Liste();
		a.start = new ListenElement("a");
		a.insertLast("b");
		a.insertLast("c");
		a.insertLast("d");
		System.out.println("Die Liste lautet:");
		a.listeAusgeben();
		System.out.println("\nu an die letzte Stelle setzen:");
		a.insertLast("u");
		a.listeAusgeben();
		System.out.println("\nn an die erste Stelle setzen:");
		a.insertFirst("n");
		a.listeAusgeben();
		System.out.println("\nLetzte Stelle löschen:");
		a.deleteLast();
		a.listeAusgeben();
		System.out.println("\nErste Stelle löschen:");
		a.deleteFirst();
		a.listeAusgeben();
		System.out.println("\nZweites Element löschen:");
		a.deleteMiddle(2);
		a.listeAusgeben();

	}

}
