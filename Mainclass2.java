package com.jspider.p11;

import java.util.Arrays;

public class Mainclass2 {
  public static void main(String[] args) {
	  int []a= {0,1,2,3,0,4,7,8,13,5,21,22,58};
	  
	  int []b=mergearray(a);
	  System.out.println(Arrays.toString(b));
	  
}
  public static int[] mergearray(int [] arr1) {
	  //int[] res=new int[arr1.length];
	  int a=arr1[arr1.length-1];
	  
	  for (int i = arr1.length-1; i>0; i--) {
		 if(i>0) 
		 { arr1[i]=arr1[i-1];
		  //x--;
	      }
	  }
	  arr1[0]=a;
	  //System.out.println(Arrays.hashCode(arr1));
		return arr1;
  }
}