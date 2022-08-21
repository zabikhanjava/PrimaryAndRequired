package com.valtech.PrimaryAndRequired.mock;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.valtech.PrimaryAndRequired.Add;
import com.valtech.PrimaryAndRequired.AddService;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = "odp.base-url=https://localhost:32324")
//@ExtendWith({WiremockClientCertExtension.class, EventHubConsumerAndProducerShutdownExtension.class})
//@ContextConfiguration(initializers = SystemPropertyContextInitializer.class)
class MockTest {

  @Mock
  Add add;

  @InjectMocks
  AddService sercice;

  @LocalServerPort()
  private int port;

  private String baseUrl;

  @Test
  void contextLoads() {
  }

  @Test
  void pop() {

    //when(add.sub()).thenReturn(List.of(12));
    List s = sercice.subservice(10, 20);
//    assertThat(s.size()).isEqualTo(1);
    ///  assertThat(s.get(0)).isEqualTo(12);

   // verify(add, times(1)).sub(10, somesetter.getB());
  }


  @BeforeEach
  void setUp() {
    baseUrl = String.format("http://localhost:%d", port);
  }

 /* @Test
  void removeVehicleFromUser() {
    final String url = baseUrl + String.format("/api/usermanagement/users/v1/users/%s/vehicles/%s", user, vin);

    final ResponseEntity<String> responseEntity = .execute();
  }*/
}

class somesetter {

  static int a;
  static int b;

  static public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  static public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }
}