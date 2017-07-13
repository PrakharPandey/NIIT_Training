
public class Threading implements Runnable {

	private Thread t;
	private String threadName;

	public Threading(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread: " + threadName + " interrupted.");
		}
		System.out.println("Thread: " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public static void main(String[] args) {
		Threading tt = new Threading("Thread-1");
		tt.run();
		Threading t1 = new Threading("Thread-2");
		t1.start();
	}

}
