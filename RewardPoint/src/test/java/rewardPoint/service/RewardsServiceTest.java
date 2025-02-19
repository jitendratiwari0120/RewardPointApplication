package rewardPoint.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import rewardPoint.repository.CustomerRepository;
import rewardPoint.repository.PurchaseRepository;
public class RewardsServiceTest {

	@Mock
    private CustomerRepository customerRepository;

    @Mock
    private PurchaseRepository purchaseRepository;

    @InjectMocks
    private RewardsService rewardsService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateRewards() {
        // Test case where amount is greater than 100
        assertEquals(90, rewardsService.calculateRewards(120));

        // Test case where amount is between 50 and 100
        assertEquals(50, rewardsService.calculateRewards(100));

        // Test case where amount is less than 50
        assertEquals(0, rewardsService.calculateRewards(30));
    }
}