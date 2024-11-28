 public class demo extends Thread{
	public void run(){
	 for(int i=1;i<5;i++){
// the thread will sleep for the 500 milli seconds   
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e){
			System.out.println(e);
			}
		System.out.println(i);
		}
	}

public static void main(String args[]){
	demo t1=new demo();
	demo t2=new demo();

  	t1.start();
  	t2.start();
  }
}