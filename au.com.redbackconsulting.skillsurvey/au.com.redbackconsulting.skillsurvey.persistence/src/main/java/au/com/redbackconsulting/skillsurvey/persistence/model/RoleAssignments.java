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
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIM, query = "select o from Administrators o where o.emailAddress = :emailAddress and o.password = :password and o.isActive = :isActive")})

public class RoleAssignments implements Serializable,IDBEntity {

	
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

@Override
public Long getId() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
