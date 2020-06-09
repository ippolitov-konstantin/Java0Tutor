package by.epam.student.ippolitov.java.module_task2;

/* 4) Заданы размеры A, B прямоугольного отверстия и размеры x,y,z кирпича. Определить пройдёт ли кирпич через отверстие. */

public class E1v4 {
	public static void main(String args[]) {
		// double x1,x2,x3,y1,y2,y3,z,average;
		double a, b, x, y, z, min, max, average, minr, maxr;
		a = 121;
		b = 66;
		x = 250;
		y = 120;
		z = 65;

		// ищем минимальную сторону кирпича
		min = Math.min(Math.min(x, y), z);
		// ищем максимальную сторону кирпича
		max = Math.max(Math.max(x, y), z);
		// ищем среднюю сторону кирпича
		average = (x + y + z) - min - max;

		// ищем минимальную сторону прямоугольного отверстия
		minr = Math.min(a, b);

		// ищем максимальную сторону прямоугольного отверстия
		maxr = Math.max(a, b);

		/*
		 * System.out.println("Минимальный размер стороны кирпича  "+ min);
		 * System.out.println("Максимальный размер стороны кирпича  "+ max);
		 * System.out.println("Средний размер стороны кирпича  "+ average);
		 * 
		 * System.out.println("Минимальный размер стороны отверстия  "+ minr);
		 * System.out.println("Максимальный размер стороны отверстия  "+ maxr);
		 */

		if ((min < minr) && (average < maxr)) {
			System.out.println("Кирпич пролезет");
		} else {
			System.out.println("Кирпич не пролезет");
		}

	}
}
