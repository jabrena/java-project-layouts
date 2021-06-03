package info.jab.microservices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MyEndpointE2EMockMVCTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void given_app_when_call_endpoint_single_then_ok() throws Exception {

		//Given
		//When
		//Then
		this.mockMvc
				.perform(get("/api/single")
				//		.contentType(APPLICATION_JSON_VALUE)
				)
				.andDo(print())
				.andExpect(status().isOk());
	}

	@Test
	public void given_app_when_call_endpoint_list_then_ok() throws Exception {

		//Given
		//When
		//Then
		this.mockMvc
				.perform(get("/api/list")
						//		.contentType(APPLICATION_JSON_VALUE)
				)
				.andDo(print())
				.andExpect(status().isOk());
	}
}