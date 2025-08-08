
import java.lang.reflect.Method;

class sampledemo{
    private String st ="HI";

    private void disp(){
        System.out.println("From outside the cls");
    }

}
public class pvtmemacess {
    public static void main(String[] args) throws Exception{
        
        Class c = Class.forName("sampledemo");
        Object o=c.newInstance();
        Method m1=c.getDeclaredMethod("disp");
        m1.setAccessible(true);
        m1.invoke(o);
    }

}
