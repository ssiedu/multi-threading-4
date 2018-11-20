public class Passanger extends Thread {

    String name;
    int seatReq;
    static BusReservation bs=new BusReservation();

    public Passanger(String name, int seatReq) {
        super(name);
        this.name = name;
        this.seatReq = seatReq;
    }
    
    public void run(){
        bs.bookSeat(seatReq, name);
    }
    
    public static void main(String args[]) throws Exception {
        
        Passanger p1=new Passanger("AAA",2);
        Passanger p2=new Passanger("BBB",2);
        p1.start();
        p2.start();
        
    }
    
}