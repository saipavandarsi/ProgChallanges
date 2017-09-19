package challenge1;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ExecutionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> producer = new ConcurrentLinkedQueue<Integer>();
		Queue<ResponseObj> consumer = new ConcurrentLinkedQueue<ResponseObj>();
		Thread t1 = new Thread(new Randomizer_Numbers(producer, consumer)) ;
		Thread t2 = new Thread(new FindPrime(producer, consumer));
		t1.start(); t2.start();
	}

}
