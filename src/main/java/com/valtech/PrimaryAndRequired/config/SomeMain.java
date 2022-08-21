package com.valtech.PrimaryAndRequired.config;

import java.sql.SQLOutput;

public class SomeMain {

  public static void main(String[] args) {
    SomeMain someMain = new SomeMain();
     someMain.sain(1);
    //someMain.easyreverse(1);
    someMain.hardreverse(10);
  }

  boolean sain(int num) {
    if (num <= 10 && display(num) && sain(num + 1)) {
    }
    return false;
  }

  void easy(int num) {

    if (num >= 10) {
    } else {
      System.out.println(num);
      easy(num + 1);
    }
  }

  void hard(int num) {

    if (num < 1) {
    } else {
      hard(num - 1);
      System.out.println(num);
    }
  }
  void easyreverse(int num) {

    if (num >= 10) {
    } else {
      easyreverse(num + 1);
      System.out.println(num);

    }
  }

  void hardreverse(int num) {

    if (num < 1) {
    } else {
      System.out.println(num);

      hardreverse(num - 1);
    }
  }
  public boolean display(int num) {
    System.out.println(num);
    return true;
  }

  public int geneartenumber(int i) {
    int z = 1;
    if (i > 10) {
      return 10;
    } else {
      return geneartenumber(i) * z;

    }
  }

}



  /*public void pahadesida(int i)
  {
    int resl;
    int n=3;
    if(i>=10)
      return 1;
    resl=pahadesida(i-1);
    System.out.println(i+"*"+n+"="+resl);
  }
  public int pahadeulta(int i)
  {

  }
}*/