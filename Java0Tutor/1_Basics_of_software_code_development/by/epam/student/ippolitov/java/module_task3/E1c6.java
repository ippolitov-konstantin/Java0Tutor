package by.epam.student.ippolitov.java.module_task3;

/* 6) Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера */
public class E1c6 {
	public static void main(String args[]) {
		int i;
		/*
		 * String e = new String("Добро пожаловать"); int f = e.length();
		 * System.out.println(f);
		 */

		for (i = 0; i < 266; i++) {

			char b = (char) i;
			// String e = Character.toString(b);
			int e = (int) b;

			// if (e != ""){
			System.out.print(i + "    ");
			System.out.println(b + "   " + e);
		}
		// }

		/*
		 * char c; c = '+'; int i = (int)c; System.out.println(i); char b = (char)i;
		 * System.out.println(b);
		 * 
		 */

	}
}
