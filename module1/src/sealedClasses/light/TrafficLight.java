package sealedClasses.light;

// Class is not allowed to extend sealed class from another package
public sealed interface TrafficLight permits BlinkingLight, GreenLight, RedLight, YellowLight {
    // if modules then only SmartLight in diff package can be extended
    //, SmartLight {
}

final class BlinkingLight implements TrafficLight {
}