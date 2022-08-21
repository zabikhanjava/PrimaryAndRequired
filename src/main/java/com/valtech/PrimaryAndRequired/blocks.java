package com.valtech.PrimaryAndRequired;


import org.w3c.dom.ls.LSOutput;

public class blocks {

  public static void main(String[] args) {
    System.out.println("from main"+idontknow.class);
    idontknow idontknow=new idontknow();
    idontknow.sefd();
  }
}
class idontknow extends parent
{
  static int a;
  static
  {
    System.out.println("static block"+a);
  }
  idontknow(int a)
  {
    System.out.println("cons block"+a);

  }
  idontknow()
{
  System.out.println("cons block"+a);
  this.sefd();

}

}
class parent
{
  public void sefd()
  {
    System.out.println("super me safd");
  }
}