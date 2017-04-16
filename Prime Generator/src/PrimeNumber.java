import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String primeNumbers="";
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to which you want to display all the prime numbers included :");;
		int n=scanner.nextInt();
		for (int i = 3; i<= n; i++){	   
	       		 		  
	         int counter=0; 		  
	         for(int num =i; num>=1; num--){
		        if(i%num==0)
		         {
			     counter = counter + 1;
		        }
		     }
		     if (counter ==2){
		    //Appended the Prime number to the String
		      primeNumbers = primeNumbers + i + " ";
		    }	
	      }	
	      System.out.println("Prime numbers from 1 to "+ n+" are :");
	      System.out.println(primeNumbers);


	}

}
