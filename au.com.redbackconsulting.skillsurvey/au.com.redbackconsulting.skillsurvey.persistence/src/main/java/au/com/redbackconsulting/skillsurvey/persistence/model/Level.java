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
@Table(name = "LEVEL", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_LEVEL, query = "select o from Level o where o.id = :id ")})


public class Level implements Serializable,IDBEntity {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


@Id
@Column(name="ID")
private Long id;
	
	
@Basic
@Column(name="CODE")
private String code;

@Basic
@Column(name="DESCRIPTION")
	private String description;

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public void setId(Long id) {
	this.id = id;
}

public Long getId() {
	// TODO Auto-generated method stub
	return null;
}



}
