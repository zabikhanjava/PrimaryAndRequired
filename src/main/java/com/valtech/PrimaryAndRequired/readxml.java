package com.valtech.PrimaryAndRequired;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import lombok.Data;
import org.apache.commons.io.FileUtils;
@Data
public class readxml {

  public static void main(String[] args) throws XMLStreamException, JAXBException, IOException {

  /*  try {

      File xmlFile = new File("src/main/java/com/valtech/PrimaryAndRequired/emp.xml");

      JAXBContext jaxbContext = JAXBContext.newInstance(EmpRequest.class);

      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      EmpRequest que =(EmpRequest)jaxbUnmarshaller.unmarshal(xmlFile);
      System.out.println(que.getName());

    } catch (JAXBException e) {
      e.printStackTrace();
    }*/

/*
    InputStream stream =  retrieveByteArrayInputStream(new File("src/main/java/com/valtech/PrimaryAndRequired/emp.xml"));
    JAXBContext jaxbContext2 = JAXBContext.newInstance(EmpRequest.class);
    Unmarshaller jaxbUnmarshaller2 = jaxbContext2.createUnmarshaller();
    XMLInputFactory factory = XMLInputFactory.newInstance();
    XMLEventReader someSource = factory.createXMLEventReader(stream);
    JAXBElement<EmpRequest> userElement = jaxbUnmarshaller2.unmarshal(someSource, EmpRequest.class);
    System.out.println(userElement.getValue().getName());
  }
  public static ByteArrayInputStream retrieveByteArrayInputStream(File file) throws IOException {
    return new ByteArrayInputStream(FileUtils.readFileToByteArray(file));
  }*/

/*
    String xmlString = "<EmpRequest>" +
        "        <id>101</id>" +
        "        <name>IT</name>" +
        "</EmpRequest>";

    JAXBContext jaxbContext;
    try
    {
      jaxbContext = JAXBContext.newInstance(EmpRequest.class);

      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

      EmpRequest employee = (EmpRequest) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));

      System.out.println(employee.getName());
    }
    catch (JAXBException e)
    {
      e.printStackTrace();
    }
  }*/
  }
}