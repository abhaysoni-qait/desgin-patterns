package singleton;

public class ThreadSafeSingleton {
	
//	we make this variale volatile because we want that when one thread changes its value. it should be visible 
//	by other threads too and more than one thread can access it altogether
	private volatile static ThreadSafeSingleton obj; 

	private ThreadSafeSingleton() {
		// we make this constructor private so one from outside can create
				// instance of this class
	} 

	public static ThreadSafeSingleton getInstance() 
	{ 
//		checking if obj is initialized or not
		if (obj == null) 
		{ 
			// To make thread safe 
			synchronized (ThreadSafeSingleton.class) 
			{ 
//				as the above method is not syncronized but it is important that this block is 
//				syncronized as multiple thread can reach this block if they called the method at the same
//				time
				if (obj==null) 
					obj = new ThreadSafeSingleton(); 
			} 
		} 
		return obj; 
	} 
}
