interface myInter1
{
     public void display();
 
     default void display1()
	{
	   System.out.println("Default method from interface");
	}
}
 
interface myInter2
{
    default void display1()
	{
	 System.out.println("Default method from interface2");
	}
}
 
 
class Inter implements myInter1,myInter2
{
    @Override
     public void display()
	{
	  System.out.println("display here");
	}
 
    public void display1()
	{
	   System.out.println("inside default");
	   myInter2.super.display1();
	   myInter1.super.display1();
	}
 
}
 
public class demointerface1
{
    public static void main(String asd[])
	{
	   Inter obj=new Inter();
	   obj.display();
	   obj.display1();
	} 
}