Write a program when accepts two integers as an input, divides them, then it outputs the result
- The program should handle the exception in case one of the numbers is not an integer by printing an error message (`ArithmeticException`)
- The program should handle the exception in case the denominator = 0 by printing an error message (`InputMismatchException`)
Hint: To accept user input, use java.util.Scanner Class

```
Scanner inputDevice = new Scanner(System.in);
```

Then in order to get an integer:

```
inputDevice.nextInt();
```

