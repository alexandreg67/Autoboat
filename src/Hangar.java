public class Hangar {
    public static void main(String[] args) {

        Car car = new Car("Renault", 75000);
        Boat boat = new Boat("Titannic", 2000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());

    }
}
