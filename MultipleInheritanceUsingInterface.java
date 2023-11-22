interface Vehicleone {
    int speed = 90;

    void distance();
}

interface VehicleTwo {
    int distance = 100;

    void speed();
}

class Vehicle implements Vehicleone, VehicleTwo {
    public void distance() {
        int distance = speed * 100;
        System.out.println("Distance travelled is " + distance);
    }

    public void speed() {
        int speed = distance / 100;
        System.out.println("Speed is " + speed);
    }
}

class MultipleInheritanceUsingInterface {
    public static void main(String args[]) {
        Vehicle obj = new Vehicle();
        obj.distance();
        obj.speed();
    }
}