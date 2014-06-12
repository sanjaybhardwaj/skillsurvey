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
@Table(name = "UOCGROUP", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIM, query = "select o from Administrators o where o.emailAddress = :emailAddress and o.password = :password and o.isActive = :isActive")})

public class UocGroup implements Serializable,IDBEntity {


@Id
@Column(name="ID")
	private Long id;
	
@Basic
@Column(name="NOTES")
	private String notes;
	

@Basic
@Column(name="NEEDID")
	private Long needId;
	

@Basic
@Column(name="PATHWAYID")
	private Long pathwayId;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNotes() {
	return notes;
}


public void setNotes(String notes) {
	this.notes = notes;
}


public Long getNeedId() {
	return needId;
}


public void setNeedId(Long needId) {
	this.needId = needId;
}


public Long getPathwayId() {
	return pathwayId;
}


public void setPathwayId(Long pathwayId) {
	this.pathwayId = pathwayId;
}


}
