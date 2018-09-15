import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements  Runnable{

		@Override
		public void run() {
			System.out.println("Thread running from pool");
			
		}
		public static void main(String[] args) {
			ThreadPool rable = new ThreadPool();
			
			//Executor pool = Executors.newFixedThreadPool(10);
			ExecutorService service = Executors.newFixedThreadPool(10);
			for (int c = 1; c <=20; c++) 
				service.execute(rable);
			
				service.shutdown();
				
			}
		}

		
