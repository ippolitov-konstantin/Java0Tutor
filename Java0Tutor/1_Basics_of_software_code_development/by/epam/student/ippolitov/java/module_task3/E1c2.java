package by.epam.student.ippolitov.java.module_task3;

/* 2) Вычислите значение функции на отрезке [a,b] с шагом h */
public class E1c2 {
	public static void main(String args[]) {
		double a;
		double b;
		double h;
		double x;
		a = 3;
		b = 5;
		h = 0.2; // шаг

		if (a <= 2) {
			for (x = a; x <= b; x = x + h) {
				System.out.println(x + "   ");
			}
		}

		if (a > 2) {
			for (x = a; x <= b; x = x + h) {
				System.out.println(x + "   ");
			}
		}

	}

}
