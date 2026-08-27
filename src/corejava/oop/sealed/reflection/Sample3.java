package corejava.oop.sealed.reflection;

import corejava.oop.sealed.scenario3.AC;
import corejava.oop.sealed.scenario3.DC;
import corejava.oop.sealed.scenario3.Power;

public class Sample3 {
    public static void use(Power power){
        System.out.println(power);
    }

    public static void main(String[] args) {
        use(new AC());
        use(new DC());
    }
}
