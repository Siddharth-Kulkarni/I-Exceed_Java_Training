import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
 
class fileinp3
{
   public static void main(String asd[]) throws Exception
	{
	   FileOutputStream fout=new FileOutputStream("sample2.txt");
       String str="this is the content which is  embed into sample1";
	   byte bystr[]=str.getBytes();
	   fout.write(bystr);
	   fout.close();
 
	   BufferedInputStream bin=new BufferedInputStream(new FileInputStream("sample2.txt"));
           int i=0;
	    while((i=bin.read())!=-1)
		System.out.print((char)i);
 
	   

	}
}