package com.valtech.PrimaryAndRequired;


import com.valtech.PrimaryAndRequired.AddressBookProtos.Person;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class protobufread {

  public static void main(String[] args) {
    Person.Builder greetBuilder = Person.newBuilder();


    String filename = "greeting_protobuf_output";
    System.out.println("Reading from file " + filename);

    try(FileInputStream input = new FileInputStream(filename)) {
      Person person = greetBuilder.mergeFrom(input).build();
      System.out.println("Greeting: " + person.getId() + "\n" + "Username: " + person.getName());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
