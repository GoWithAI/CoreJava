package AlLatest.java.sealedClasses.solution1;

public sealed interface TrafficeLight { // sealed class = class, inteface, abstract class
}

// If its in same file default 'TestLight' it's part of current files sealed class
final class TestLight implements TrafficeLight{
}

final class RedLight implements TrafficeLight{
}

final class GreenLight implements TrafficeLight{
}

final class YellowLight implements TrafficeLight{
}
