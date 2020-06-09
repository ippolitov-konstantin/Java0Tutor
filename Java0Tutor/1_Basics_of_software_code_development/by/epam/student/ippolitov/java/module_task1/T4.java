package by.epam.student.ippolitov.java.module_task1;
/* 4) Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях. Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class T4 {
	public static void main(String args[]) {
		double a = 123.456;
		String str;
		String b;
		String c;
		str = String.valueOf(a);
		b = str.substring(0, 3);
		c = str.substring(4, 7);
		System.out.println("was " + a);
		System.out.println("became " + c + "." + b);

		// like array
		/*
		 * List<Integer> list2 = Arrays.asList(123,456); Spliterator<Integer> splitr2 =
		 * list2.spliterator(); Spliterator<Integer> st2 = splitr2.trySplit();
		 * splitr2.forEachRemaining(System.out::print); System.out.print(",");
		 * st2.forEachRemaining(System.out::println);
		 */
	}
}