package challenge1;

import java.util.Queue;

public class FindPrime implements Runnable{

	Queue<Integer> producer;
	Queue<ResponseObj> consumer;
	
	FindPrime(Queue<Integer> producer, Queue<ResponseObj> consumer) {
		this.producer = producer;
		this.consumer = consumer;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Execution for Finding Primenumber in class <" + this.getClass().getName() + ">");
		try {
			int number;
			ResponseObj resp;
			for(int i=0;i<20; i++){
				while(!producer.isEmpty()) {
					number = producer.poll();
					resp = new ResponseObj(number, isprimeNum(number));
					consumer.add(resp);
				}
				Thread.currentThread().sleep(1000);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

	private boolean isprimeNum(int number) {
		// TODO Auto-generated method stub
		int count = 0;

		if(number <= 2) {
			return false; 
		}
		if(number > 2 && number %2 ==0) {
			count ++;
		}
		int max = (int) Math.sqrt(number);
		for(int i = 3; i<max ; i++){
			if(number % i == 0) return false; break;
		}
		
		return true;
	}

}
