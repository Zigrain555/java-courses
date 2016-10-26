import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String operation;
			while(!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				System.out.println("Enter operation (+ - * /) : ");
				operation = reader.next();

				switch(operation) {
					case "+" : 
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
					break;

					case "-" : 
					calc.sub(Integer.valueOf(first), Integer.valueOf(second));
					break;

					case "*" : 
					calc.mult(Integer.valueOf(first), Integer.valueOf(second));
					break;

					case "/" : 
					calc.div(Integer.valueOf(first), Integer.valueOf(second));
					break;
				}

				System.out.println("Result : " + calc.getResult());
				calc.clearResult();
				System.out.println("Exit : yes/no ");
				exit = reader.next();

			}
		} 

		finally {
			reader.close();
		}
	}
}