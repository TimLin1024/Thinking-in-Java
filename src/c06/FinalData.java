package c06;
class Value{
	int i = 1;
}
public class FinalData {
	final int i1 = 9;
	static final int i2 = 99;
	public static final int i3 = 39;
	
	//编译期无法完成初始化
	final int i4 = (int) (Math.random()*20);
	static final int i5 = (int) (Math.random()*20);
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
//	final Value v4; maynot have been init
	
	final int[] a = {1,2,3,4,5,6};
	
	public void print(String id) {
		System.out.println(
				id + ": " + "i4 = " + i4 +
				"， i5 = " + i5);
	}
	
	public static void main(String[] args) {
		FinalData finalData = new FinalData();
		for (int i = 0; i < finalData.a.length; i++) {
			finalData.a[i]++;//数组是对象不是常数
		}
//		finalData.v3 = new Value();
		FinalData fd2 = new FinalData();
		finalData.print("fd1");
		fd2.print("fd2");
	
	}

}
