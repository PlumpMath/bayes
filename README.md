# bayes

Simple library written while working through (http://twitter.com/hmason)"@hmason"'s machine
learning class.  Can be used to do training and classification using the
niave bayes algorithm.

## Usage

```clojure
(:require '[bayes.core :as bayes])

(bayes/train-category "sport" "some player scored a goal")
(bayes/probabbility "sport" "these shoes are great")
```

## TODO

* Performance while training is poor
* Function argument orders needs standardising

## License

Distributed under the Eclipse Public License, the same as Clojure.