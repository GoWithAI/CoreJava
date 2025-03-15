package AlLatest.java.sealedClasses.solution3.user;

import AlLatest.java.sealedClasses.solution3.light.*;

public class Sample {

    public static void use(TrafficLight trafficLight){
        System.out.println(trafficLight);
    }

    public static void main(String[] args) {
        use(new RedLight());
    }
}
