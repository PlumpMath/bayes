
(ns bayes.example
  (:require [bayes.core :as bayes]
            [clojure.java.io :as io]))

(defn- ^{:doc "This function is to be used as part of a reduction to
  load data for a category from a single-line data file. The data files
  are expected to be in data/ and named after the category. (eg. 'data/sports')"}
  to-training-data [acc category]
  (let [lines (line-seq (io/reader (str "data/" category)))]
    (reduce #(bayes/train category %2 %1) acc lines)))

(defn- ^{:doc "This function loads data for all categories we've got some
  canned training data for and returns it."}
  load-training-data []
  (reduce to-training-data {} ["sports" "arts"]))

(defn ^{:doc "This main method allows running the example from Leiningen:
    lein run"}
  -main[]
  (let [data (load-training-data)
        text "Dustin Johnson wound up with another bizarre penalty Thursday when his caddie thought his tee time was 40 minutes later than it was, and he raced to the first tee at the Northern Trust Open in Los Angeles to avoid disqualification. Johnson was given a two-shot penalty for not being on the tee box at his starting time. Players then have five minutes"]
    (println ">> " text)
    (println "Sports: " (bayes/probability "sports" text data))
    (println "Arts: " (bayes/probability "arts" text data))))

