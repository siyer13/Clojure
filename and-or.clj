; or returns true if any one of the value is true
(println (or (= 1 1) ( = 2 2)))
(println (or (= 1 4) ( = 2 2)))
(println (or (= 1 1) ( = 2 5)))
(println (or (= 1 3) ( = 2 4)))

; or return either the first truthy value or the last value

; and returns true only if both the values are true
(println (and (= 1 1) ( = 2 2)))
(println (and (= 1 4) ( = 2 2)))
(println (and (= 1 1) ( = 2 5)))
(println (and (= 1 3) ( = 2 4)))

; and returns the first falsey value or if no values are falsey, the last truthy value.
; prints Iyer
(and "sridhar" "Iyer")
