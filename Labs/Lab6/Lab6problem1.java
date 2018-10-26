package Package;

public class Lab6problem1 {
	public static void main(String[] args) {
		Square mysquare = new Square(40);
		System.out.println(mysquare.width);
		System.out.println(mysquare.getArea());
		System.out.println(mysquare.getPerimeter());
		
		Square mysquare2 = new Square(35.9);
		System.out.println(mysquare2.width);
		System.out.println(mysquare2.getArea());
		System.out.println(mysquare2.getPerimeter());
	}

}
