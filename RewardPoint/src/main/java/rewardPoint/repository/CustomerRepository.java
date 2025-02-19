package rewardPoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rewardPoint.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}

