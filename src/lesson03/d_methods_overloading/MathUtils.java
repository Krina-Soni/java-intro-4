package lesson03.d_methods_overloading;

/**
 * Created by Vladimir Trandafilov on 27.02.2019.
 */
public class MathUtils {

	public static void main(String[] args) {
		summ(1, 2); // will invoke method for integers

		summ(3.14, 9.15); // will invoke method for doubles
	}

	//Overload
	static void summ(int i1, int i2) {
		int res = i1 + i2;
		System.out.println("Summ is:" + res);
	}

	//Overload
	static void summ(double d1, double d2) {
		double res = d1 + d2;
		System.out.println("Summ is:" + res);
	}
}
