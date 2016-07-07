(ns calculator.core
  (:gen-class
    :name Calculator
    :methods [(add [Integer Integer] Integer)
              (sayHello [String] String)
              (multiply [Integer Integer] Integer)]
    :state data))

(defn -add
  "addition program"
  [this a b]
  (println (+ a b)))

(defn -sayHello
  [this name]
  (str "Hello " name))

(defn -multiply
  "mulitiplication program"
  [this x y]
  (println ( * x y)))
