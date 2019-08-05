package capgemini.concurrentpatterns;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor_Test_4 {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(1);
		Runnable task=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Executing task at:"+System.nanoTime());
			}
		};
		System.out.println("Scheduling task to be executed"+" "+"every 2 seconds with an initial delay of 0 seconds");
		scheduledExecutorService.scheduleAtFixedRate(task, 0, 2,TimeUnit.SECONDS);
	}

}
