public interface Observer {

	default void subscribe(Observable subject){
		subject.addSubscriber(this);
	}
	default void unsubscribe(Observable subject){
		subject.removeSubscriber(this);
	}
	
	void react();
	
}
