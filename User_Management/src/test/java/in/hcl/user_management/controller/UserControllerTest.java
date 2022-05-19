package in.hcl.user_management.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.hcl.user_management.web.UserController;
import in.hcl.user_management.domain.User;
import in.hcl.user_management.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class)
public class UserControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private UserService userService;

	@Test
	public void testCreateUser() throws Exception {
		User mockUser = new User();
		mockUser.setId(10L);
		mockUser.setUsername("srinidhi");
		mockUser.setAddress("qwerty");
		mockUser.setMobileNo("1234567890");
		mockUser.setCreatedAt(new Date());
		mockUser.setPassword("Sri@1234");
		mockUser.setUpdateAt(new Date());
		mockUser.setUserrole("java");

		String inputInJson = this.mapToJson(mockUser);

		String URI = "/user/register";
		Mockito.when(userService.registerUser(Mockito.any(User.class))).thenReturn(mockUser);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(URI).accept(MediaType.APPLICATION_JSON)
				.content(inputInJson).contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();

		String outputInJson = response.getContentAsString();

		assertThat(outputInJson).isEqualTo(inputInJson);
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);

	}

}
