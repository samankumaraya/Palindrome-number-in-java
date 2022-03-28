package codin;

import java.util.Scanner;

public class Main {

   public static void main(String args[]){

      int r,sum=0,temp;

      System.out.println("Enter your number  :");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      temp=n;

      while(n>0){
          r=n%10;
          sum=(sum*10)+r;
          n=n/10;
      }

      if(temp==sum){
          System.out.println("Number is palindrome ");
      }
      else{
          System.out.println("Number is not palindrome");
      }
   }
    }