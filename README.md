# Pony for X

Hello and welcome to "Pony for X". Pony for X is a series of introductions to
the [Pony](http://www.ponylang.org) programming language aimed at people who
already know other languages. Each chapter is aimed at users of a specific
language. Currently we have chapters on C#, Erlang, JavaScript and Java
underway. If you are interested in contributing, please see our
[contributing](CONTRIBUTING.md) documentation.

## Why Pony?

Pony is an open-source, object-oriented, actor-model, capabilities-secure, high 
performance programming language. It fully recognizes that the future of 
software development will have to focus on multicore and distributed programs, 
and that these programs will have to guarantee safety and correct execution.

Pony's two main focuses are performance and safety, but it has a slew of other 
nice features as well.

### Performance

Pony gives us small and fast programs by compiling to optimized native code, 
instead of running on a resource demanding virtual machine compiling at runtime 
with a JIT-compiler. Pony also gives us platform portability by using the 
powerful LLVM backend to produce native binaries for multiple CPUs and OSs.

Pony implements the well-known actor model also used by Erlang and Akka, but 
with more guarantees and delivering better performance. Actors are the basic 
building blocks of every Pony program, and if needed, millions of actors 
(each consuming very little resources) can work together in parallel to get 
things done.

With Pony we are able to focus on our algorithms and run them on multicore 
hardware, and worry less about fiddling with error prone primitives like 
threads and locks.

 * Examples of languages that generate native binaries
    * C/C++ (gcc, LLVM)
    * Go (custom backend)
    * Swift (LLVM)
    * Rust (LLVM)
    * **Pony** (LLVM)

 * Examples of languages that use VMs and JIT-compilers
     * Java (JVM)
     * C# (.Net CLR)
     * Python

### Safety

Pony gives safety on every front so that no Pony program will ever crash. It 
does this by:

 * applying strong type guarantees.
 * implementing concurrent, per-actor garbage collection.
 * not allowing any null or uninitialized values.
 * not allowing shared mutable state.
 * not allowing uncaught exceptions.
 * extending the type system with additional qualifiers (called reference 
 capabilities) making it safe to work on data with multiple actors, while 
 avoiding data-races and deadlocks.

### Other Nice Features

 * Pony is simple and approachable, with a clean and concise syntax that is a 
 bit like a sweet mix of Python, Ruby and Scala.
 * Pony is Object Oriented with classes, interfaces and traits, plus it has 
 some functional elements that are a bit like Scala or Erlang.
 * Pony is strongly and statically typed, plus its type system is more powerful 
 and less constricting than most statically typed languages, and has handy 
 features like algebraic types.
 * Pony’s ponyc compiler is fast, which makes it a joy to use.
