package by.epam.student.ippolitov.java.module_task2;

/*Ветвления 1) Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным */
public class E1v1 {
	public static void main(String args[]) {
		// сумма углов = 180 градусов.
		double a, b, c;
		a = 45;
		b = 90;
		c = 45;

		if ((a + b + c) == 180) {
			System.out.println("Треугольник существует");

			if ((a == 90) | (b == 90) | (c == 90)) {
				System.out.println("прямоугольный");
			} else {
				System.out.println("не прямоугольный");
			}

		} else {
			System.out.println("Треугольник не существует");
		}

	}
}
