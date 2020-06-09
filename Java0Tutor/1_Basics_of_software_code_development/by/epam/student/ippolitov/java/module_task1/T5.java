package by.epam.student.ippolitov.java.module_task1;

/* 5) Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме HHч MMмин SSс. */
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class T5 {
	public static void main(String args[]) {
		// текущее время
		long timer = (long) System.currentTimeMillis();
		DateFormat format = new SimpleDateFormat("HHч mmмин ssсек");
		// format.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println(timer);
		System.out.println("Current time " + format.format(timer));

		// любое время
		long timer2 = 1588525089068L;
		DateFormat format2 = new SimpleDateFormat("HHч mmмин ssсек");
		System.out.println(timer2);
		System.out.println("Other time " + format2.format(timer2));

	}
}