; src: https://clojuredocs.org/clojure.core/->


; (-> x & forms)y

; Threads the expr through the forms.
; Inserts x as the second item in the first form,
; making a list of it if it is not a list already.
; If there are more forms, inserts the first form as the
; second item in second form, etc.


(def x 8)
(-> x (+ 4) (/ 2))

(first (.split (.replace (.toUpperCase "a b c") "B" "X") " "))

(-> "a b c d" .toUpperCase
    (.replace "B" "X")
    (.split " ")
    (first))


(def Person
  {
    :name "Sridhar Iyer"
    :address {
      :street "Bay Area"
      :city "Sanfransico"
      :state "California"
    }
    :employer {
      :name "Google Inc"
      :address {
        :street "Bay Area"
        :city "Sanfransico"
        :state "California"
      }
    }
  })

(-> Person :employer :address :city)
