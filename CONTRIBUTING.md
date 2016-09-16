# Contributing to the Pony for X series

Hi there! Thanks for your interest in contributing to the Pony for X series. The
book is being developed in [AsciiDoc](https://powerman.name/doc/asciidoc) and 
hosted at [Gitbook](https://www.gitbook.com/book/ponylang/pony-for-x/details). 
We welcome external contributors. In fact, we encourage them.

Please note, that by submitting any content to the Pony for X book you are
agreeing that it can be licensed under our [license](LICENSE.md). Furthermore,
you are testifying that you own the copyright to the submitted content and
indemnify Pony for X from any copyright claim that might result from your not
being the authorized copyright holder.

It's best if you are planning on contributing an entire chapter that you reach
out via our [mailing list](https://pony.groups.io/g/book) and let us know what 
you are up to so we can assist you. It would suck if you invested a lot of time
working on a chapter for a language that someone else was already working on.

## How to format a chapter

Each chapter should start with the title of the chapter as a level one header:
`=` in AsciiDoc. Each section of the page should appear as a second level
heading: `==`. If you need to have any subsections, make them a third level
heading: `===`. If you find yourself reaching for a forth level heading, stop
and figure out a different way to present the info in that section.

After the title, before diving into your first section, you should have some
level of expository text that explains what the reader can expect to get out of
reading the page.

Avoid hard-wrapping lines within paragraphs (using line breaks in the middle of or between sentences to make lines shorter than a certain length). Instead, turn on soft-wrapping in your editor and expect the documentation renderer to let the text flow to the width of the container.

## How to update the Table of Contents

Table of contents is handled by the `Summary.md` file. Each chapter of the book
will appear as a top level item in the list contained in `Summary.md`. For
example:

```
* [Pony for C#](csharp.asciidoc)
```

## How to submit a pull request

Once your content is done, please open a pull request against this repo with
your changes. Based on the state of your particular PR, a number of requests for
change might be requested:

* Changes to the content
* Change to where the content appears in the Table of Contents
* Change to where the asciidoc file for the chapter is stored in the repo

Be sure to keep your PR to a single topic or logical change. If you are working
on multiple changes, make sure they are each on their own branch and that
before creating a new branch that you are on the master branch (others multiple
changes might end up in your pull request). To repeat, each PR should be for a
single logical change. We request that you create a good commit messages as laid
out in 
['How to Write a Git Commit Message'](http://chris.beams.io/posts/git-commit/).

If your PR is for a single logical change (which is should be) but spans
multiple commits, we'll ask you to squash them into a single commit before we
merge. Steve Klabnik wrote a handy guide for that: 
[How to squash commits in a GitHub pull request](http://blog.steveklabnik.com/posts/2012-11-08-how-to-squash-commits-in-a-github-pull-request).

## How to compare Pony to language X

The goal of this book is to provide a bridge between langage X and Pony for programmers who are familiar with language X and would like to learn more about Pony. When writing these chapters it one should about why one might use language X, why one might use Pony, and then look for overlapping and divergent concepts.

In order to do that, it is useful to think about particular features of language X, as well as idioms within the language X community, that are interesting and then describe how Pony allows programmers to do something similar. Pony has a `match` statement that is similar to the `match` statement in other languages such as Erlang, but also similar to a `switch` statement in other languages such as Java and C. A discussion of `match` can provide a bridge between Pony and language X by introducing the concept of `match` and how it aligns or does not align with a similar construct in language X. Here is a list of concepts in Pony that may have useful parallels in other languages:
* lambdas
* matches
* for loops
* tuples and tuple destructuring
* case functions
* guard statements on case functions and `match` statements
* standard library data structures (strings, maps, lists, sets, etc)
* actors
* anonymous classes and actors
* reference capabilities
* algebraic types

It is also useful to think about features that exist in Pony that may not exist in langage X and describe to a language X developer the benefits of these features using the features of language X that they already understand. For example, many languages provide for concurrent execution via threads and expect the programmer to coordinate data access using things like synchronized blocks and mutexes, while Pony uses actors and reference capabilities to ensure that there are never data races. The list above provides a good starting point for thinking about these things, but here are a few items that are central to Pony and rarely found in other languages:
* reference capabilities
* actors and message passing
* lack of global variables and constants
* using `primitive`s to represent constants and enums

Finally, language X may have a feature with the same name as a feature in Pony, but they may not behave in exactly the same way. Specifically, these features behave in a way in Pony that might surprise people familiar with them in other languages:
* lambda
* class
* interface
* trait
* actor
The terms "function", "method", and "behavior" also have specific meanings in Pony that may confuse people who have used other languages, so it might be worth discussing them.

When writing examples, try to focus on the interesting features of both languages. For example, most languages have "if ... then ... else" statements, so unless there's a particularly compelling reason to discuss them there's probably no reason to dwell on them. On the other hand, if language X has a system for writing generic classes then it might be worthwhile to compare this to Pony's method.

Each chapter in the book should give a language X developer the confidence to begin reading and writing Pony code based on their existing knowledge of language X.
