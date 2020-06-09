package by.epam.student.ippolitov.java.module_task1;

/* 6) Для данной области составить линейную программу, которая печатает true, если точка с координатами (x , y) принадлежит закрашенной области, и false - в противном случае.  */
public class T6 {

	public static void main(String args[]) {
		double x = 2;
		double y = 4;

		/*
		 * . Слева сверху -2; 4
		 */

		/*
		 * Справа сверху 2; 4
		 */

		/*
		 * Слева снизу -4; -3
		 */

		/*
		 * Справа снизу 4; -3
		 */

		if ((x >= -2) & (x <= 0) & (y <= 4) & (y >= 0)) {
			System.out.println(true);
		} // Слева сверху

		else if ((x <= 2) & (x >= 0) & (y <= 4) & (y >= 0)) {
			System.out.println(true);
		} // Справа сверху

		else if ((x >= -4) & (x <= 0) & (y >= -3) & (y <= 0)) {
			System.out.println(true);
		} // Слева снизу

		else if ((x <= 4) & (x >= 0) & (y >= -3) & (y <= 0)) {
			System.out.println(true);
		} // Слева снизу

		else {
			System.out.println(false);
		}

	}
}