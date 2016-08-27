package hap.exam.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xiangyu.qi on 16/8/26.
 */

@Table(name="hap_om_order_lines")
public class OrderLines {
	
	@Id
    @Column
    @GeneratedValue
    private Long lineId;

	@Column
    private Long headerId;

	@Column
    private Long lineNumber;

	@Column
    private Long inventoryItemId;

	@Column
    private Long orderdQuantity;

	@Column
    private String orderQuantityUom;
	
	@Column
    private Long unitSellingPrice;
	
	@Column
    private String description;

	@Column
    private Long companyId;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(Long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public Long getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Long unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

}