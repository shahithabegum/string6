import java.util.*;
import java.lang.*;
class se6
{
  public static void main(String arg[])
   {
     try
         {
            String s="this is excerise";
            String s1="This Excerise";
	StringBuffer sb=new StringBuffer(s);
	    System.out.println(s.contentEquals(sb));
	  
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}