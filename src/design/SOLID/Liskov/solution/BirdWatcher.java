package design.SOLID.Liskov.solution;

class BirdWatcher {
	void watch(FlyingBird bird) { // Not Bird but FlyingBird
        bird.fly(); // <-- expects only flying birds to fly
    }
}
