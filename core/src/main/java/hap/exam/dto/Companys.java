package hap.exam.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xiangyu.qi on 16/8/26.
 */
@Table(name="hap_org_companys")
public class Companys {

	@Id
	@Column
	@GeneratedValue
	private Long companyId;

	@Column
	private String companyNumber;

	@Column
	private String companyName;
	
	@Column
	private String enabledFlag;

	@Column
	private Date creationDate;

	@Column
	private Long createdBy;

	private Long lastUpdatedBy;

	private Date lastUpdateDate;

	private Long lastUpdateLogin;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}

	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}
}