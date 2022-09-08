
public class Sandglass {

	public static void main(String[] args) {
// песочные часы
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j == 4 || i == j || j == 2 || i == 0 || i == 4)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
// бантик		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j == 4 || i == j || i == 2 || j == 0 || j == 4)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
// плюс в квадрате		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 0 || j == 4 || j == 2 || i == 0 || i == 4)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
// квадрат		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4 || i == 0 || i == 4)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
//плюс		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 2)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
// точки в центре 	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 1 && j == 1 || i == 1 && j == 3 || i == 3 && j == 1 || i == 3 && j == 3)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
// буква Я		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3 || j == 1 && i < 3 || j == 1 && i > 3 || j == 2 && i == 0 || j == 2 && i == 2
						|| j == 2 && i == 3)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
// буква Н		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 1 || j == 3 || j == 2 && i == 2)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
