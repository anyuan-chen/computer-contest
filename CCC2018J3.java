package computerConest;
 
import java.util.Scanner;
public class CCC2018J3 {
	static int city1;
	static int city2;
	static int city3;
	static int city4;
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		city1 = sc.nextInt();
		city2 = sc.nextInt();
		city3 = sc.nextInt();
		city4 = sc.nextInt();
		
		city1();
		city2();
		city3();
		city4();
		city5();
	}
	
	public static void city1(){
		System.out.print(0 + " ");
		System.out.print(city1 + " ");
		System.out.print(city1 + city2 + " ");
		System.out.print(city1 + city2 + city3 + " ");
		System.out.print(city1 + city2 + city3 + city4 + " ");
		System.out.println();
	}
	public static void city2(){
		System.out.print(city1 + " ");
		System.out.print(0+ " ");
		System.out.print(city2+ " ");
		System.out.print(city2 + city3+ " ");
		System.out.print(city2 + city3 + city4+ " ");
		System.out.println();
	}
	public static void city3(){
		System.out.print(city1 + city2+ " ");
		System.out.print(city2+ " ");
		System.out.print(0+ " ");
		System.out.print(city3+ " ");
		System.out.print(city4 + city3+ " ");
		System.out.println();
	}
	public static void city4(){
		System.out.print(city1 + city2 + city3+ " ");
		System.out.print(city2 + city3+ " ");
		System.out.print(city3+ " ");
		System.out.print(0+ " ");
		System.out.print(city4+ " ");
		System.out.println();
	}
	public static void city5() {
		System.out.print(city1 + city2 + city3 + city4+ " ");
		System.out.print(city2+city3+city4+ " ");
		System.out.print(city3 + city4+ " ");
		System.out.print(city4+ " ");
		System.out.print(0+ " ");
		System.out.println();
	}
	
}
