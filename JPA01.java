package Lab04;
import java.util.Scanner;
public class JPA01{
	public static void main(String args[]){
		int n = 0, sum = 0;
		int[] number = new int[10];
		System.out.println("請輸入10個整數：");
		for(int i = 0;i < 10;i++){
			System.out.printf("第%d個整數：", i + 1);
			number[i] = new Scanner(System.in).nextInt();
		}
		for(int N : number){
			if(N > 60){
				n++;
				sum += N;
			}
		}
		System.out.println("陣列中大於60的有" + n + "個\n總合為" + sum + "\n平均值為" + (sum / (double)n));
	}
}