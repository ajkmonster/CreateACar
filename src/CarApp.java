
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<>();
        Car car;
        String addnew;
        String color;
        String brand;
        int speed;
        Person bob = new Person();
        bob.setName("Bob");
        do {
            car = new Car();
            System.out.print("\n"+"Please enter in your car's color: ");
            Scanner key = new Scanner(System.in);
            color = key.nextLine().toLowerCase();
            car.setColor(color);
            System.out.print("\n"+"Please enter in your car's brand: ");
            brand = key.nextLine();
            brand = brand.substring(0, 1).toUpperCase() + brand.substring(1).toLowerCase(); // to make my first letter uppercase and everything else lowercase
            car.setBrand(brand);
            System.out.print("\n"+"Please enter in your car's speed: ");
            speed = key.nextInt();
            key.nextLine();
            car.setSpeed(speed);
            cars.add(car);
            System.out.print("\n"+"Do you want to add another car? (Y/N): ");
            addnew = key.nextLine();
        } while (addnew.equalsIgnoreCase("y"));
        int x=1;
            for (Car c : cars) {
                System.out.println("Car "+x+c.getDescription());
                x+=1;
            }
        System.out.println(bob.getName()+" is driving a "+ car.getColor()+" "+car.getBrand()+".");
            // below is the race game that I created to put two cars against each other. Honda only has 33% chance of winning while porshe has a 66% chance of winning.

//        Car porshe = new Car();
//        porshe.setBrand("Porshe");
//        porshe.setColor("Red");
//        porshe.setSpeed(90);
//        Car honda = new Car("Blue","Honda",60);
//        System.out.println(honda.getVehicleStart());
//        System.out.println(porshe.getVehicleStart());
//        System.out.println(honda.getVehicleAccelerate());
//        System.out.println(porshe.getVehicleAccelerate());
//        System.out.println(honda.getVehicleSpeed());
//        System.out.println(porshe.getVehicleSpeed());
//        RandomGenerator index = new RandomGenerator();
//        index.setIndex();
//        Race race = new Race();
//        race.setRace(index.getIndex(),porshe, honda);
//        System.out.println(race.getRace());
//        System.out.println(honda.getVehicleStop());
//        System.out.println(porshe.getVehicleStop());
    }

}
