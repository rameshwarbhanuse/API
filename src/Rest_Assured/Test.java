package Rest_Assured;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String arr[]= {"reverse","twice","three"};
	
	String temp,temporary = "";
	String res[]=new String[arr.length];
	
	for(int i=0;i<arr.length;i++)
	{
		temp=arr[i];
		
		for(int j=temp.length()-1;j>=0;j--)
		{
			temporary=temporary+temp.charAt(j);
		}
		
	  res[i]=temporary;
	  temporary="";
	}
	

		System.out.println(Arrays.toString(res));
	
	
	}
}


