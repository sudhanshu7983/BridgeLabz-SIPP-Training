import java.util.Scanner;
public class PErimeterOfSqaure {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Perimeter of the square: ");
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is: " + side + " whose perimeter is: " + perimeter);
    }
}
