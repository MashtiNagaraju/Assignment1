package Assignment1;

public class MyThread extends Thread
{
	public void run()
	{
		System.out.println("concurrent thread started running..");
}
	public static void main( String args[] )
	{
		MyThread mt = new  MyThread();
		mt.start();
	}
}

//Enter MyRunnableThread in class name, check the checkbox �public static void main(String[] args)�, and click on �Finish.�



 class MyRunnableThread implements Runnable{

    public static int myCount = 0;
    public MyRunnableThread(){

    }
    public void run() {
while(MyRunnableThread.myCount<= 10){
try{
System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
Thread.sleep(100);
            } catch (InterruptedException iex) {
System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String args[]){
System.out.println("Starting Main Thread...");
MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
t.start();
while(MyRunnableThread.myCount<= 10){
try{
System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
Thread.sleep(100);
            } catch (InterruptedException iex){
System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
System.out.println("End of Main Thread...");
    }
}
