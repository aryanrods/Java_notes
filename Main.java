
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Get Input from the User");

        Scanner Input = new Scanner(System.in);

        Car car = new Car();

        car.setNumPlate("ABC123");
        car.getNumPlate();

    }
}
