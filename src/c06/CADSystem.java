package c06;
class Shape{
	public Shape(int i) {
		System.out.println("Shape constructor");
	}
	void cleanUp() {
		System.out.println("Shape cleanUp");
	}
}

class Circle extends Shape{

	public Circle(int i) {
		super(i);
		System.out.println("Drawing a circle");
	}
	@Override
	void cleanUp() {
		System.out.println("Erasnig a Circle");
		super.cleanUp();
	}
}
class Triangle extends Shape{
	public Triangle(int i) {
		super(i);
		System.out.println("Drawing a triangle");
	}
}
class Line extends Shape{
	private int start ,end;
	public Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing a line:"
				+start+ "," + end);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void cleanUp() {
		System.out.println("erasing a Line:" + start+ "," + end);
		super.cleanUp();
	}
}
public class CADSystem extends Shape{
	private Circle mCircle;
	private Triangle mTriangle;
	private Line[] mLines = new Line[10];
	public CADSystem(int i) {
		super(i+1);
		for (int j = 0; j < mLines.length; j++) {
			mLines[j] = new Line(j, j * j);
		}
		mCircle = new Circle(1);
		mTriangle = new Triangle(1);
		System.out.println("Combined constructor");
	}
	@Override
	void cleanUp() {
		System.out.println("CADSystem.cleanUp");
		mTriangle.cleanUp();
		mCircle.cleanUp();
		for (int i = 0; i < mLines.length; i++) {
			mLines[i].cleanUp();
		}
		super.cleanUp();
	}
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			
		} finally {
			x.cleanUp();
		}
	}
}
