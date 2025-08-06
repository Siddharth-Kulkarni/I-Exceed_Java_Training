
abstract class anonyeg{
    abstract public void disp(String name,int age,String city);
}

public class anonymouscls{

    public static void main(String[] args) {
        anonyeg s=new anonyeg(){
            @Override
            public void disp(String name,int age,String city){
                System.out.println("Name : "+name);
                System.out.println("Age : "+age);
                System.out.println("City : "+city);
            }
        };
        s.disp("X",18,"Y");
    }
    
}
