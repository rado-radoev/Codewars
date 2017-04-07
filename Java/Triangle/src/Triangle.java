
public class Triangle {
	
	private double a;
	private double b;
	private double c;

	public Triangle (double a, double b, double c) throws TriangleException {
		setA(a);
		setB(b);
		setC(c);
		isTriangle();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	private boolean isEquilateral() {
		if ((getA() == getB()) &&(getB() == getC())) {
			return true;
		}
		return false;
	}
	
	private boolean isIsosceles() {
		if ( (getA() == getC()) || (getB() == getC())  || (getA() == getB()) ) {
			return true;
		}
		return false;
	}
	
	private void isTriangle() throws TriangleException {
		if (getA() <= 0 || getB() <= 0 || getC() <= 0) {
			throw new TriangleException();
		} else if ( (getA() + getB() <= getC()) ||  (getA() + getC() <= getB()) || (getB() + getC() <= getA())) {
			throw new TriangleException();
		}
	}

	
	public TriangleKind getKind() {
		if (isEquilateral()) {
			return TriangleKind.EQUILATERAL;
		}
		else if (isIsosceles()) {
			return TriangleKind.ISOSCELES;
		}
		else {
			return TriangleKind.SCALENE;
		}
	}
}
