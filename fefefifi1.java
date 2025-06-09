package fefefifi;

import java.util.Random;
import java.util.Scanner;

public class fefefifi1 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
     int numero, nums[] = new int[10], soma = 0;
     Random rm = new Random();
     
     for (int i = 0; i < nums.length; i++) {
  	   nums[i] = rm.nextInt(100);
         
         
         }
     
     for (int v:nums ) {
  	   soma = soma + v;
  	   
     }
     
     System.out.println(soma);
     
     
     
     
     
     
     }
     

}
