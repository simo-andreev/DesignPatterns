
public class MySingletonDemo {

	public static void main(String[] args) {


		MySingleton sng = MySingleton.getInstance("KKKK");
		MySingleton snh = MySingleton.getInstance("lllll");
		
		System.out.println(sng == snh);
		System.out.println(sng.equals(snh));
		System.out.println(sng.getName() +"////"+ snh.getName());
		System.out.println(sng.hashCode() +"\n"+ snh.hashCode());
		
		
	}

}