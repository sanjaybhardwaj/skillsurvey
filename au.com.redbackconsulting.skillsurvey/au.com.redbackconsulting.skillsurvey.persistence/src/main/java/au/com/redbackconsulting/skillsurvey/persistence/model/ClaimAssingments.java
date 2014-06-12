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
@Table(name = "CLAIMASSINGMENT", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIMASSINGMENT, query = "select o from Claimassessment o where o.claimid = :claimid and o.password = :password and o.isActive = :isActive")})

public class ClaimAssingments implements Serializable,IDBEntity {

	
	@Id
	@Column(name = "CLAIMID")
	private long  Claimid;

	@Basic
	@Column(name = "ROLEID")
	private String RoleId;

	public long getClaimid() {
		return Claimid;
	}

	public void setClaimid(long claimid) {
		Claimid = claimid;
	}

	public String getRoleId() {
		return RoleId;
	}

	public void setRoleId(String roleId) {
		RoleId = roleId;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
