# Core Java - interview & practice repository

Practice code and interview questions, organised by topic.

## How it is organised

Every topic lives in one place under `src/corejava/`. Inside a topic:

| Folder | Contains | Use it to |
|---|---|---|
| *(topic sub-packages)* | Concept demos - how the feature works | Learn or refresh |
| `questions/` | Q&A and "what does this print" puzzles | Test yourself |
| `problems/` | Coding katas - write the solution | Practise writing code |

## Topics

| Topic | Files | Covers |
|---|---|---|
| [`oop`](src/corejava/oop) | 106 | Inheritance, overloading, class design, cloning, sealed classes, multiple inheritance |
| [`streams`](src/corejava/streams) | 73 | Creation, intermediate, terminal, numeric, collectors, parallel, sorting |
| [`design`](src/corejava/design) | 56 | SOLID principles and design patterns |
| [`functional`](src/corejava/functional) | 51 | Lambdas, method references, Optional, built-in and custom functional interfaces |
| [`language`](src/corejava/language) | 40 | Keywords, statics, encapsulation, nested types, pattern matching, initialization |
| [`collections`](src/corejava/collections) | 38 | List/Map/Set, ordering, hashCode & equals, cache |
| [`ocajp`](src/corejava/ocajp) | 36 | OCA/OCP certification practice |
| [`concurrency`](src/corejava/concurrency) | 31 | Threads, executors, locks, producer-consumer, CompletableFuture |
| [`exceptions`](src/corejava/exceptions) | 22 | Checked/unchecked, custom exceptions, try-catch-finally |
| [`shared`](src/corejava/shared) | 12 | Sample data (Student, Employee, Order) reused by examples |
| [`jdkfeatures`](src/corejava/jdkfeatures) | 11 | What changed in each Java release |
| [`strings`](src/corejava/strings) | 11 | String pooling, methods, and string coding problems |
| [`datetime`](src/corejava/datetime) | 6 | java.time API |
| [`arrays`](src/corejava/arrays) | 5 | Array basics and array coding problems |
| [`companies`](src/corejava/companies) | 5 | Questions from specific company interviews |
| [`io`](src/corejava/io) | 5 | File reading and serialization |
| [`i18n`](src/corejava/i18n) | 1 | Locale and internationalization |

**Total: 509 Java files across 17 topics.**

## Notes and question lists

| File | What |
|---|---|
| [docs/InterviewQuestions.md](docs/InterviewQuestions.md) | Questions by category, linked to the code |
| [docs/DetailedInterviewQuestions.md](docs/DetailedInterviewQuestions.md) | Question -> answer -> source file table |
| [docs/RephrasedInterviewQuestions.md](docs/RephrasedInterviewQuestions.md) | Same questions, reworded |
| [docs/InterviewQuestion-Asked.md](docs/InterviewQuestion-Asked.md) | Questions actually asked in interviews |
| [docs/notes/](docs/notes) | Topic notes and diagrams |

## Build

```bash
./gradlew compileJava
```

Java 25. All 510 files compile.

308 classes have a `main` method. Run any of them from the IDE, or:

```bash
./gradlew run -Pmain=corejava.strings.problems.BalancedParenthesesKata
```

### Running one class compiles only that class

`run` compiles just the class you name plus whatever it actually references -
two class files, not 623. Nothing else in the repository is looked at, so a
half-finished file in another package cannot affect it.

```bash
./gradlew run -Pmain=corejava.collections.HashSetDuplicateObject
```

### Checking the whole repository

This is a practice repository, so half-finished files are normal. `compileResilient`
compiles everything, drops whatever failed, and compiles again, until what remains is
exactly the set that can compile. Every one of those classes stays runnable no matter
what state the rest of the repository is in.

```bash
./gradlew compileResilient
```
```
Compiled 509 of 510 source files.
1 file(s) could not be compiled and were skipped:
  src/corejava/streams/HalfFinished.java  ->  cannot find symbol
```

The skipped files are also written to `build/broken-files.txt`. This is only for
checking everything at once - running a single class does not use it.

It only compiles what changed, so pressing Run repeatedly does not rebuild the
project: an unchanged build is about 2 seconds, and a one-file edit compiles that
one file. `./gradlew clean classes` forces a full rebuild.
