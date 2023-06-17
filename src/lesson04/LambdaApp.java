package lesson04;

/**
 * Created by Vladimir Trandafilov on 28.02.2019.
 */
public class LambdaApp {

	public static void main(String[] args) {
		int[] array = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};

		Expression exp1 = ExpressionUtils::isEven;
		Expression exp2 = ExpressionUtils::isPositive;
		Expression exp3 = (int i) -> i<0; // isNegative

		System.out.println(sumOf(array, exp1));
		System.out.println(sumOf(array, exp2));
		System.out.println(sumOf(array, exp3));
		System.out.println(sumOf(array, (int i) -> i%2!=0)); // isOdd

		// using Anonymous class instead lambda
		System.out.println(sumOf(array, new Expression() {
			@Override
			public boolean isEqual(int i) {
				return i > 3; // isMoreThanThree
			}
		})
		);
	}

	private static int sumOf(int[] numbers, Expression func) {
		int result = 0;
		for(int i : numbers) {
			if (func.isEqual(i))
				result += i;
		}
		return result;
	}
}
