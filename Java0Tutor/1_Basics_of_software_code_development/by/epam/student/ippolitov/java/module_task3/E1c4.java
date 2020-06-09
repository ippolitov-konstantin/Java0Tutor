package by.epam.student.ippolitov.java.module_task3;

/* 4) Составить программу нахождения квадратов первых 200 чисел. */

public class E1c4 {

	public static void main(String args[]) {
		long n;
		long i;
		n = 1;
		for (i = 1; i <= 200; i++) {
			System.out.println(i);
			n = n * (i * i);
			// i=i+1;
			System.out.println(i + "Выводим i " + i);
			System.out.println("Выводим n " + n);

			if (n == 0) {
				System.out.println("Превышен лимит типа данных long ");

				break;
			}
		}
		// System.out.println("Итого произведение квадратов 200 чисел = : " + n);

	}
}
