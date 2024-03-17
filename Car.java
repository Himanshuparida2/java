class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.speed, otherCar.speed);
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed;
    }
}

class CarDriver {
    public static void main(String[] Himanshu) {
        Car car1 = new Car("Toyota", "Red", 180);
        Car car2 = new Car("Honda", "Blue", 200);

        int comparison = car1.compareTo(car2);
        if (comparison < 0) {
            System.out.println("Car 2 is faster: ");
            System.out.println(car2);
        } else if (comparison > 0) {
            System.out.println("Car 1 is faster: ");
            System.out.println(car1);
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}