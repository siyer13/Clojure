(try
  (/ 10 0)
  (catch Exception e (str "Exception : " (.getMessage e))))
