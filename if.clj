; understanding if in clojure

(if true
  "This will be printed" ; this line gets printed
  "This will not be printed" ; this will be printed only otherwise
)

(if false
    "This will not be printed" ; since its false this line will not be printed
    "This will be printed" ; this will be printed because its false
)

; The do operator lets you wrap up multiple forms in parentheses and run each of them

(if true
  (do
    (println "Since this is true this will be printed")
    (println "also because this is in do this will also be printed")
    "Above two statements will get executed")
    "However this will not be printed")
