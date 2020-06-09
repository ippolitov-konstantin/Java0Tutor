package by.epam.student.ippolitov.java.module_task1;

/* 3) Вычислите значение выражения по формуле (все переменные применяют действительные значения) */
public class T3 {
	public static void main(String args[]) {

		double z, x, y, t, g;
		x = 10;
		y = 2;
		t = 2;
		g = 2;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * t * g * x * y;
		System.out.println(z);
	}
}
