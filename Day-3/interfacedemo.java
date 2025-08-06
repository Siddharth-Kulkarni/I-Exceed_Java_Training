interface one
{
    public void methodfromone();
 
}
 
interface two extends one
{
    public void methodfromtwo();
}
 
class sample implements one,two
  {
     sample()
	{
 
	}
    @Override
     public void methodfromone(){
	 System.out.println("method from interface one");
	}
 
    @Override
     public void methodfromtwo(){
	System.out.println("method from interface two");
	}
}
 
class interfacedemo
{
    public static void main(String asd[])
	{
	   sample obj=new sample();
	   obj.methodfromone();
	   obj.methodfromtwo();	
	}
}