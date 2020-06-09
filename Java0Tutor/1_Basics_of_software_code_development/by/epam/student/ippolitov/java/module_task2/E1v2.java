package by.epam.student.ippolitov.java.module_task2;

/* 2) Найти max{min(a,b), min(c,d)}. */
import java.util.Scanner;

public class E1v2 {
	public static void main(String args[]) {
		double a, b, c, d, z, max, min1, min2;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		max = 0;
		min1 = 0;
		min2 = 0;

		Scanner ayn = new Scanner(System.in);
		System.out.println("¬вести первую цифру: ");
		a = ayn.nextDouble();
		System.out.println("¬вести вторую цифру: ");
		b = ayn.nextDouble();
		System.out.println("¬вести третью цифру: ");
		c = ayn.nextDouble();
		System.out.println("¬вести четвЄртую цифру: ");
		d = ayn.nextDouble();

		z = a + b + c + d;
		System.out.println("—умма цифр: " + z);

		min1 = Math.min(a, b);
		min2 = Math.min(c, d);

		System.out.println("Min 1: " + Math.min(a, b));
		System.out.println("Min 2: " + Math.min(c, d));

		max = Math.max(min1, min2);

		System.out.println("Max: " + max);

	}
}
