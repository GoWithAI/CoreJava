package AlLatest.java.sealedClasses.solution2;

//import AlLatest.java.sealedClasses.test.FlashLight;

// FlashLight - sealed class does not permit outside package to extend it
public sealed interface TrafficeLight permits GreenLight, RedLight, YellowLight, FlashLight { //, FlashLight { // sealed class = class, interface, abstract class
}
