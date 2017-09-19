package challenge1;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Randomizer_Numbers implements Runnable{
	
	Queue<Integer> producer = new ConcurrentLinkedQueue<Integer>();
	Queue<ResponseObj> consumer = new ConcurrentLinkedQueue<ResponseObj>();
	
	public Randomizer_Numbers(final Queue<Integer> producer,final Queue<ResponseObj> consumer ) { 
		this.producer = producer;
		this.consumer = consumer;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Execution for Queue up in class <" +this.getClass().getName() + ">");
		try {
			Random r = new Random();
			int min = 10; int max = 100;
			int range = max - min + 1;
			for (int i =0 ; i< 20; i++){
				int randomnumb = r.nextInt(range);
				System.out.println("Randomizer random number is -- "+randomnumb);
				producer.add(randomnumb);
				System.out.println("randomnumber" + randomnumb + " is added to Producer\n");
			}
			printfinaloutput();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private void printfinaloutput() {
		// TODO Auto-generated method stub
		for (int j=0; j< consumer.size() ; j++){
			ResponseObj resp = consumer.poll();
			System.out.println("Object number is =" + resp.getNumber());
			if(resp.isIsprime()) 
				System.out.println(resp.getNumber() + "Is a prime number\n");
			else
				System.out.println(resp.getNumber() + "Is not a prime number\n");
		}
		
	}

}
