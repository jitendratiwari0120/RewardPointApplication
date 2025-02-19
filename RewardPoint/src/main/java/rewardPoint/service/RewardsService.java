package rewardPoint.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rewardPoint.model.Customer;
import rewardPoint.model.Purchase;
import rewardPoint.repository.CustomerRepository;
import rewardPoint.repository.PurchaseRepository;

@Service
public class RewardsService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	public int calculateRewards(double amount) {
		int points = 0;
		if(amount > 100) {
			points += (int)((amount - 100)*2);
			amount = 100;
		}
		if(amount > 50) {
			points += (int)((amount - 50)*1);
		}
		return points;	
	}
	public void processOurchage(Long customerId, double amount) {
		int points = calculateRewards(amount);
		
		Customer customer = customerRepository.findById(customerId).orElseThrow();
		
		customer.setRewardsPoint(customer.getRewardsPoint() + points);
		
		customerRepository.save(customer);
		
		Purchase purchase = new Purchase(customerId, customerId, amount, null);
		purchase.setCustomerId(customerId);
		purchase.setAmount(amount);
		purchase.setPurchaseDate(LocalDate.now());
		
		
	}
	
	

}
