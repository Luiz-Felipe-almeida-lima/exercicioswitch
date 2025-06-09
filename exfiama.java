package fefefifi;

import java.util.Scanner;

public class exfiama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double m01, m05, m10, m25, m50, m1, soma;
		
        System.out.println("informe quantas moedas de 0,01 tem: ");
        m01 = sc.nextDouble()*0.01;
        
        System.out.println("informe quantas moedas de 0,05 tem: ");
        m05 = sc.nextDouble()*0.05;
        
        System.out.println("informe quantas moedas de 0,10 tem: ");
        m10 = sc.nextDouble()*0.1;	
        
        System.out.println("informe quantas moedas de 0,25 tem: ");
        m25 = sc.nextDouble()*0.25;
        
        System.out.println("informe quantas moedas de 0,50 tem: ");
        m50 = sc.nextDouble()*0.50;
        
        System.out.println("informe quantas moedas de 1.00 tem: ");
        m1= sc.nextDouble()*1;
        
        soma = (m01 + m05 + m10 + m25 + m50 + m1);
        
        System.out.println("o valor total de moedas é " + soma);
        System.out.println("o valor que falta para chegar em 100 é de " + (100-soma));
        
       
	}

}
