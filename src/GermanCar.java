public class GermanCar implements Engine,Brakes,Electrics,Exhaust,Steering,Suspension,TransmissionSystem,Car{


    @Override
    public String getName() {
        return "German car";
    }

    @Override
    public void start() {
        System.out.println("German Car starts");

    }

    @Override
    public void idle() {
        System.out.println("German Car idles");
    }

    @Override
    public void stop() {
        System.out.println("German Car idles");
    }

    @Override
    public void workUnderLoad() {
        System.out.println("German Car runs");
    }

    @Override
    public void stopCar() {
        System.out.println("German Car stops");
    }

    @Override
    public void slowDown() {
        System.out.println("German Car slows down");
    }

    @Override
    public void turnOnLights() {
        System.out.println("German Car turns on lights");
    }

    @Override
    public void turnOffLights() {
        System.out.println("German Car turns off lights");
    }

    @Override
    public void turnRight() {
        System.out.println("German Car turns right");
    }

    @Override
    public void turnLeft() {
        System.out.println("German Car turns left");
    }

    @Override
    public void sofMode() {
        System.out.println("German Car runs on soft mode");
    }

    @Override
    public void hardMode() {
        System.out.println("German Car runs on hard mode");
    }

    @Override
    public void shiftGearsManually() {
        System.out.println("German Car runs on manual shift");
    }

    @Override
    public void shiftGearsAutomatically() {
        System.out.println("German Car runs on automatic shift");
    }

    @Override
    public void emitEmissions() {
        System.out.println("German Car exhausts emissions");
    }

    @Override
    public void turnOnConditioning() {
        System.out.println("German Car turns air conditioning");

    }
}
