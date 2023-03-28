import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        // create Scanner object
        Scanner reader = new Scanner(System.in);

        // ask user to enter the height
        System.out.println("== RECTANGLE CALCULATOR PROGRAM==");
        System.out.println("Enter height : ");
        double height = reader.nextDouble(); // double datatype = contains fraction number
        System.out.println("Enter width : ");
        double width = reader.nextDouble(); // name of variable is width, contains value of 5

        // calculate perimeter
        double perimeter = 2 * (width + height);
        // calculate area of rectangle
        double area = width * height;
        // print the information

        System.out.println("Rectangle height = " + height);
        System.out.println("Rectangle width = " + width);
        System.out.println("Calculating .....");
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
