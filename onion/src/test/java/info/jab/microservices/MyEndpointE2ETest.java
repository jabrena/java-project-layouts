package info.jab.microservices;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyEndpointE2ETest {

	Logger LOGGER = LoggerFactory.getLogger(MyEndpointE2ETest.class);

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void given_app_when_call_endpoint_single_then_ok() {

		//Given

		//When
		String address = "http://localhost:" + port + "/api/single";

		ResponseEntity<String> response = restTemplate.getForEntity(address, String.class);

		//Then
		then(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void given_app_when_call_endpoint_list_then_ok() {

		//Given

		//When
		String address = "http://localhost:" + port + "/api/list";

		ResponseEntity<String> response = restTemplate.getForEntity(address, String.class);

		//Then
		then(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}