package user;

import sealedClasses.light.RedLight;
import sealedClasses.light.TrafficLight;

public class Sample {

    public static void use(TrafficLight trafficLight){
        System.out.println(trafficLight);
    }

    public static void main(String[] args) {
        use(new RedLight());
    }
}
