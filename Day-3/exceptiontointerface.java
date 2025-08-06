
/*Using default variable we r able to execute 
the methods inside interface as well which is not possible 
execute without it in interface*/


interface cls1{
    void disp();
}
interface cls2{
    default void disp2(){
        System.out.println("From default");
    }
}
class main implements cls1,cls2{
        public void disp(){
            System.out.println("From cls1");
        }
}
public class exceptiontointerface {
    public static void main(String[] args) {
        main obj=new main();
        obj.disp();
        obj.disp2();
    }    
}
