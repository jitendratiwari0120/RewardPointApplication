package rewardPoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rewardPoint.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
	
}