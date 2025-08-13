import java.io.FileReader;
import java.io.File;
 
class fileinp
  {
    public static void main(String asd[]) throws Exception
	{
           int i=0;

           String s="C:\\Users\\Siddharth.Kulkarni\\Documents\\I-Exceed Java Training\\Day-8\\samp.txt";
	   File f=new File(s[0]);
	   FileReader fo=new FileReader(f);
 
	   while((i=fo.read())!=-1)
		{
	   	   System.out.print((char)i);
		}
	}
}