package threadingexamples;
public class Emp extends Thread {
    private int eno,sal;
    
    public static void main(String[] args) {
        Emp e1=new Emp(111,10000);
        Emp e2=new Emp(112,20000);
        Emp e3=new Emp(113,30000);
        Emp e4=new Emp(114,40000);
        e1.start();
        e2.start();
        e3.start();
        e4.start();
    }
    public void run(){
        calculate();
    }
    public void calculate(){
    try{
        System.out.println("HRA of "+eno+" is "+(sal*20/100));
        if(eno==112){
            System.in.read();
        }
        System.out.println("CA of  "+eno+" is "+(sal*10/100));
        System.out.println("MA of  "+eno+" is "+(sal*5/100));
    }catch(Exception e){}
    }
    public Emp(int a, int b){
        eno=a; sal=b;
    }


    
}
