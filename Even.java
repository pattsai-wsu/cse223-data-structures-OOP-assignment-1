// Patrick Tsai
// Programming Assignment 1 - Even
// Even class description - the even class takes in an integer and returns an even number. if the number is even to begin with, it will stay the same. If the integer is odd, then one will be added to the odd integer making it even. The Even class contains 4 arithmetic methos (addition, subtraction, multiplication, and division). There is also a toString() method that returns any integer derived from the class as a english words.
// Due 4/28/2020 - 8:00 AM

public class Even {
  private int n,addOut,addIn,subOut,subIn,mulOut,mulIn,divOut,divIn; // these are private variables used within the Even class
  Even addReturn,subReturn,mulReturn,divReturn;                    // I've had some trouble understanding the usage of private vs public in java.
                                                                   // I believe I have done it correctly. I followed the instructions from the Frac class video posted Friday (4/24)
  // Constructor
  
  
  public Even(int inN) {  // the even constructor makes the integer input into a private int for use
    n=inN;                // within methods found within the Even class
  }

  // toInt Method
  public int toInt() {    // this method takes in the integer and returns an even integer
    if (n%2!=0) {         // adding 1 to the integer if it is odd
      n=n+1;              // or returning the integer as is, if it is even
    }
    return(n);
  }

  // add Method
  public Even add(Even y) {
    addIn=y.toInt();              // this is an unecessary step, but I wanted to created a new variable that is an int of the Even object within the add method call
    addOut=this.toInt()+addIn;    // another unecessary step, but this creates a variable that adds the current Even object (as an intt) to the Even object
                                  // called within the add method (the y object which was changed to an int in the last step)
    addReturn=new Even(addOut);   // this creates a new Even object from the returned value from the last step 
    return(addReturn);
  }

  // subtract  Method
  public Even sub(Even y) {
    subIn=y.toInt();              // this is an unecessary step, but I wanted to created a new variable that is an int of the Even object within the sub method call
    subOut=this.toInt()-subIn;    // another unecessary step, but this creates a variable that subtracts the current Even object (as an int) with the Even object
                                  // called within the sub method (the y object which was changed to an int in the last step)
    subReturn=new Even(subOut);   // this creates a new Even object from the returned value from the last step
    return(subReturn);
  }

  // multiply Method
  public Even mul(Even y) {
    mulIn=y.toInt();              // this is an unecessary step, but I wanted to created a new variable that is an int of the Even object within the mul method call
    mulOut=this.toInt()*mulIn;    // another unecessary step, but this creates a variable that multiplies the current Even object (as an int) with the Even object
                                  // called within the mul method (the y object which was changed to an int in the last step)
    mulReturn=new Even(mulOut);   // this creates a new Even object from the returned value from the last step
    return(mulReturn);
  }

  // divide Method
  public Even div(Even y) {
    divIn=y.toInt();              // this is an unecessary step, but I wanted to created a new variable that is an int of the Even object within the div method call
    divOut=this.toInt()/divIn;    // another unecessary step, but this creates a variable that divides the current Even object (as an int) with the Even object
                                  // called within the div method (the y object which was changed to an int in the last step)
    divReturn=new Even(divOut);   // this creates a new Even object from the returned value from the last step
    return(divReturn);
  }

  // toString Method

  // this method uses an array of english words representing the digits 0-9, and returns them instead of the digits
  // the basic idea is to divide by the largest 10^n then take the modulous and divide by the next largest 10^n and so on
  // the result is a single digit which is then printed as it's english word

  public String toString() {
    String word[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    String neg[]={"negative"};
    if (n<0) {
      n=(-1)*n;
      return neg[0] + " " + toString();
    }
    if (n<10) {
      return word[n] + " ";
    }
    if (n<100) {
      int tempTen=n/10;
      int tempOne=n%10;
      return word[tempTen] + " " + word[tempOne];
    }
    if (n<1000) {
      int tempHund=n/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
    }
    if (n<10000) {
      int tempThou=n/1000;
      int tempHund=(n%1000)/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempThou] + " " + word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
    }
    if (n<100000) {
      int tempTenThou=n/10000;
      int tempThou=(n%10000)/1000;
      int tempHund=(n%1000)/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempTenThou] + " " + word[tempThou] + " " + word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
    }
    // under million 
    if (n<1000000) {
      int tempHundThou=n/100000;
      int tempTenThou=(n%100000)/10000;
      int tempThou=(n%10000)/1000;
      int tempHund=(n%1000)/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempHundThou] + " " + word[tempTenThou] + " " + word[tempThou] + " " + word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
    }
    // under 10 million
    if (n<10000000) {
      int tempMill=n/1000000;
      int tempHundThou=(n%1000000)/100000;
      int tempTenThou=(n%100000)/10000;
      int tempThou=(n%10000)/1000;
      int tempHund=(n%1000)/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempMill] + " " + word[tempHundThou] + " " + word[tempTenThou] + " " + word[tempThou] + " " + word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
    }
    // under 100 million
    if (n<100000000) {
      int tempTenMill=n/10000000;
      int tempMill=(n%10000000)/1000000;
      int tempHundThou=(n%1000000)/100000;
      int tempTenThou=(n%100000)/10000;
      int tempThou=(n%10000)/1000;
      int tempHund=(n%1000)/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempTenMill] + " " + word[tempMill] + " " + word[tempHundThou] + " " + word[tempTenThou] + " " + word[tempThou] + " " + word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
    }
    // under 1 Billion
    if (n<1000000000) {
      int tempHundMill=n/100000000;
      int tempTenMill=(n%100000000)/10000000;
      int tempMill=(n%10000000)/1000000;
      int tempHundThou=(n%1000000)/100000;
      int tempTenThou=(n%100000)/10000;
      int tempThou=(n%10000)/1000;
      int tempHund=(n%1000)/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempHundMill] + " " + word[tempTenMill] + " " + word[tempMill] + " " + word[tempHundThou] + " " + word[tempTenThou] + " " + word[tempThou] + " " + word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
    }
      int tempBill=n/1000000000;
      int tempHundMill=(n%1000000000)/100000000;
      int tempTenMill=(n%100000000)/10000000;
      int tempMill=(n%10000000)/1000000;
      int tempHundThou=(n%1000000)/100000;
      int tempTenThou=(n%100000)/10000;
      int tempThou=(n%10000)/1000;
      int tempHund=(n%1000)/100;
      int tempTen=(n%100)/10;
      int tempOne=n%10;
      return word[tempBill] + " " + word[tempHundMill] + " " + word[tempTenMill] + " " + word[tempMill] + " " + word[tempHundThou] + " " + word[tempTenThou] + " " + word[tempThou] + " " + word[tempHund] + " " + word[tempTen] + " " + word[tempOne];
  }
}
