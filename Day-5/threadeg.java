
class eg1 extends Thread{
    public void run(){
        System.out.println("From thread");
    }
}
public class threadeg {
    public static void main(String[] args) {
        eg1 thr1=new eg1();
        eg1 thr2=new eg1();
        thr1.start();
        thr2.start();
    }    
}
