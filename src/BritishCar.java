public class BritishCar implements Engine,Brakes,Electrics,Exhaust,Steering,Suspension,TransmissionSystem,Car{
   @Override
    public String getName() {
        return "British car";
    }

    @Override
    public void start() {
        System.out.println("British Car starts");

    }

    @Override
    public void idle() {
        System.out.println("British Car idles");
    }

    @Override
    public void stop() {
        System.out.println("British Car idles");
    }

    @Override
    public void workUnderLoad() {
        System.out.println("British Car runs");
    }

    @Override
    public void stopCar() {
        System.out.println("British Car stops");
    }

    @Override
    public void slowDown() {
        System.out.println("British Car slows down");
    }

    @Override
    public void turnOnLights() {
        System.out.println("British Car turns on lights");
    }

    @Override
    public void turnOffLights() {
        System.out.println("British Car turns off lights");
    }

    @Override
    public void turnRight() {
        System.out.println("British Car turns right");
    }

    @Override
    public void turnLeft() {
        System.out.println("British Car turns left");
    }

    @Override
    public void sofMode() {
        System.out.println("British Car runs on soft mode");
    }

    @Override
    public void hardMode() {
        System.out.println("British Car runs on hard mode");
    }

    @Override
    public void shiftGearsManually() {
        System.out.println("British Car runs on manual shift");
    }

    @Override
    public void shiftGearsAutomatically() {
        System.out.println("British Car runs on automatic shift");
    }

    @Override
    public void emitEmissions() {
        System.out.println("British Car exhausts emissions");
    }

    @Override
    public void turnOnConditioning() {
        System.out.println("British Car turns air conditioning");

    }
}
