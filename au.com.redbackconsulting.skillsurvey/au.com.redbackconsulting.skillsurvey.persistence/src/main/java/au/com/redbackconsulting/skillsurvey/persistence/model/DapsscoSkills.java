package au.com.redbackconsulting.skillsurvey.persistence.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "DAPSSCOSKILLS", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIM, query = "select o from Administrators o where o.emailAddress = :emailAddress and o.password = :password and o.isActive = :isActive")})


public class DapsscoSkills implements Serializable,IDBEntity {


	@Id
	@Column(name = "DEPSSCO_ID")
private Long dapssco_Id;
	
	
	
	@Basic
	@Column(name="UOC_GROUPID")
	private Long uoc_GroupId;



	public Long getDapssco_Id() {
		return dapssco_Id;
	}



	public void setDapssco_Id(Long dapssco_Id) {
		this.dapssco_Id = dapssco_Id;
	}



	public Long getUoc_GroupId() {
		return uoc_GroupId;
	}



	public void setUoc_GroupId(Long uoc_GroupId) {
		this.uoc_GroupId = uoc_GroupId;
	}



	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
