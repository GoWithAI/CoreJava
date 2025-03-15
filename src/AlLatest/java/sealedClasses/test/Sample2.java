package AlLatest.java.sealedClasses.test;

import AlLatest.java.sealedClasses.scenario2.AC;
import AlLatest.java.sealedClasses.scenario2.DC;
import AlLatest.java.sealedClasses.scenario2.MyPower;
import AlLatest.java.sealedClasses.scenario2.Power;

public class Sample2 {

    // Library API / Framework API / Utility API / Helper API / Internal API
    public static void use(Power power) {
        if (!(power instanceof AC || power instanceof DC)) {
            throw new RuntimeException("Sorry, Derived instance of this type not allowed");
        }
        System.out.println(power);
    }

    // API User / Client API
    public static void main(String[] args) {
        use(new AC());
        use(new DC());
        use(new MyPower()); // this bad to allow compile time and throw error run time, long run  its not good
        // to tighten code such way everywhere instance of validation and throw error
    }
}
