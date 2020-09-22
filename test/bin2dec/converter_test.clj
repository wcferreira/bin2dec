(ns bin2dec.converter-test
  (:require [clojure.test :refer :all]
            [bin2dec.converter :as conv]))

(deftest test-returns-zero-when-zero-passed-in
  (let [ret-val (conv/bin2dec "0")]
    (is (= 0 ret-val) "It should return 0 when \"0\" is passed in")))

(deftest test-returns-one-when-one-passed-in
  (let [ret-val (conv/bin2dec "1")]
    (is (= 1 ret-val) "It should return 1 when \"1\" is passed in")))