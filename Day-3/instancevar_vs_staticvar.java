
/*Instance Method Vs Static Method */

class eg{
    int i=10;
    static int j=20;

/*In instance method v can access both vars */

    public void disp(){
        System.out.println("i=: "+i);
        System.out.println("j=: "+j);
    }

/*In  static method v cannot access instance vars*/
    static void disp1(){
        eg togeti=new eg();
        System.out.println("i=: "+ togeti.i);
        System.out.println("j=: "+j);
    }

/*If we dont want to create an obj inside static and though access the
insatnce variable from static method then v can just pass the object created in
the main method to the static method and use that object as shown below 
 * 
 */
    /*static void disp1(eg obj){
        eg togeti=new eg();
        System.out.println("i=: "+ obj.i);
        System.out.println("j=: "+j);
    } */
}

public class instancevar_vs_staticvar {
    public static void main(String[] args) {
        eg obj=new eg();
        obj.disp();
        //eg.disp1(obj);  if we dont want to create an obj inside static method then use this
    }
}
