package corejava.oop.sealed.solution4;


public sealed interface TrafficLight permits  GreenLight, RedLight, YellowLight {
}
