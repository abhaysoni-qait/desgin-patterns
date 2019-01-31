package singleton;

public class LazySingleton {
	//we make it private so no one can directly access it 
	//and static for safety

	private static LazySingleton lazySingletonObj = null;

	private LazySingleton() {
		// we make this constructor private so one from outside can create
		// instance of this class
	}

	public LazySingleton getInstance() {
		if(lazySingletonObj==null) {
			lazySingletonObj=new LazySingleton();
		}
		return lazySingletonObj;
	}

}
