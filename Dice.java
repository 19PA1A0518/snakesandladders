//import java.util.*;
//import java.lang.*;
class Dice {
  int min;
  int max;
  Dice(int min,int max){
      this.min=min;
      this.max=max;
  }
  public int rollTheDice(){
      return min+(int)(Math.random()*((max-min)+1));
  }  
}
