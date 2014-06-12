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
@Table(name = "FUNCTIONOCCUPTIONS", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIM, query = "select o from Administrators o where o.emailAddress = :emailAddress and o.password = :password and o.isActive = :isActive")})

public class FunctionOccupations implements Serializable,IDBEntity {
	
	
	@Id
	@Column(name="FUNCTIONID")
private Long functionId;
	
	
	@Basic
	@Column(name="OCCUPTIONID")
	private Long occupationid;


	public Long getFunctionId() {
		return functionId;
	}


	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}


	public Long getOccupationid() {
		return occupationid;
	}


	public void setOccupationid(Long occupationid) {
		this.occupationid = occupationid;
	}


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
