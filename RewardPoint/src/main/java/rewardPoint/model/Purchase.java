package rewardPoint.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long customerId;
	private double amount;
	private LocalDate purchaseDate;
	
	public Purchase(Long id, Long customerId, double amount, LocalDate purchaseDate) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.amount = amount;
		this.purchaseDate = purchaseDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", customerId=" + customerId + ", amount=" + amount + ", purchaseDate="
				+ purchaseDate + "]";
	}

}
