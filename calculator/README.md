# Calculator

Calculator program has methods definitions written in clojure to be used in Java program

## Usage

compile the calculator using the following command

```JavaScript
 lein compile

This will create a target folder and will contain calculator.class file
Now put the CalcaulatorTest.java file inside the target folder and compile the java file 

  javac -cp . CalculatorTest.java

Get the clojure.jar and put that file also inside the target folder and run the below command.


  java -cp .;clojure-1.8.0.jar CalculatorTest
