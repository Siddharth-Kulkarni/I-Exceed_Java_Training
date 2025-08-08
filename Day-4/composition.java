class car2
  {
    private final engine eng;
     String nameofcar,model;
     car2(String nameofcar,String model)
	{
	   eng=new engine("power");
	   this.nameofcar=nameofcar;
	   this.model=model;
	}
 
     public void displayCar()
	{
	  System.out.println("Name of car"+nameofcar);
	  System.out.println("Model="+model);
	  eng.displayEngine();
	}
  }
 
 
class engine
  {
     String typeofengine;
     engine(String typeofengine)
	{
	  this.typeofengine=typeofengine;
	}
 
     public void displayEngine()
	{
	  System.out.println("Type of engine"+typeofengine);
	}
  }
 
public class composition
  {
    static public void main(String asd[])
	{
	     car2 c=new car2("scorpio","vlx");
		c.displayCar();
	}
  }