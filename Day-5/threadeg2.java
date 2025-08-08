class eg2 extends Thread
{
    public void run()
	{
	  for(var i=0;i<10;i++)
	   {
	     try{
	      System.out.println(i);
	      new Thread(this).sleep(1000);
	     }catch(Exception d){}
	   }
 
	}
}
 
class threadeg2
{
    public static void main(String ads[]) throws InterruptedException
	{
	   eg2 obj=new eg2();
	   obj.start();
	   for(var i=0;i<10;i++)
		{	
		   System.out.println("main\t"+i);
		   Thread.currentThread().sleep(1000);
		}
 
	}
}