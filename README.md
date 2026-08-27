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

Java 25. Most classes have a `main` method - run any of them directly from the IDE.

Three files are excluded from the build because they have pre-existing compile
errors; they are listed in `build.gradle`.
