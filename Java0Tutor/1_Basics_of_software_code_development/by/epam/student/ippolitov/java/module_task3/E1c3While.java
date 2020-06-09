package by.epam.student.ippolitov.java.module_task3;
/* 3) Найти сумму квадратов первых ста чисел. */

public class E1c3While {

	public static void main(String args[]) {
		int n, i = 0;
		n = 0;
		while (i <= 100) {
			// System.out.println(i);
			n = n + (i * i);
			i = i + 1;
			// System.out.println(i + "Выводим i " + i);
			// System.out.println("Выводим n " + n);
		}
		System.out.println("Итого сумма: " + n);

	}
}
