package part29;

public class pub_test1 {
	double fvar1;
	static double fvar2;
	int ivar1;
	static float sum_f_I(double fvar1,int ivar1){
		return (float) (fvar2 = fvar1 + ivar1);
	}
	public static void main(String args[]){
		System.out.println("ºÍ£º"+ sum_f_I(6.343,2));
	}
}
