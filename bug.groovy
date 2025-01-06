```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // Handle null input
  }
  // ...rest of the code...
}

// Example call in a loop
for (i in 1..10) {
  def result = myMethod(i)
  println result
}
//The error happen when the loop reach to the end. After the loop is finish, the value of i is 11. Thus if we try to call this method again myMethod(i) we get an error because 11 is outside the range of loop

//Correct Code
for (i in 1..10) {
  def result = myMethod(i)
  println result
}
```