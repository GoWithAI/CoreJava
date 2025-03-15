package AlLatest.java.sealedClasses.solution1;

// If interface is only sealed then implementing class should be in same file
/*class FlashingLight implements TrafficeLight {
}*/

public class SampleSolution1 {
    public static void main(String[] args) {
        TrafficeLight light = new RedLight();
        System.out.println(light);
    }
}
