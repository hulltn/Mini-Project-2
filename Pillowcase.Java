/**
* @author Suraj Shah, Tiernan Hull, Lou Rahm
* @version 2020-10-29
* Creates Pillowcase class, and the methods to grab what is in the Pillowcase
*/

import java.util.ArrayList;
import java.util.Random;


public class Pillowcase{
  private int numberOfCandy;
  private String candyList;
  //not sure if this is the right second instance variable, if not ArrayList below is wrong. Please double check? It initialized right, name would just need changed, same with the return in the getCandy.
  public ArrayList candyList(){
    numberOfCandy = 0;
  }
  //Returns count of candy in bag. Numberic value only.
  public int getTotalCandy(){
    return numberOfCandy();
  }
  //Randomly adds a candy to your pillowcase after each house visited. Also says Trick or Treat when activated
  public int getCandy(){
    system.out.println("Trick or Treat!");
    //This may have to go in the getTotalCandy method, again, not sure 
    Random r = new Random();
    int randomNum = r.nextInt(100) + 1;
    if (randomNum > 0 && <= 10){
      system.out.println("M&M's");
    }
    if (randomNum > 10 && <= 30){
      system.out.println("Pink Starburst");
    }
    if (randomNum > 30 && <= 47){
      system.out.println("Hershey's Bar");
    }
    if (randomNum > 47 && <= 55){
      system.out.println("Milky Way");
    }
    if (randomNum > 55 && <= 68){
      system.out.println("Twix");
    }
    if (randomNum > 68 && <= 93){
      system.out.println("Reese's");
    }
    if (randomNum > 93 && <= 100){
      system.out.println("Kit Kat");
    }
    //Tells how much of each type of candy we received at each house. Adds 1 to nunber of candy each time it loops through
    public int printNumCandies()
    {
      String[] candyList = {"M&M's", "Pink Starburst", "Hershey's Bar", "Milky Way", "Twix", "Reese's", "Kit Kat"};

    }


    
  }
}