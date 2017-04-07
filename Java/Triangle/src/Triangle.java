
public class Triangle {
	
	private int a;
	private int b;
	private int c;
	private TriangleException te;

	public Triangle (int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			te = new TriangleException(); // throw exception if a, b or c is lower than 0 
		}
		setA(a);
		setB(b);
		setC(c);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public static void main(String[] args) {
		Triangle tr = new Triangle(0,2,3);
	}

}
