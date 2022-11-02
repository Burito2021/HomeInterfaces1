public class SpanishCar implements Engine, Brakes, Electrics, Exhaust, Steering, Suspension, TransmissionSystem, Car {
      @Override
      public String getName() {
          return "Spanish car";
      }
    @Override
    public void start() {
        System.out.println("Spanish Car starts");

    }

    @Override
    public void idle() {
        System.out.println("Spanish Car idles");
    }

    @Override
    public void stop() {
        System.out.println("Spanish Car idles");
    }

    @Override
    public void workUnderLoad() {
        System.out.println("Spanish Car runs");
    }

    @Override
    public void stopCar() {
        System.out.println("Spanish Car stops");
    }

    @Override
    public void slowDown() {
        System.out.println("Spanish Car slows down");
    }

    @Override
    public void turnOnLights() {
        System.out.println("Spanish Car turns on lights");
    }

    @Override
    public void turnOffLights() {
        System.out.println("Spanish Car turns off lights");
    }

    @Override
    public void turnRight() {
        System.out.println("Spanish Car turns right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Spanish Car turns left");
    }

    @Override
    public void sofMode() {
        System.out.println("Spanish Car runs on soft mode");
    }

    @Override
    public void hardMode() {
        System.out.println("Spanish Car runs on hard mode");
    }

    @Override
    public void shiftGearsManually() {
        System.out.println("Spanish Car runs on manual shift");
    }

    @Override
    public void shiftGearsAutomatically() {
        System.out.println("Spanish Car runs on automatic shift");
    }

    @Override
    public void emitEmissions() {
        System.out.println("Spanish Car exhausts emissions");
    }

    @Override
    public void turnOnConditioning() {
        System.out.println("Spanish Car turns air conditioning");

    }
}
