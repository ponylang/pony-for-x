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

Please make sure to keep any individual line under 80 characters except in
instance where that would break link with the AsciiDoc (which only happens if
the linked text and url are more than 76 characters).

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


