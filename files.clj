(spit "text.txt"
 "Learning clojure - a new programming language")

(slurp "text.txt")


(let [file (java.io.File. "g:/")]
   (println (.exists file))
   (println (.canWrite file))
   (println (.getPath file)))
