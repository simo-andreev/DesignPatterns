import java.util.HashSet;

public class NewsSource implements Observable {

	HashSet<Observer> observers = new HashSet<>();

	@Override
	public void addSubscriber(Observer observer) {
		this.observers.add(observer);

	}

	@Override
	public void removeSubscriber(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void update() {
		for (Observer observer : observers) {
			observer.react();
		}
	}

}