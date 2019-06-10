import java.util.*;
public class vis {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	String s3=s.nextLine();
	String []a1=s1.split(" ");
	String []a2=s2.split(" ");
	String []a3=s3.split(" ");
	String h="";
	for(int i=0;i<a1.length-3;i++)
	{
		int flag=0;
		for(int j=0;j<a2.length-3;j++)
		{
			if(a1[i].compareTo(a2[j])==0&&a1[i+1].compareTo(a2[j+1])==0&&a1[i+2].compareTo(a2[j+2])==0)
			{
				flag++;
				break;
			}
		}
		for(int j=0;j<a3.length-3;j++)
		{
			if(a1[i].compareTo(a3[j])==0&&a1[i+1].compareTo(a3[j+1])==0&&a1[i+2].compareTo(a3[j+2])==0)
			{
				flag++;
				break;
			}
		}
		if(flag==2)
		{
			h+=a1[i]+" "+a1[i+1]+" "+a1[i+2];
			break;
		}
	}
	System.out.println(h);
	String []x1=s1.split(h);
	String []x2=s2.split(h);
	String []x3=s3.split(h);
	for(String  x:x1)
	{
		System.out.print(x);
	}
	System.out.print("\n");
	for(String  x:x2)
	{
		System.out.print(x);
	}
	System.out.print("\n");
	for(String  x:x3)
	{
		System.out.print(x);
	}
}
}
/*
Input: 

happy morning i am vishal periyasamy 
Hello i am vishal from rmd
hello i am vishal periyasamy
*/
/*
 Output:
  
 i am vishal ---> Fragment
 
 happy morning  periyasamy 
Hello  from rmd
hello  periyasamy
 */
