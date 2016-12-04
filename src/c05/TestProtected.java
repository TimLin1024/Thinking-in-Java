package c05;

public class TestProtected {
	protected String protectedStr = "protectedStr";
	

}

class ProtectedClass extends TestProtected{
	String m(){
		return protectedStr;
	}
}