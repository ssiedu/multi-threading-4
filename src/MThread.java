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
	MThread t1=new MThread(); t1.setName("AA");
	MThread t2=new MThread(); t2.setName("BB");
	MThread t3=new MThread(); t3.setName("CC");
	t1.start();
	t2.start();
	t3.start();
	System.out.println("End-of-main");

}
}
/*
	1) extends Thread class.
	2) override the run method.
	3) create thread objects.
		(the object of a class which extends Thread.
		or
		directly thread instances)
	4) starts the Thread. (runnable)




*/