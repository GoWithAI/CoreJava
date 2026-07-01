# Detailed Interview Questions and Code Coverage

This document provides a detailed mapping of Java interview questions to the specific code examples available in this repository.

## 1. Java 8+ Streams API

| Question | Code Reference |
| :--- | :--- |
| How to use `flatMap` to flatten a list of lists? | `src/streamInterviewQA/FlatMapExamples.java` |
| How to use `flatMap` on a list of students to extract subjects? | `src/streamInterviewQA/FlatMapOnStudentList.java` |
| How to group objects by a property and find the maximum value in each group? | `src/streamInterviewQA/GroupByAndFindMaxValueFromGroup.java` |
| How to find the average, min, and max using numeric streams? | `src/streamInterviewQA/numeric/AverageMinMaxSum.java` |
| How to find duplicate elements in a stream? | `src/streamInterviewQA/numeric/FindDuplicateInStream.java` |
| How to sort a collection by multiple parameters? | `src/streamInterviewQA/SortByMultipleParameter.java` |
| How to transfer data from one HashMap to another using streams? | `src/streamInterviewQA/TransferFromOneHashMapToAnother.java` |
| How to calculate sum/addition using streams? | `src/streamInterviewQA/numeric/AdditionEx.java`, `src/streamInterviewQA/numeric/FlatMapAddition.java` |
| How to use `reduce` for aggregation? | `src/streamInterviewQA/numeric/StreamReduceEx.java` |

## 2. Collections Framework

| Question | Code Reference |
| :--- | :--- |
| What is the difference between `HashTable` and `HashMap`? | `src/AllLatest2025/collections/HashTableVsHashMap.java` |
| How does `HashSet` handle duplicate objects? | `src/AllLatest2025/collections/HashSetDuplicateObject.java` |
| How to sort a `HashMap` by key? | `src/AllLatest2025/collections/SortHashMapByKey1.java`, `src/AllLatest2025/map/SortMapByKey.java` |
| How to make a `HashMap` thread-safe? | `src/AllLatest2025/collections/SynchronizeHashMap.java`, `src/AllLatest2025/collections/ThreadSafeHashMap.java` |
| How to use `ArrayDeque`? | `src/AllLatest2025/collections/ArrayDeququeEx.java` |
| How to use `PriorityQueue`? | `src/AllLatest2025/collections/PriorityQueueEx.java` |
| When to use `TreeSet`? | `src/AllLatest2025/collections/TreeSetTest.java` |
| Difference between `Comparable` and `Comparator`? | `src/comparatorVsComparableEx1` (package) |

## 3. Exception Handling

| Question | Code Reference |
| :--- | :--- |
| Can we have a `try` block without `catch`? | `src/interviewQuestions/exception/TryWithoutCatch.java` |
| What is the order of execution in multiple catch blocks? | `src/interviewQuestions/exception/CatchBlockExecutionOrder.java` |
| How to handle multiple exceptions in a single catch block (Multi-catch)? | `src/interviewQuestions/exception/MultiCatchBlockEx.java` |
| How to use Try-with-resources? | `src/interviewQuestions/exception/TryWithResourcesEx.java` |
| What is a `ClassCastException` and how to avoid it? | `src/interviewQuestions/exception/ClassCastEx.java` |
| How to use assertions in Java? | `src/interviewQuestions/exception/AssertEx.java` |

## 4. Object-Oriented Programming (OOPs) & Design

| Question | Code Reference |
| :--- | :--- |
| Can we override a static method? (Method Hiding) | `src/interviewQuestions/inheritance/StaticOverride.java` |
| Difference between Abstract Class and Interface? | `src/interviewQuestions/classesDesign/AbstractClassEx.java`, `src/design/abstractClassVsInterface` |
| How to implement the Singleton Design Pattern? | `src/design/designPattern/singleton` (package) |
| How to avoid Singleton destruction by Cloning, Reflection, or Serialization? | `src/design/designPattern/singleton/avoidCloning...` |
| How to create an Immutable class in Java? | `src/design/designPattern/ImmutableClass/ImmutableStudent.java` |
| What is the Factory Design Pattern? | `src/design/designPatterns/factory/FactoryPatternEx.java` |
| How to handle Multiple Inheritance conflicts in Java 8 (Default methods)? | `src/design/multipleInheritance/Conflict` |
| What is the Liskov Substitution Principle (SOLID)? | `src/design/SOLID/Liskov` |
| What is Dependency Inversion Principle (SOLID)? | `src/design/SOLID/DI` |

## 5. Multithreading & Concurrency

| Question | Code Reference |
| :--- | :--- |
| How to create a thread by extending `Thread` class? | `src/multithreading/ThreadByExtendingThread.java` |
| How to create a thread by implementing `Runnable` interface? | `src/multithreading/ThreadByRunnableEx.java` |
| Difference between Class-level lock and Object-level lock? | `src/multithreading/ClassLevelLockTest.java`, `src/multithreading/ObjectLevelLockTest.java` |
| How to solve the Producer-Consumer problem in Java? | `src/multithreading/producerConsumer` (package) |
| How to print Odd and Even numbers using two threads? | `src/multithreading/PrintOddEvenNumEx.java`, `src/multithreading/OddEven.java` |
| What are Atomic variables (e.g., `AtomicInteger`)? | `src/concurrencyPackage/AtomicIntegerEx1.java` |

## 6. Modern Java Features (Java 11, 17, 21+)

| Question | Code Reference |
| :--- | :--- |
| How to use Local Variable Type Inference (`var`)? | `src/AlLatest/java/VarVariableIntroduced.java` |
| How to use Pattern Matching for `instanceof`? | `src/AlLatest/java/instanceOfPatternMatching` (package) |
| What are Sealed Classes and how to use them? | `src/AlLatest/java/sealedClasses` (package) |
| What are Virtual Threads (Java 21)? | `src/AlLatest/java/virtualThread` (package) |
| What is Structured Concurrency? | `src/AlLatest/java/structuredConcurrency` (package) |
| How to run a Java file without a class declaration (Java 21 JEP 445)? | `src/AlLatest/java/AllLatest2025.WithoutClassRunMethod.java` |

## 7. Miscellaneous

| Question | Code Reference |
| :--- | :--- |
| How does Serialization work with Composition? | `src/serializationDeserilization/CompositionSerialization.java` |
| What is the output of specific inheritance scenarios? | `src/interviewQuestions/output/Inheritance.java` |
| What is the use of `hashCode()` and `equals()`? | `src/hashCodeEquals` (package) |
| Common coding problems solved with Streams? | `src/problemStatment/stream` |
