(ns dbunit-export.core-test
  (:require [clojure.test :refer :all]
            [dbunit-export.core :refer :all]))

(deftest a-test
  (testing "Simple test"
    (prn (System/getenv "PORT"))
    (is (= 1 1))))
