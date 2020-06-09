package by.epam.student.ippolitov.java.module_task2;
/* 5) Вычислить значение функции */

public class E1v5 {

	public static void main(String args[]) {
		double x, f;
		x = 5;
		f = 0;

		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else if (x > 3) {
			f = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("f(x) = " + f);

	}
}
