
public class ObserverDemo {

	public static void main(String[] args) {

		NewsSource nws = new NewsSource();
		ThisIsFakeNews cnn = new ThisIsFakeNews();

		BBC bbc = new BBC();
		BNT bnt = new BNT();

		bbc.subscribe(nws);
		bnt.subscribe(nws);

		nws.update();

		System.out.println("a".hashCode());
		System.out.println("b".hashCode());
		System.out.println("c".hashCode());
		System.out.println("d".hashCode());
		System.out.println("e".hashCode());
		System.out.println("f".hashCode());
		System.out.println("g".hashCode());
		System.out.println("h".hashCode());
		System.out.println("i".hashCode());
		System.out.println();
		System.out.println("aa".hashCode());
		System.out.println("ab".hashCode());

	
	
	}

}
