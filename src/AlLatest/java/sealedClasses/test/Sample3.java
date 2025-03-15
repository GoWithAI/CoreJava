package AlLatest.java.sealedClasses.test;

import AlLatest.java.sealedClasses.scenario3.AC;
import AlLatest.java.sealedClasses.scenario3.DC;
import AlLatest.java.sealedClasses.scenario3.Power;

public class Sample3 {
    public static void use(Power power){
        System.out.println(power);
    }

    public static void main(String[] args) {
        use(new AC());
        use(new DC());
    }
}
