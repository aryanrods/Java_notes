
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Get Input from the User");

        Scanner console = new Scanner(System.in);

        Car car = new Car();
        String UserInput;
        System.out.println("Enter the number plate of the car: ");
        UserInput = console.next();

        car.setNumPlate(UserInput);
        System.out.println("Number plate set as :  " + car.getNumPlate());

    }
}
