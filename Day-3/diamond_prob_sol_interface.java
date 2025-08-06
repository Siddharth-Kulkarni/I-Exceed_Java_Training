/* Use of interface.super.DefaultMethod
 * when we have SAME DEFAULT methods in DIFFERENT INTERFACES we can access them using
 * "interface.super.DefaultMethod" inside main class as shown below!
 */


interface intcls1{
    void exe();
    default void disp(){
        System.out.println("From cls1");
    }
}

interface intcls2{
    default void disp(){
        System.out.println("From cls2");
    }
}

class imp implements intcls1,intcls2{
    public void exe(){
        System.out.println("Hey!");
    }
    public void disp(){
        System.out.println("From imp class!");
        intcls1.super.disp();
        intcls2.super.disp();
    }
}

public class diamond_prob_sol_interface {
    public static void main(String[] args) {
        imp obj=new imp();
        obj.exe();
        obj.disp();
    }
}
