package capgemini.threads;

public class CreatingMultipleThread {

	public static void main(String[] args) {
		System.out.println("CreatingMultipleThread->started...");
		/*for(int i=0;i<10;i++){
		 * new Thread("Thread-"+i+":"){
		 * public void run(){
		 * System.out.prinrln(getName()+"running");
		 * }
		 * 
		 * */
		for(int i=0;i<10;i++){
			Thread thread=new Thread("Thread-"+i+":"){
				public void run(){
					System.out.println(getName()+"running");
				}
			};
			thread.start();
			try{
				thread.join();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("CreatingMultipleThread->ended..");
	}

}
