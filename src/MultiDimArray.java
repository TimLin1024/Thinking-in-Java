import java.util.Random;

import javax.imageio.stream.IIOByteBuffer;

import c04.StaticInitalization;

public class MultiDimArray {
	static Random random = new Random();
	static int pRand(int mod){
		return Math.abs(random.nextInt()) % mod + 1;
	}
	
	public static void main(String[] args) {
		int[][] a1 = {
				{1,2,3},
				{4,5,6},
		};
		
		for(int i = 0; i < a1.length; i++){
			for (int j = 0; j < a1[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "] = " + a1[i][j]);
				
			}
		}
		int[][][] a2 = new int[2][2][4];
		for(int i = 0;i < a2.length; i++){
			for(int j = 0; j<a2[i].length; j++)
				for (int k = 0; k < a2[i][j].length; k++) {
					System.out.println("a[" + i + "]["
				+ j + "][" + k + "] = " + a2[i][j][k]);
				}
		}
	}
}
