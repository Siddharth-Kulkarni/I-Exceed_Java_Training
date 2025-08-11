import java.io.File;
 
class fileio
{
    public static void main(String asd[]) throws Exception
	{
	  File f=new File("C:\\Users\\Siddharth.Kulkarni\\Documents\\I-Exceed Java Training\\Day-6\\synchro.java");
	  f.createNewFile();
	  System.out.println(f.isAbsolute());
	  System.out.println(f.getAbsolutePath());
	  boolean ex=f.exists();
	  System.out.println(ex);
	  if(ex)
		{
		   System.out.println("can Read?"+f.canRead());
		   System.out.println("can Write ?"+f.canWrite());
		}
 
	  f.delete();
	  System.out.println("is file is available?\t"+f.exists());
	}
}