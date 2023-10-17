package j05_singleton;
public class Singleton {

	private volatile static Singleton instance = null;
	
	private Singleton() {
		System.out.println("Singleton constructor");
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class){
				if(instance == null){
					instance = new Singleton();
				}
			}
        }
		return instance;
	}

	
	public void print() {
		System.out.println("Singleton instance hashCode = " + instance.hashCode());
	}
}
