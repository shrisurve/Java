import java.util.*;
public class reversearray
{
	static int[] reverse(int ...A)
	{
       int B[]=new int[A.length];
       for(int i=A.length-1,j=0;i>=0;i--,j++)
       {
       	B[j]=A[i];
       }
       return B;
	}
	public static void main(String[]args)
	{
		int A[]={2,3,6,4,5};
		System.out.println(reverse(A));

	}

}