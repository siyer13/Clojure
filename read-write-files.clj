; write to files
  (use 'clojure.java.io)
  (with-open [wrtr (writer "C:\\Users\\Sridhar\\Documents\\test.txt")]
    (.write wrtr "Line to be written\n")
    (.write wrtr "Another line to be written"))


; read files line by line
(use 'clojure.java.io)
(with-open [rdr (reader "C:\\Users\\Sridhar\\Documents\\test.txt")]
  (doseq [line (line-seq rdr)]
    (println line)))

; append to the file
(use 'clojure.java.io)
(with-open [wrtr (writer "C:\\Users\\Sridhar\\Documents\\test.txt" :append true)]
  (.write wrtr "Line to be appended"))
