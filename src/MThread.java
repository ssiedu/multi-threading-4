public class MThread extends Thread
{
public void run()
{
try
{
	String s=getName();
	System.out.println(s+"=>Statement-1");
	if(s.equals("BB"))
	{

		System.in.read();
	}
	System.out.println(s+"=>Statement-2");
	System.out.println(s+"=>Statement-3");
	System.out.println(s+"=>Statement-4");
}
catch(Exception e){}
}
public static void main(String args[]) throws Exception
{

	Thread tmp=Thread.currentThread();
	System.out.println(tmp.getName());
	System.out.println(tmp.getPriority());
	//tmp.stop();

/*
	MThread t1=new MThread(); t1.setName("AA");
	MThread t2=new MThread(); t2.setName("BB");
	MThread t3=new MThread(); t3.setName("CC");

	//t1.setPriority(Thread.MAX_PRIORITY);
	//t2.setPriority(Thread.MIN_PRIORITY);
	//t3.setPriority(Thread.NORM_PRIORITY);

	//System.out.println(t1.getPriority());
	//System.out.println(t2.getPriority());
	//System.out.println(t3.getPriority());

	t1.start();
	t2.start();
	t3.start();
	//t2.join();
	t2.join(25000);


	if(t2.isAlive())
	{
	System.out.println("Hello BB");
	}
	else
	{
	System.out.println("Goodbye BB");
	}

*/



	System.out.println("End-of-main");

}
}
/*
	void run()
	void start()
	void stop()
	void setName(String)
	String getName()
	void setPriority(int)
	int getPriority()
	static void sleep(long)
	void join()
	void join(long timeOutPeriod)
	boolean isAlive()
	static Thread currentThread()

	//returns the running thread object.


	
	




	1) extends Thread class.
	2) override the run method.
	3) create thread objects.
		(the object of a class which extends Thread.
		or
		directly thread instances)
	4) starts the Thread. (runnable)




*/