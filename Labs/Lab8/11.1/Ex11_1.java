package Package;

public class Ex11_1 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Triangle t = getTriangle(input);

    System.out.println("area: " + t.getArea());
    System.out.println("perimeter: " + t.getPerimeter());
    System.out.println("color: " + t.getColor());
    System.out.println("filled: " + t.isFilled());
  }

  public static Triangle getTriangle(Scanner input) {
    System.out.print("Enter three sides: ");
    Triangle t = new Triangle(input.nextDouble(), input.nextDouble(),
      input.nextDouble());
    System.out.print("Enter a color: ");
    t.setColor(input.next());
    String filled = "";
    do {
      System.out.print("Enter filled (t/f): ");
      filled = input.next();
      if (filled.equals("t")) {
        t.setFilled(true);
      } else if (filled.equals("f")) {
        t.setFilled(false);
      }
    } while (!filled.equals("t") && !filled.equals("f"));
    return t;
  }
}


