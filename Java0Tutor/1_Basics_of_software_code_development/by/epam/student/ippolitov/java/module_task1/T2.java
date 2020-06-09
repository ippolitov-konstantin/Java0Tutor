package by.epam.student.ippolitov.java.module_task1;

/* 2) Вычислите значение выражения по формуле (все переменные применяют действительные значения) */
public class T2 {
	public static void main(String args[]) {

		double z, a, b, c;
		a = 2;
		b = 1;
		c = 1;

		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));

		System.out.println(z);
	}
}
