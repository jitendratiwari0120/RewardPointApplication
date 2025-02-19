package rewardPoint.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Customer {
	
	@Id
	private Long id;
	private String name;
	private String rewardsPoint;
	
	public Customer(Long id, String name, String rewardsPoint) {
		super();
		this.id = id;
		this.name = name;
		this.rewardsPoint = rewardsPoint;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRewardsPoint() {
		return rewardsPoint;
	}
	public void setRewardsPoint(String rewardsPoint) {
		this.rewardsPoint = rewardsPoint;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", rewardsPoint=" + rewardsPoint + "]";
	}

}
