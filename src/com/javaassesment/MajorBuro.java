package com.javaassesment;
import java.util.Scanner;

class BoyerMooreVoting
{
 
  public int findMajority(int[] arrs,int n)
  {
    int count = 0, candidate = -1;
 
    // Finding majority candidate
    for (int i = 0; i < n; i++) {
      if (count == 0) {
        candidate = arrs[i];
        count = 1;
      }
      else {
        if (arrs[i] == candidate)
          count++;
        else
          count--;
      }
    }

    count = 0;
    for (int i = 0; i < n; i++) {
      if (arrs[i] == candidate)
        count++;
    }
    if (count > (n / 2))
      return candidate;
    return -1;
 
    // The last for loop and the if statement step can
    // be skip if a majority element is confirmed to
    // be present in an array just return candidate
    // in that case
  }
 
  // Driver code


}
public class MajorBuro {


		  public static void main(String[] args)
		  {
			  BoyerMooreVoting b=new BoyerMooreVoting();
		   // int arr[] = { 1, 1, 1, 1, 2, 3, 4 };
			  Scanner sc=new Scanner(System.in);
			  int n=sc.nextInt();
			  int arr[]=new int[n];
			  for(int i=0;i<n;i++)
				  arr[i]=sc.nextInt();
		    int majority = b.findMajority(arr,n);
		    System.out.println(" The majority element is : "
		                       + majority);
		  }
		}
	
