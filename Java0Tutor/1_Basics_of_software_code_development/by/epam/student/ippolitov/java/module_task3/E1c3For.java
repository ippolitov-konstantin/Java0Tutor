package by.epam.student.ippolitov.java.module_task3;
/* 3) Найти сумму квадратов первых ста чисел. */

public class E1c3For {

	public static void main(String args[]) {
		int n, i;
		n = 0;
		for (i = 0; i <= 100; i++) {
			// System.out.println(i);
			n = n + (i * i);
			// i=i+1;
			// System.out.println(i + "Выводим i " + i);
			// System.out.println("Выводим n " + n);
		}
		System.out.println("Итого сумма квадратов 100 чисел =  " + n);

	}
}
