```groovy
def myMethod(param) {
  if (param == null || param > 10 || param < 1) {
    return 0 // Handle null and out-of-range input
  }
  // ...rest of the code...
}

// Example call in a loop
for (i in 1..10) {
  def result = myMethod(i)
  println result
}
//The loop variable is only used within the loop to avoid errors
```