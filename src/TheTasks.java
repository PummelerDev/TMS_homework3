import java.util.Scanner;

public class TheTasks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) {
			int value = scan.nextInt();
			System.out.println(task1(value)); // task 1
			System.out.println(task2(value)); // task 2
			System.out.println(task3(value)); // task 3
			System.out.println(task4(value)); // task 4
			System.out.println(task5(value)); // task 5
			task2_1(); // task 2.1
			System.out.println("\n" + " ");
			task2_2(); // task 2.2
			System.out.println("\n" + " ");
			System.out.println(task2_3(value)); // task 2.3
			System.out.println(task2_3recursion(value)); // task 2.3 with recursion
			task2_4(); // task 2.4
			System.out.println("\n" + " ");
			task2_5(); // task 2.5
			System.out.println("\n" + " ");
			task2_6(); // task 2.6
			System.out.println("\n" + " ");
			task3_1(); // task 3.1
			System.out.println("\n" + " ");

			task3_3(); // task 3.3
			System.out.println(" ");

			task3_2(); // task 3.2

		} else {
			System.out.println("incorrect data");
		}
		scan.close();
	}

	public static String task1(int numberOfMonth) {
		switch (numberOfMonth) {
		case 1:
			return "jan";
		case 2:
			return "feb";
		case 3:
			return "mar";
		case 4:
			return "apr";
		case 5:
			return "may";
		case 6:
			return "jun";
		case 7:
			return "jul";
		case 8:
			return "aug";
		case 9:
			return "sep";
		case 10:
			return "oct";
		case 11:
			return "nov";
		case 12:
			return "dec";
		default:
			return "incorrect data";
		}
	}

	public static String task2(int numberOfMonth) {
		if (numberOfMonth == 12 || numberOfMonth >= 1 && numberOfMonth <= 2)
			return "winter";
		else if (numberOfMonth >= 3 && numberOfMonth <= 5)
			return "spring";
		else if (numberOfMonth >= 6 && numberOfMonth <= 8)
			return "summer";
		else if (numberOfMonth >= 9 && numberOfMonth <= 11)
			return "autumn";
		else
			return "incorrect data";
	}

	public static String task3(int number) {
		if (number % 2 == 0)
			return "the number is even"; // четное
		else
			return "the number is odd"; // нечетное
	}

	public static String task4(int temperature) {
		if (temperature > -5)
			return "it's warm outside";
		else if (temperature <= -5 && temperature > -20)
			return "it's normal outside";
		else if (temperature < -20)
			return "it's freezy";
		return "incorrect data";
	}

	public static String task5(int numberOfColour) {
		switch (numberOfColour) {
		case 1:
			return "red";
		case 2:
			return "orange";
		case 3:
			return "yellow";
		case 4:
			return "green";
		case 5:
			return "light blue";
		case 6:
			return "blue";
		case 7:
			return "purple";
		default:
			return "incorrect data";
		}
	}

	public static void task2_1() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}
	}

	public static void task2_2() {
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	public static int task2_3(int number) {
		int result = 0;
		for (int i = 1; i <= number; i++)
			result += i;
		return result;
	}

	public static int task2_3recursion(int number) {
		int result = 0;
		if (number > 0)
			result += number + task2_3recursion(number - 1);
		return result;
	}

	public static void task2_4() {
		int i = 7;
		while (i < 100) {
			System.out.print(i + " ");
			i += 7;
		}
	}

	public static void task2_5() {
		int x = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(x + " ");
			x -= 5;
		}
	}

	public static void task2_6() {
		for (int i = 10; i <= 20; i++) {
			System.out.print((i * i) + " ");
		}
	}

	public static void task3_1() {
		int result = 0, x = 0, y = 1;
		System.out.print(x + " " + y + " ");
		for (int i = 0; i < 10; i++) {
			result = x + y;
			x = y;
			y = result;
			System.out.print(result + " ");
		}
	}

	public static void task3_2() {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter amount of your deposit ");
		float deposit = scan2.nextFloat();
		System.out.println("enter aquantity of months ");
		int quantityOfMonth = scan2.nextInt();
		for (int i = 0; i < quantityOfMonth; i++)
			deposit *= 1.07;
		System.out.println("you will receive ");
		System.out.println(deposit);
		scan2.close();
	}

	public static void task3_3() {
		System.out.println("\n multiplication table");
		for (int i = 1; i <= 10; i++) {
			for (int y = 1; y <= 10; y++)
				System.out.print((i * y) + " ");
			System.out.println(" ");
		}
	}

}
