package by.epam.student.ippolitov.java.module_task3;

import java.math.*;
/* 4) Составить программу нахождения квадратов первых 200 чисел. */

public class E1c4BigInteger {

	public static void main(String args[]) {
		BigInteger n = BigInteger.valueOf(1);
		BigInteger i = BigInteger.valueOf(1);
		BigInteger y = BigInteger.valueOf(1);
		BigInteger d = BigInteger.valueOf(1);
		// long i;
		int z;

		for (z = 0; z <= 200; z++) {
			// System.out.println(i);
			// n=n*(i*i);

			/*
			 * i = i.multiply(i); n = n.add(i);
			 */
			n = n.multiply(i);
			n = n.multiply(i);

			// n = i.add(y);
			// i=i+1;
			i = i.add(y);

			// System.out.println(i + "Выводим i " + i);
			// System.out.println("Выводим n " + n);
		}
		System.out.println("Итого произведение квадратов 200 чисел = : " + n);

	}
}
