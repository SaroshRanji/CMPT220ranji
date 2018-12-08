package Pack;

import java.util.Scanner;

public class App {
	public static void main(String [] args) {
		String q1 = "In Java declaring a class abstract is useful\n"
				+ "(a)To prevent developers from further extending the class\n(b)When it doesn't make sense to have objects of that class\n(c)When it makes sense to have objects of that class\n";
// answer is a
		String q2 = "In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:\n"
				+ "(a)Aggregation\n(b)Inheritance\n(c)Encapsulation\n";
// answer is b		
		String q3 = "The wrapping up of data and functions into a single unit is called\n"
				+ "(a)Encapsulation\n(b)Abstraction\n(c)Data hiding\n";
// answer is a		
		String q4 = "A package is a collection of\n"
				+ "(a)Classes\n(b)Interfaces\n(c)Classes and Interfaces\n";
//answer is c		
		Question[] questions = {	
				new Question(q1, "a"),
				new Question(q2, "b"),
				new Question(q3, "a"),
				new Question(q4, "c"),
		};
		takeTest(questions);
	}
	
	public static void takeTest(Question[] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You got " + score + "/" + questions.length);
	}

}

