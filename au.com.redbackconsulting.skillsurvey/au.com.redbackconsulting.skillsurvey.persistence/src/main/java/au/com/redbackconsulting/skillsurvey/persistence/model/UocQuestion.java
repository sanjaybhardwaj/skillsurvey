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
@Table(name = "UOCQUESTION", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_UOCQUESTION, query = "select o from UocQuestion o where o.id = :id")})

public class UocQuestion implements Serializable,IDBEntity {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@Column(name="ID")
private Long id;

@Basic
@Column(name="UOC_ID")
private Long uoc_Id;

@Basic
@Column(name="QUESTIONID")
private Long questionId;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getUoc_Id() {
	return uoc_Id;
}

public void setUoc_Id(Long uoc_Id) {
	this.uoc_Id = uoc_Id;
}

public Long getQuestionId() {
	return questionId;
}

public void setQuestionId(Long questionId) {
	this.questionId = questionId;
}



}

