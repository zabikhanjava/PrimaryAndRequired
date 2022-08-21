package com.valtech.PrimaryAndRequired;

import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PrimaryAndRequiredApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void something() {

		Optional<String> pop= Optional.empty();//new String("fdfd");
		//	Assertions.assertThat(pop).isEqualTo("top");  //.withFailMessage("acha humko seekha").isPresent();
	}

}
