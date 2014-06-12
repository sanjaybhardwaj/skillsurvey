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
@Table(name = "UOC", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_UOC, query = "select o from Uoc o where o.id = :id")})

public class Uoc implements Serializable,IDBEntity {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@Column(name="ID")
private Long id;
	
@Basic
@Column(name="NAME")
	private String name;
	
@Basic
@Column(name="DESCRIPTION")
	private String description;
	
@Basic
@Column(name="TYPE")
	private String type;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
	
	
}
