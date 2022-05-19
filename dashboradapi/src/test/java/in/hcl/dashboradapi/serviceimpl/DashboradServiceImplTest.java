/**
 * 
 */
package in.hcl.dashboradapi.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import in.hcl.dashboradapi.service.DashboardService;

/**
 * @author manesambhaji.sadas
 *
 */
class DashboradServiceImplTest {
	@InjectMocks
	private DashboardService dashboardService;
	
	@BeforeEach
	void setUp() throws Exception {
		this.dashboardService=new DashboardServiceImpl();
	}

	@Test
	void test_givenStringEmployeeAndLongIdAsParameter_ShouldReturnTotalTrainings() throws Exception  {
			Long trainings =dashboardService.findTotalTrainings();
			assertEquals( 0, trainings);	
		}
	@Test
	void test_givenStringEmployeeAndLongIdAsParameter_ShouldReturnTotalHoursOfTrainings() throws Exception  {
			Long trainingHours =dashboardService.findTotalHoursOfTrainings((long) 2);
			assertEquals( 0, trainingHours);	
		}
	
	@Test
	void test_givenLongUserIdAndLongTrainingIdAsParameter_ShouldReturnTrainingStatus() throws Exception  {
			String trainingStatus =dashboardService.findTrainingStatus("");
			assertEquals( "Completed", trainingStatus);	
		}
	
	@Test
	void test_givenLongUserIdAndLongTrainingIdAsParameter_ShouldReturnTrainingType() throws Exception  {
			String trainingStatus =dashboardService.findTrainingType("");
			assertEquals( "Online", trainingStatus);	
		}
	
	@Test
	void test_givenLongUserIdAndLongTrainingIdAsParameter_ShouldReturnTrainingBudget() throws Exception  {
			Double trainingBudget =dashboardService.findTrainingBudget("");
			assertEquals( 0.0, trainingBudget);	
		}
	
	@Test
	void test_givenLongUserIdAndLongTrainingIdAsParameter_ShouldReturnTrainingAverageTrainingRating() throws Exception  {
			Double trainingRating =dashboardService.findTrainingRating("");
			assertEquals( 0.0, trainingRating);	
		}
	

}
