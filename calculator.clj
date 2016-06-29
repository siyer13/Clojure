(defn multiplication
   "Multiplication function"
   [x y]
   (println (* x y)))

(defn addition
  "Addition function"
  [& args]
  (println (apply + args)))


(multiplication 2 3)
(addition 2 3 5 6)
