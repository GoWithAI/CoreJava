package AllLatest2026.sealedClasses.solution2;

//import AllLatest2026.sealedClasses.test.FlashLight;

// FlashLight - sealed class does not permit outside package to extend it
public sealed interface TrafficeLight permits GreenLight, RedLight, YellowLight, FlashLight { //, FlashLight { // sealed class = class, interface, abstract class
}
