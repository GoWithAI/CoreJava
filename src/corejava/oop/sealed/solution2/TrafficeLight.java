package corejava.oop.sealed.solution2;

//import corejava.oop.sealed.reflection.FlashLight;

// FlashLight - sealed class does not permit outside package to extend it
public sealed interface TrafficeLight permits GreenLight, RedLight, YellowLight, FlashLight { //, FlashLight { // sealed class = class, interface, abstract class
}
