(ns bin2dec.converter)

(defn string->vector
  "Convert a string representing a binary into a vector."
  [bin]
  (->> (seq bin)
       (map int)
       (mapv #(- % 48))))

(defn pow
  "Calculates the power of a number"
  [base exp]
  (Math/round (Math/pow base exp)))

;; Binary power
(def pow2 (partial pow 2))

(defn bin2dec
  "Convert a binary number into a decimal number"
  [bin-seq]
  (loop [index 0
         result 0
         col (->> bin-seq
                  string->vector
                  reverse)]
    (if (empty? col)
      result
      (recur (inc index)
             (+ result (* (first col) (pow2 index)))
             (rest col)))))
