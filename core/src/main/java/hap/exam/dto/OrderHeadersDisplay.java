package hap.exam.dto;

/**
 * Created by xiangyu.qi on 16/8/26.
 */
public class OrderHeadersDisplay extends OrderHeaders{
	
	private String companyName;
	
	private String customerName;
	
	private Long inventoryItemId;
	
	private Double orderPrice;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryIteamId) {
		this.inventoryItemId = inventoryIteamId;
	}

	public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	
}
