package in.hcl.dashboradapi.web;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.hcl.dashboradapi.service.DashboardService;
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = DashboardController.class)
class DashboardControllerTest {
	@Autowired
	MockMvc mockMvc;
	@MockBean
    DashboardService dashboardService;

	@Test
	void test_getTotalTrainings() throws Exception {
		BDDMockito.given(dashboardService.findTotalTrainings()).willReturn((long)10);
		mockMvc.perform(MockMvcRequestBuilders.get("/api/dashboard/1/2"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.totalTrainings").value(10));
		
	}
	
	@Test
	void test_getTotalTrainingHours() throws Exception {
		BDDMockito.given(dashboardService.findTotalHoursOfTrainings(Mockito.anyLong())).willReturn((long)20);
		mockMvc.perform(MockMvcRequestBuilders.get("/api/dashboard/1/1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.totalTrainingHours").value(20));
		
	}
	
	@Test
	void test_getTotalTrainingStatus() throws Exception {
		BDDMockito.given(dashboardService.findTrainingStatus(Mockito.anyString())).willReturn("completed");
		mockMvc.perform(MockMvcRequestBuilders.get("/api/dashboard/1/1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.trainingStatus").value("completed"));
		
	}
	@Test
	void test_getTotalTrainingType() throws Exception {
		BDDMockito.given(dashboardService.findTrainingType(Mockito.anyString())).willReturn("online");
		mockMvc.perform(MockMvcRequestBuilders.get("/api/dashboard/1/1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.trainingType").value("online"));
		
	}
	
	@Test
	void test_getTotalTrainingBudget() throws Exception {
		BDDMockito.given(dashboardService.findTrainingBudget(Mockito.anyString())).willReturn(10000.0);
		mockMvc.perform(MockMvcRequestBuilders.get("/api/dashboard/1/1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.budget").value(10000.0));
		
	}
	@Test
	void test_getTotalTrainingRating() throws Exception {
		BDDMockito.given(dashboardService.findTrainingRating(Mockito.anyString())).willReturn(5.4);
		mockMvc.perform(MockMvcRequestBuilders.get("/api/dashboard/1/1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.trainingRating").value(5.4));
		
	}
	

}