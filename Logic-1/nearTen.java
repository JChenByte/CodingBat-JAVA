/*Given a non-negative number "num", return true if num is within 2 of a multiple 
of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.*/

public boolean nearTen(int num) {
    if(((num - 1) % 10 == 0) || ((num - 2) % 10 == 0) || ((num + 1) % 10 == 0) 
    	|| ((num + 2) % 10 == 0) || (num % 10 == 0)){
        return true;
    } else {
        return false;
    }
}