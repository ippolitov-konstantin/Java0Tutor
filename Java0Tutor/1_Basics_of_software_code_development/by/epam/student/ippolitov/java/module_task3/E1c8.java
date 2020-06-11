package by.epam.student.ippolitov.java.module_task3;

/* 8) Даны 2 числа. Определить цифры входящие в запись как первого так и второго числа. */
public class E1c8 {
	public static void main(String args[]) {
		int i;
		int m;
		int n;
		m = 3219525;
		n = 1234567;

		int y = 0;
		int c = 0;
		int e;

		// создаём массив 1-го числа
		String mstr = Integer.toString(m); // преобразуем числа в строку
		int q1 = mstr.length(); // считаем количество чисел в строке
		// создаём массив чисел m

		String[] myArray1;
		myArray1 = new String[q1];

		for (i = 0; i < q1; i++) {
			y = y + 1;
			String str1 = mstr.substring(i, y);
			myArray1[i] = str1;
		}

		// выводим 1 массив
		/*
		 * for (int z = 0; z < q1; z++) { System.out.println(myArray1[z]); }
		 */

		// создаём массив 2-го числа
		String mstr2 = Integer.toString(n); // преобразуем числа в строку
		int q2 = mstr2.length(); // считаем количество чисел в строке
		// создаём массив чисел m

		String[] myArray2;
		myArray2 = new String[q2];

		for (e = 0; e < q2; e++) {
			c = c + 1;
			String str2 = mstr2.substring(e, c);
			myArray2[e] = str2;
		}

		// выводим 2 массив

		/*
		 * for (int d = 0; d < q2; d++) { System.out.println(myArray2[d]); }
		 */

		String g;
		String h;

		for (int z = 0; z < q1; z++) {
			// System.out.println(myArray1[z]);
			g = myArray1[z];
			for (int d = 0; d < q2; d++) {
				h = myArray2[d];
				// System.out.println(myArray2[d]);

				if (g.equals(h)) {
					System.out.println(myArray2[d]);
					// break();
				}

			}

		}

	}

}
