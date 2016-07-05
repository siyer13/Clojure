; a try catch example
(try
  (/ 10 0)
  (catch Exception e (str "Exception : " (.getMessage e))))


(defn divider [a b]
  (try
    (/ a b)
  (catch java.lang.ArithmeticException e (str (.getMessage e)))))

  (divider 10 5)
