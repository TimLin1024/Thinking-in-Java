package ch02;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
/** @author linqiuxuan
 * @see System*/
public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello World");
		InputStreamReader ir=new InputStreamReader(System.in);
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		String[] ary = new String[3];
		while(i<3){
			ary[i] = scanner.next();
			i++;
		}
		
		if (ary.length<3) {
			System.out.println("参数不够，请输入三个参数");
			return;
		}else{
			System.out.println(Arrays.toString(ary));

		}
	}
}
