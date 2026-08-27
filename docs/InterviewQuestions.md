# Interview Questions - Core Java Repository

This document summarizes the interview questions covered by the examples in this repository.

## Project Statistics
- **Total Java Classes/Files:** 493

## Interview Categories & Questions

### 1. Java 8 Streams API
Based on `src/corejava/streams` and `src/corejava/streams/questions`:
- How to use `flatMap` to flatten a list of lists?
- Difference between `map()` and `flatMap()`?
- How to group objects by a property using `Collectors.groupingBy`?
- How to find the maximum value in a grouped result?
- How to calculate average, min, and max using `IntStream` or `Collectors`?
- How to filter duplicates from a list using Streams?
- How to sort a Map by keys or values using Streams?
- How to convert a List of objects into a Map?

### 2. Collections Framework
Based on `src/corejava/collections` and `src/corejava/collections/hashcodeequals`:
- Difference between `HashMap` and `HashTable`?
- How does `HashSet` handle duplicate objects? (Role of `hashCode()` and `equals()`)
- Difference between `Comparable` and `Comparator`?
- How to sort a `HashMap` by key?
- When to use `TreeMap` vs `HashMap`?
- How to make a `HashMap` thread-safe?
- Performance difference between `ArrayList` and `LinkedList`?

### 3. Exception Handling
Based on `src/corejava/exceptions` and `src/corejava/exceptions/questions`:
- Can we have a `try` block without `catch`? (Using `finally` or Try-with-resources)
- What is the sequence of catch blocks for hierarchical exceptions?
- Difference between Checked and Unchecked exceptions?
- What happens if an exception is thrown in a constructor?
- Multi-catch block syntax and rules (Java 7+).

### 4. Object-Oriented Programming (OOPs) & Inheritance
Based on `src/corejava/language/encapsulation`, `src/corejava/oop/inheritance/questions`, and `src/corejava/language/keywords`:
- Can we override a `final` method?
- Difference between method overloading and overriding?
- How does `instanceof` pattern matching work in later Java versions?
- Can we override a `static` method? (Method Hiding)
- Use of `super` and `this` keywords in inheritance.
- Abstract classes vs Interfaces (especially with Java 8/9+ default/static/private methods).

### 5. Multithreading & Concurrency
Based on `src/corejava/concurrency/threads` and `src/corejava/concurrency`:
- Difference between `wait()` and `sleep()`?
- How to create a thread using `Runnable` vs `Thread` class?
- What is the `ExecutorService` and how to use it?
- Difference between `synchronized`
- What are Atomic variables (e.g., `AtomicInteger`) and why are they used?

### 6. Java 8/11/17+ Features
Based on `src/corejava/jdkfeatures/java8`, `src/corejava/jdkfeatures/java11`, and `src/corejava`:
- What are Functional Interfaces and `@FunctionalInterface` annotation?
- Lambda expressions syntax and usage.
- New methods in `String` class (Java 11).
- Pattern Matching for `instanceof`.
- Local Variable Type Inference (`var`).

### 7. Miscellaneous
- Serialization and Deserialization in Java.
- Pass by value vs Pass by reference in Java (Java is strictly pass-by-value).
- String pool and String immutability.
- Use of `static` blocks and initializers.

## Detailed Mapping
- For a detailed mapping of every interview question to its corresponding source code file, please refer to [DetailedInterviewQuestions.md](DetailedInterviewQuestions.md).
- For a list of rephrased common interview questions, see [RephrasedInterviewQuestions.md](RephrasedInterviewQuestions.md).
