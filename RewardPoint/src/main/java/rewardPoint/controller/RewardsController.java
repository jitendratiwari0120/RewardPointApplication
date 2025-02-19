package rewardPoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rewardPoint.service.RewardsService;

@RestController
@RequestMapping("/rewards")
public class RewardsController {
	
	@Autowired
	private RewardsService rewardsService;
	
	@PostMapping("/purchase")
	public ResponseEntity<String> makePurchase(@RequestParam Long customerId, @RequestParam double amount){
		rewardsService.processOurchage(customerId, amount);
		
		return ResponseEntity.ok("purchase recorded and rewards updated");
	}

}
