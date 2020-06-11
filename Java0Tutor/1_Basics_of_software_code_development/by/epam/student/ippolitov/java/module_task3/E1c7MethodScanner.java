package by.epam.student.ippolitov.java.module_task3;

import java.util.Scanner;

/* 7) Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа, m и n вводятся с клавиатуры */
public class E1c7MethodScanner {
	public static void main(String args[]) {
		int i;
		int m;
		int n;
		m = 24;
		n = 2;
		double rez;

		/*
		 * Scanner ayn = new Scanner(System.in);
		 * System.out.println("Введите число 1: "); m = ayn.nextInt();
		 * System.out.println("Введите число 2: "); n = ayn.nextInt();
		 */

		m = enterFromConsole("Введите цифру 1  ");
		n = enterFromConsole("Введите цифру 2  ");

		for (n = n; m > n; n++) {
			rez = m / n;
			int rez2 = (int) rez;

			if ((rez2 * n) == m) {
				System.out.println(rez + "     ");

			}
		}

	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource") // Это аннотация для подавления предупреждений компиляции о непроверенных
										// универсальных операциях (не исключениях), таких как приведения. По сути, это
										// означает, что программист не хотел получать уведомления о них, которые он уже
										// знает при компиляции конкретного бита кода.
		Scanner sc = new Scanner(System.in);
		int value;

		System.out.print(message);
		/*
		 * while (!sc.hasNextInt()) { sc.next(); System.out.print(message);
		 * 
		 * }
		 */
		value = sc.nextInt();
		return value;

	}

}
