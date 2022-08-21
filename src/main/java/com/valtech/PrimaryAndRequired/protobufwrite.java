package com.valtech.PrimaryAndRequired;


import com.valtech.PrimaryAndRequired.AddressBookProtos.AddressBook;
import com.valtech.PrimaryAndRequired.AddressBookProtos.Person;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class protobufwrite {

  public static void main(String[] args) {

    Person person=Person.newBuilder().setEmail("zabikhan6565@gmail.com").setId(12).setName("khan").build();
    System.out.println(person);
    String filename = "greeting_protobuf_output";
    System.out.println("Saving greeting to file: " + filename);

    try(FileOutputStream output = new FileOutputStream(filename)){
      person.writeTo(output);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Saved greeting with following data to disk: \n" + person);

  }
}
