package ex1;
import java.util.Scanner;

public class ex1 {

	   public static void main(String[] args) {
	        
	        Scanner sc= new Scanner(System.in);
	        

	        System.out.println("Digite o primeiro numero: ");
	        int numero1=sc.nextInt();
	        System.out.println("Digite o segundo numero: ");
	        int numero2=sc.nextInt();
	        int resultado=numero1+numero2;
	        System.out.println("O resultado da soma e: " + resultado);

	        sc.close();

	    }
	}
