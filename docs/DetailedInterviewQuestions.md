# Detailed Interview Questions and Code Coverage

This document provides a detailed mapping of Java interview questions to the specific code examples available in this repository.

## 1. Java 8+ Streams API

| Question | Code Reference |
| :--- | :--- |
| How to use `flatMap` to flatten a list of lists? | `src/corejava/streams/questions/FlatMapExamples.java` |
| How to use `flatMap` on a list of students to extract subjects? | `src/corejava/streams/questions/FlatMapOnStudentList.java` |
| How to group objects by a property and find the maximum value in each group? | `src/corejava/streams/questions/GroupByAndFindMaxValueFromGroup.java` |
| How to find the average, min, and max using numeric streams? | `src/corejava/streams/questions/numeric/AverageMinMaxSum.java` |
| How to find duplicate elements in a stream? | `src/corejava/streams/questions/numeric/FindDuplicateInStream.java` |
| How to sort a collection by multiple parameters? | `src/corejava/streams/questions/SortByMultipleParameter.java` |
| How to transfer data from one HashMap to another using streams? | `src/corejava/streams/questions/TransferFromOneHashMapToAnother.java` |
| How to calculate sum/addition using streams? | `src/corejava/streams/questions/numeric/AdditionEx.java`, `src/corejava/streams/questions/numeric/FlatMapAddition.java` |
| How to use `reduce` for aggregation? | `src/corejava/streams/questions/numeric/StreamReduceEx.java` |

## 2. Collections Framework

| Question | Code Reference |
| :--- | :--- |
| What is the difference between `HashTable` and `HashMap`? | `src/corejava/collections/HashTableVsHashMap.java` |
| How does `HashSet` handle duplicate objects? | `src/corejava/collections/HashSetDuplicateObject.java` |
| How to sort a `HashMap` by key? | `src/corejava/collections/SortHashMapByKey1.java`, `src/corejava/collections/map/SortMapByKey.java` |
| How to make a `HashMap` thread-safe? | `src/corejava/collections/SynchronizeHashMap.java`, `src/corejava/collections/ThreadSafeHashMap$.java` |
| How to use `ArrayDeque`? | `src/corejava/collections/ArrayDeququeEx.java` |
| How to use `PriorityQueue`? | `src/corejava/collections/PriorityQueueEx.java` |
| When to use `TreeSet`? | `src/corejava/collections/TreeSetTest.java` |
| Difference between `Comparable` and `Comparator`? | `src/corejava/collections/ordering` (package) |

## 3. Exception Handling

| Question | Code Reference |
| :--- | :--- |
| Can we have a `try` block without `catch`? | `src/corejava/oop/exception/TryWithoutCatch.java` |
| What is the order of execution in multiple catch blocks? | `src/corejava/oop/exception/CatchBlockExecutionOrder.java` |
| How to handle multiple exceptions in a single catch block (Multi-catch)? | `src/corejava/oop/exception/MultiCatchBlockEx.java` |
| How to use Try-with-resources? | `src/corejava/oop/exception/TryWithResourcesEx.java` |
| What is a `ClassCastException` and how to avoid it? | `src/corejava/oop/exception/ClassCastEx.java` |
| How to use assertions in Java? | `src/corejava/exceptions/questions/AssertEx.java` |

## 4. Object-Oriented Programming (OOPs) & Design

| Question | Code Reference |
| :--- | :--- |
| Can we override a static method? (Method Hiding) | `src/corejava/oop/inheritance/StaticOverride.java` |
| Difference between Abstract Class and Interface? | `src/corejava/oop/classesDesign/AbstractClassEx.java`, `src/corejava/design/abstractClassVsInterface` |
| How to implement the Singleton Design Pattern? | `src/corejava/design/patterns/singleton` (package) |
| How to avoid Singleton destruction by Cloning, Reflection, or Serialization? | `src/corejava/design/patterns/singleton/avoidcloning...` |
| How to create an Immutable class in Java? | `src/corejava/design/designPattern/ImmutableClass/ImmutableStudent.java` |
| What is the Factory Design Pattern? | `src/corejava/design/designPatterns/factory/FactoryPatternEx.java` |
| How to handle Multiple Inheritance conflicts in Java 8 (Default methods)? | `src/corejava/oop/multipleinheritance/conflict` |
| What is the Liskov Substitution Principle (SOLID)? | `src/corejava/design/SOLID/Liskov` |
| What is Dependency Inversion Principle (SOLID)? | `src/corejava/design/SOLID/DI` |

## 5. Multithreading & Concurrency

| Question | Code Reference |
| :--- | :--- |
| How to create a thread by extending `Thread` class? | `src/corejava/concurrency/threads/ThreadByExtendingThread.java` |
| How to create a thread by implementing `Runnable` interface? | `src/corejava/concurrency/threads/ThreadByRunnableEx.java` |
| Difference between Class-level lock and Object-level lock? | `src/corejava/concurrency/threads/ClassLevelLockTest.java`, `src/corejava/concurrency/threads/ObjectLevelLockTest.java` |
| How to solve the Producer-Consumer problem in Java? | `src/corejava/concurrency/producerconsumer` (package) |
| How to print Odd and Even numbers using two threads? | `src/corejava/concurrency/threads/PrintOddEvenNumEx.java`, `src/corejava/concurrency/threads/OddEven.java` |
| What are Atomic variables (e.g., `AtomicInteger`)? | `src/corejava/concurrency/AtomicIntegerEx1.java` |

## 6. Modern Java Features (Java 11, 17, 21+)

| Question | Code Reference |
| :--- | :--- |
| How to use Local Variable Type Inference (`var`)? | `src/corejava/language/localvartypeinference.java` |
| How to use Pattern Matching for `instanceof`? | `src/corejava/language/patternmatching` (package) |
| What are Sealed Classes and how to use them? | `src/corejava/oop/sealed` (package) |
| What are Virtual Threads (Java 21)? | `src/corejava/concurrency` (package) |
| What is Structured Concurrency? | `src/corejava/concurrency` (package) |
| How to run a Java file without a class declaration (Java 21 JEP 445)? | `src/corejava.WithoutClassRunMethod.java` |

## 7. Miscellaneous

| Question | Code Reference |
| :--- | :--- |
| How does Serialization work with Composition? | `src/corejava/io/serialization/CompositionSerialization.java` |
| What is the output of specific inheritance scenarios? | `src/corejava/oop/questions/Inheritance.java` |
| What is the use of `hashCode()` and `equals()`? | `src/corejava/collections/hashcodeequals` (package) |
| Common coding problems solved with Streams? | `src/corejava/streams/problems/dataoperations` |
