package kosta.thread;

public class Customer extends Thread {
	private String threadName;
	private Manager m;
	
	public Customer() {}
	
	public Customer(String threadName, Manager m) {
		super();
		this.threadName = threadName;
		this.m = m;
	}

	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			m.pop(threadName);
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

}
