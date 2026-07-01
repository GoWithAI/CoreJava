package AllLatest2025.sealedClasses.test;

import AllLatest2025.sealedClasses.scenario3.AC;
import AllLatest2025.sealedClasses.scenario3.DC;
import AllLatest2025.sealedClasses.scenario3.Power;

public class Sample3 {
    public static void use(Power power){
        System.out.println(power);
    }

    public static void main(String[] args) {
        use(new AC());
        use(new DC());
    }
}
