class TableThree extends Thread
{
public void run()
{
	String s=getName();
	for(int i=1; i<=10; i++)
	{
		System.out.println(s+"=>"+(i*3));
	}
}
}