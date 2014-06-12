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
@Table(name = "SURVEY", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIM, query = "select o from Administrators o where o.emailAddress = :emailAddress and o.password = :password and o.isActive = :isActive")})
public class Survey implements Serializable,IDBEntity {


@Id
@Column(name="ID")
private Long id;
	
@Basic
@Column(name="INDIVIDUALID")
private Long individualId;
	
@Basic
@Column(name="DAPSSCO_ID")
	private Long dapssco_Id;
	
@Basic
@Column(name="STARTEDAT")
	private String startedAt;
	
@Basic
@Column(name="COMPLETEDAT")
	private String completedAt;
	
@Basic
@Column(name="PATHWAYID")
	private Long pathwayId;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getIndividualId() {
	return individualId;
}

public void setIndividualId(Long individualId) {
	this.individualId = individualId;
}

public Long getDapssco_Id() {
	return dapssco_Id;
}

public void setDapssco_Id(Long dapssco_Id) {
	this.dapssco_Id = dapssco_Id;
}

public String getStartedAt() {
	return startedAt;
}

public void setStartedAt(String startedAt) {
	this.startedAt = startedAt;
}

public String getCompletedAt() {
	return completedAt;
}

public void setCompletedAt(String completedAt) {
	this.completedAt = completedAt;
}

public Long getPathwayId() {
	return pathwayId;
}

public void setPathwayId(Long pathwayId) {
	this.pathwayId = pathwayId;
}



}
