package corejava.oop.sealed.solution2;


final class FlashLight implements TrafficeLight{
}

public class Sample4 {
    public static void main(String[] args) {
        TrafficeLight light = new RedLight();
        System.out.println(light);
    }
}
