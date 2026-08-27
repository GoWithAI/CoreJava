package corejava.oop.sealed.solution4;

// all sealed class subclass should be final or sealed
sealed class RedLight implements TrafficLight permits OnOffLight {
}
