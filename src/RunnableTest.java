
import java.util.logging.Level;
import java.util.logging.Logger;

class X implements Runnable{
    public void run(){
       for(int i=1;i<=10;i++){
           System.out.println(i);
           try {
               Thread.sleep(100);
           } catch (Exception ex) {
               
           }
       } 
    }
}
class Y implements Runnable{
    public void run(){
        for(int i=101;i<=110;i++){
            System.out.println(i);
                       try {
               Thread.sleep(100);
           } catch (Exception ex) {
               
           }

        }
    }
}
class Z implements Runnable{
    public void run(){
        for(int i=201;i<=210;i++){
            System.out.println(i);
                       try {
               Thread.sleep(100);
           } catch (Exception ex) {
               
           }

        }
    }
}


public class RunnableTest {
public static void main(String[] args) {
   
    Thread t1=new Thread(new X());
    Thread t2=new Thread(new Y());
    Thread t3=new Thread(new Z());

    t1.start(); t2.start(); t3.start();
    
}
    
}
