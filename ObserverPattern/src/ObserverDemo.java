
public class ObserverDemo {

	public static void main(String[] args) {
		
		NewsSource nws = new NewsSource();
		ThisIsFakeNews cnn = new ThisIsFakeNews();
		
		BBC bbc = new BBC();
		BNT bnt = new BNT();
		
		bbc.subscribe(nws);
		bnt.subscribe(nws);
		
		nws.update();
	}

}
