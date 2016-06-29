; {} map datastructure

({:map "key-value pair"} :map)

; hash-map creates a map
(hash-map :boy 10 :girl 8)


; vector is similar to 0 indexed ArraySeq
; outputs 4
(get [0 3 4 5] 2)

; vector is used to create vectors
(vector 1 2 3 4 5 6)

(def v (vector 1 2 3 4 5 6))
(get v 3)


; lists
'(1 2 3 4)


;Sets are collections of unique values. Clojure has two kinds of sets: hash sets and sorted sets.
#{1 2 3 4 5 }


(contains? #{1 2 3 4 5} 5)

; anonymous function
(#(* % %2) 9 5)
