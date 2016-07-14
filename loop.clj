(comment
(loop [iteration 0]
  (if < iteration 10
    (do
  (println "Iteration : " iteration)
  (recur (inc iteration)))
  "END")))

(defn looper []
  (loop [i 0]
    (when (< i 5)
    (println i)
    (recur (inc i)))))


(looper)
