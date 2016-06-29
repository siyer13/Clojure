; let binds name to values and allows to create new scope

(def x 0)
  (let [x 5] (println x) )

; prints global scope value  
x
