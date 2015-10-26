/*Given an int n, return the string form of the number followed by "!". 
So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" 
instead of the number, and if the number is divisible by 5 use "Buzz", and if 
divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes 
the remainder after division, so 23 % 10 yields 3. What will the remainder be 
when one number divides evenly into another?*/

public String fizzString2(int n) {
    String str = "";
    if(n % 15 == 0){
        str = "FizzBuzz";
    } else if (n % 3  == 0){
        str = "Fizz";
    } else if (n % 5 == 0){
        str = "Buzz";
    } else {
        str = Integer.toString(n);
    } 
    return str + "!";
}