
public class Triangle {
	
	private double a;
	private double b;
	private double c;
	private TriangleException te;

	public Triangle (double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
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
	
	
	private boolean isScalene() {
		if ( (getA() != getB()) && (getA() != getC()) && (getB() != getC())  ) {
			return true;
		}
		return false;
	}
	
	private boolean isTriangle() {
		if (getA() <= 0 || getB() <= 0 || getC() <= 0) {
			return false;
		}
		
		if ( (getA() + getB() < getC()) ||  (getA() + getC() < getB()) || (getB() + getC() < getA())) {
			return false;
		}
		
		return true;
	}

	
	public TriangleKind getKind() throws TriangleException {
		if (isTriangle()) {
			if (isEquilateral()) {
				return TriangleKind.EQUILATERAL;
			}
			else if (isIsosceles()) {
				return TriangleKind.ISOSCELES;
			}
			else if (isScalene()) {
				return TriangleKind.SCALENE;
			}
		}
		throw te = new TriangleException();
	}
}
