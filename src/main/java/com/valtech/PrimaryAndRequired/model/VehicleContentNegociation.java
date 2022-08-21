package com.valtech.PrimaryAndRequired.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleContentNegociation {

  int id;
  String name;
  String country;

}
