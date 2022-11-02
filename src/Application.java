public class Application {
    public static void main(String[] args) {
        var golf7 = new GermanCar();
        var ferrari = new ItalianCar();
        var bg6 = new BritishCar();
        var seat2 = new SpanishCar();
        runCar(ferrari);
        runCar(ferrari);
        runCar(golf7);
        runCar(bg6);
        runCar(seat2);

        washStation(ferrari);
        washStation(golf7);
        washStation(bg6);
        washStation(seat2);

    }

    public static void runCar(Car car) {
        car.start();
        car.emitEmissions();
        car.shiftGearsAutomatically();


    }

    public static void washStation(Car car) {
       System.out.println("washing the " + car.getClass().getName());
    }

}

