class supercls{
    supercls(){

    }
    public void display(){
        System.out.println("From Super cls");
    }
}
class base1 extends supercls{
    base1(){

    }
    public void display(){
        System.out.print("From base cls");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        supercls ref;
        supercls objsuper=new supercls();
        base1 objbase=new base1(); 
        //ref=objsuper;//when ref is obj of super cls then super cls executes
        ref=objbase;//when ref is obj of base cls then base cls executes 
        ref.display();
    }
}
