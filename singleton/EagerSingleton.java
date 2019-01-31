package singleton;

public class EagerSingleton {
	//we make it private so no one can directly access it 
	//and static for safety

	private static EagerSingleton eagerSingletonObj = new EagerSingleton();

	private EagerSingleton() {
		// we make this constructor private so one from outside can create
		// instance of this class
	}

	public EagerSingleton getInstance() {
			return eagerSingletonObj;
	}
}
