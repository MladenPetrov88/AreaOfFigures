import java.util.Scanner;

public class Task9_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double sideA = Double.parseDouble(scanner.nextLine());
        if (figure.equals("square")) {
            System.out.printf("%.3f", sideA * sideA);
        } else if (figure.equals("rectangle")) {
            double sideB = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", sideA * sideB);
        } else if (figure.equals("circle")) {
            System.out.printf("%.3f", Math.PI * sideA * sideA);
        } else if (figure.equals("triangle")) {
            double sideB = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", sideA * sideB / 2);
        }
    }
}
