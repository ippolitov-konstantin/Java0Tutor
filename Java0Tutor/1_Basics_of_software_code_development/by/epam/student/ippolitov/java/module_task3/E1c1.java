package by.epam.student.ippolitov.java.module_task3;

import java.util.Scanner;

/* Циклы 1) Напишите программу, где пользователь вводит любое целое положительное число, а программа суммирует все числа от 1 до введённого пользователем числа.  */

public class E1c1 {

	public static void main(String args[]) {
		int x;
		int y = 0;
		Scanner ayn = new Scanner(System.in);
		System.out.println("Введите число: ");
		x = ayn.nextInt();
		// x=7;
		for (int i = 1; i <= x; i++) {
			// System.out.println(i);
			y = i + y;
//	 System.out.println(i + "Выводим i " + i);	
			// System.out.println("Выводим y " + y);
		}
		System.out.println("Итого сумма: " + y);

	}
}
