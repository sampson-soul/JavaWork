package JFTest;

abstract class Shap2D{
	protected float x,y;
	
	public Shap2D(float xx,float yy) {
		this.x=xx;
		this.y=yy;
	}
	
	public abstract float Area();
	
	public float distance(Shap2D shap) {
		float d = 0;
		d=(float)Math.sqrt(Math.pow(x-shap.getX(),2)+(Math.pow(y-shap.getX(),2)));
		return d;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}
class Circle extends Shap2D{
	protected float r;
	public Circle(float xx, float yy, float rr) {
		super(xx, yy);
		this.r = rr;
	}

	public float Area() {
		return (float)(Math.PI*r*r);
	}
}

class Rect extends Shap2D{
	float w, h;
	public Rect(float xx, float yy, float ww, float hh) {
		super(xx, yy);
		this.w = ww;
		this.h = hh;
	}

	public float Area() {
		return (float)w*h;
	}
}

public class Test{
	public static void main(String [] args) {
		Shap2D sh = new Circle(3.0f,4.0f,9.0f);
		Shap2D re = new Rect(5.0f, 6.0f,3.0f, 5.0f);
		System.out.println(sh.Area());
		System.out.println(re.Area());
		System.out.println("两个图形之间的距离是："+sh.distance(re));
	}
}
