public class TablePrinter
{
public static void main(String args[])
{
	TableTwo t1=new TableTwo(); t1.setName("Table-2");
	TableThree t2=new TableThree(); t2.setName("Table-3");
	TableFour t3=new TableFour(); t3.setName("Table-4");
	t1.start();
	t2.start();
	t3.start();
}
}