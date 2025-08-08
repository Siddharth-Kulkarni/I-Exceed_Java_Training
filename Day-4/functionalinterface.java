
interface fnc{
    public void disp();
}

public class functionalinterface {
    public static void main(String[] args) {

        fnc funcint=new fnc(){
            @Override
            public void disp(){
                System.out.println("Funcltional Interface");
            }
        };
        funcint.disp();

    }
}
