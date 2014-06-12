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
@Table(name = "ROLEASSIGNMENTS", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_ROLEASSINGMENT, query = "select o from RoleAssignments o where o.individualId = :individualId")})

public class RoleAssignments implements Serializable,IDBEntity {

	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@Column(name="INDIVIDUALID")
	private Long individualId;
	
@Basic
@Column(name="ROLEID")
	private Long roleId;

public Long getIndividualId() {
	return individualId;
}

public void setIndividualId(Long individualId) {
	this.individualId = individualId;
}

public Long getRoleId() {
	return roleId;
}

public void setRoleId(Long roleId) {
	this.roleId = roleId;
}

public Long getId() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
