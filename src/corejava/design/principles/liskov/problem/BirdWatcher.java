package corejava.design.principles.liskov.problem;
class BirdWatcher {
    void watch(Bird bird) {
        bird.fly(); // <-- expects all birds to fly, but Penguin cannot fly - Voilation of "Liskov Substitution Principle"
    }
}
