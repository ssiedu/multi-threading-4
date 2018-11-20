class A{}

public class RunnableDemo extends A implements Runnable{

public void run(){
    show();
}
public void show(){
    System.out.println("Statement-1");
    System.out.println("Statement-2");
    System.out.println("Statement-3");
    System.out.println("Statement-4");
}

public static void  main(String args[]) throws Exception {
    
    RunnableDemo ob1=new RunnableDemo();
    RunnableDemo ob2=new RunnableDemo();
    RunnableDemo ob3=new RunnableDemo();
    RunnableDemo ob4=new RunnableDemo();
    
    Thread t1=new Thread(ob1);
    Thread t2=new Thread(ob2);
    Thread t3=new Thread(ob3);
    Thread t4=new Thread(ob4);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    
   
}

}
