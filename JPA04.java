package Lab04;
import java.util.Scanner;
public class JPA04{
    public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] argv){
		int[] Fibonacci = new int[10];
		Fibonacci[0] = 0;
		Fibonacci[1] = 1;
		for(int i = 2;i < Fibonacci.length;i++) 
			Fibonacci[i] = Fibonacci[i - 2] + Fibonacci[i - 1];			
		for(int f : Fibonacci)
			System.out.println(f);
    }
}