public class ItalianCar implements Engine, Brakes, Electrics, Exhaust, Steering, Suspension, TransmissionSystem, Car {
    @Override
    public String getName() {
        return "Italian car";
    }

    @Override
    public void start() {
        System.out.println("Italian Car starts");

    }

    @Override
    public void idle() {
        System.out.println("Italian Car idles");
    }

    @Override
    public void stop() {
        System.out.println("Italian Car idles");
    }

    @Override
    public void workUnderLoad() {
        System.out.println("Italian Car runs");
    }

    @Override
    public void stopCar() {
        System.out.println("Italian Car stops");
    }

    @Override
    public void slowDown() {
        System.out.println("Italian Car slows down");
    }

    @Override
    public void turnOnLights() {
        System.out.println("Italian Car turns on lights");
    }

    @Override
    public void turnOffLights() {
        System.out.println("Italian Car turns off lights");
    }

    @Override
    public void turnRight() {
        System.out.println("Italian Car turns right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Italian Car turns left");
    }

    @Override
    public void sofMode() {
        System.out.println("Italian Car runs on soft mode");
    }

    @Override
    public void hardMode() {
        System.out.println("Italian Car runs on hard mode");
    }

    @Override
    public void shiftGearsManually() {
        System.out.println("Italian Car runs on manual shift");
    }

    @Override
    public void shiftGearsAutomatically() {
        System.out.println("Italian Car runs on automatic shift");
    }

    @Override
    public void emitEmissions() {
        System.out.println("Italian Car exhausts emissions");
    }

    @Override
    public void turnOnConditioning() {
        System.out.println("Italian Car turns air conditioning");

    }
}
