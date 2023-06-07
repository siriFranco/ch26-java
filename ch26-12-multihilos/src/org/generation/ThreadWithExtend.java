package org.generation;

class Iteration extends Threads {
	this.name = name;
	
}
	
class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("IdThread " + super.getId() + "Obj" + super.getName() + ", iteration" + i);
		}
	}
}

	public class ThreadWithExtend {
	
	}
}