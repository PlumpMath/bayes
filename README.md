# Bayes

Simple library written while working through [@hmason](http://twitter.com/hmason)'s machine
learning class.  Can be used to do training and classification using the
niave bayes algorithm.

[Read the docs](http://rodnaph.github.com/bayes/)

## Running the example

The library comes with a canned example, showing matching some text against
some categories.  To run it just use Leiningen.

```
lein run
```

## Usage

To simlpy train the classifier on some data and then run a score against it:

```clojure
(:require '[bayes.core :as bayes])

(def data (bayes/train "sport" "some player scored a goal")
(bayes/probability "sport" "these shoes are great" data)
```

When re-training with existing data you can just pass this in.

```clojure
(bayes/train "sport" "some text" data)
```

## Installation

Bayes is available via [Clojars](http://clojars.org).

## License

Distributed under the Eclipse Public License, the same as Clojure.

