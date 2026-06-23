package AllLatest2026.sealedClasses.solution3.user;

import AllLatest2026.sealedClasses.solution3.light.*;

public class Sample {

    public static void use(TrafficLight trafficLight){
        System.out.println(trafficLight);
    }

    public static void main(String[] args) {
        use(new RedLight());
    }
}
