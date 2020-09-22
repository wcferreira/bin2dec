(ns bin2dec.converter-test
  (:require [clojure.test :refer :all]
            [bin2dec.converter :as conv]))

(deftest test-returns-zero-when-zero-passed-in
  (let [ret-val (conv/bin2dec "0")]
    (is (= 0 ret-val) "It should return 0 when \"0\" is passed in")))

(deftest test-returns-one-when-one-passed-in
  (let [ret-val (conv/bin2dec "1")]
    (is (= 1 ret-val) "It should return 1 when \"1\" is passed in")))

(deftest test-returns-two-when-10-passed-in
  (let [ret-val (conv/bin2dec "10")]
    (is (= 2 ret-val) "It should return 2 when \"10\" is passed in")))

(deftest test-returns-three-when-11-passed-in
  (let [ret-val (conv/bin2dec "11")]
    (is (= 3 ret-val) "It should return 3 when \"11\" is passed in")))

(deftest test-returns-four-when-100-passed-in
  (let [ret-val (conv/bin2dec "100")]
    (is (= 4 ret-val) "It should return 4 when \"100\" is passed in")))

(deftest test-returns-five-when-101-passed-in
  (let [ret-val (conv/bin2dec "101")]
    (is (= 5 ret-val) "It should return 5 when \"101\" is passed in")))

(deftest test-returns-six-when-110-passed-in
  (let [ret-val (conv/bin2dec "110")]
    (is (= 6 ret-val) "It should return 6 when \"110\" is passed in")))