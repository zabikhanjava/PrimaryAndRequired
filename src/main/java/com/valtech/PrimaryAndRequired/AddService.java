package com.valtech.PrimaryAndRequired;


import java.util.List;
import com.valtech.PrimaryAndRequired.Add;
import org.springframework.beans.factory.annotation.Autowired;

public class AddService {

  Add add;

  public List subservice(int a, int b) {

    return add.sub(a,b);

  }
}
