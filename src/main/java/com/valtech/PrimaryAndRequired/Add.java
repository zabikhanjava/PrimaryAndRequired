package com.valtech.PrimaryAndRequired;


import com.valtech.PrimaryAndRequired.AddressBookProtos.Person;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

public class Add {

  public List<Integer> sub(int a, int b)
  {
    System.out.println("hello");
    ArrayList<Integer> pop=new ArrayList<>();
    pop.add(a+b);
    return pop;
  }
}
