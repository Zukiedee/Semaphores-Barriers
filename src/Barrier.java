import java.util.concurrent.Semaphore;

public class Barrier {
	Semaphore barrier;
	Semaphore mutex;
	int count;					// counter for number of threads 
	int size;					// size of barrier
	
	Barrier(int n) {
		this.mutex = new Semaphore(1); 
		this.barrier = new Semaphore(0); 
		this.size = n;
		this.count = 0;
	}
	
	public void b_wait() throws InterruptedException{
			
		mutex.acquire();
		count += 1;
		mutex.release();

		// checks if barrier is full and release the barrier if it is
		if (count == size) {
			barrier.release();
		}
			
		//release threads and decrement counter	
		barrier.acquire(); 
		barrier.release();	
	}
}
