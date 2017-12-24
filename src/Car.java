
public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;

    public void printVariables() {
        System.out.println("This is the max speed: " + maxSpeed);
        System.out.println("This is the min speed: " + minSpeed);
        System.out.println("This is the weight: " + weight);
        System.out.println("Is the car on: " + isTheCarOn);
        System.out.println("The condition is: " + condition);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        System.out.println("Family's car: ");
        familyCar.printVariables();
        Car terryCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Terry's Car: ");
        terryCar.printVariables();

    }

}
