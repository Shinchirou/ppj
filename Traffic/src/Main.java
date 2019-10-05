public class Main {

    public static void main(String[] args) {
        TrafficLight trafficLight1 = new TrafficLight("Green");
        TrafficLight trafficLight2 = new TrafficLight("Red");

        System.out.println("The state of light 1 is " + trafficLight1.getState());
        trafficLight1.yellow();
        System.out.println("The state of light 1 is " + trafficLight1.getState());
        trafficLight2.green();
        System.out.println("The state of light 2 is " + trafficLight2.getState());
        trafficLight2.yellow();
        System.out.println("The state of light 2 is " + trafficLight2.getState());


        TrafficLight trafficLight3 = new TrafficLight("green", "LED");

        System.out.println(trafficLight3);

    }

}
