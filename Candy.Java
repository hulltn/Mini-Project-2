/**
* @author Suraj Shah, Tiernan Hull, Lou Rahm
* @version 2020-10-27
* This program has 2 constructors that have paramaters that print out Candy name. 
* @return candyName
*/

class Candy {
  private String candyName;

  Candy() {
    candyName = "";
  }
  Candy(String aName) {
    candyName = aName;
  }
  void setName(String aName)
  {
    candyName = aName;
  }
  {
    System.out.println("candyName");
  }
}

