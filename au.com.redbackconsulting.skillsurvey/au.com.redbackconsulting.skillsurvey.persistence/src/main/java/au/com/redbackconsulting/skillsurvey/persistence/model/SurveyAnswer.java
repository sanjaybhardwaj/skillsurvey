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
@Table(name = "SURVEYANSWER", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIM, query = "select o from Administrators o where o.emailAddress = :emailAddress and o.password = :password and o.isActive = :isActive")})

public class SurveyAnswer implements Serializable,IDBEntity {


@Id
@Column(name="UOC_QUESTIONID")
	private Long uoc_QuestionId;
	
@Basic
@Column(name="SURVEYID")
	private Long surveyId;
	
@Basic
@Column(name="VALUE")
	private String value;
	
@Basic
@Column(name="ANSWERESAT")
	private String answeredAt;

public Long getUoc_QuestionId() {
	return uoc_QuestionId;
}

public void setUoc_QuestionId(Long uoc_QuestionId) {
	this.uoc_QuestionId = uoc_QuestionId;
}

public Long getSurveyId() {
	return surveyId;
}

public void setSurveyId(Long surveyId) {
	this.surveyId = surveyId;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

public String getAnsweredAt() {
	return answeredAt;
}

public void setAnsweredAt(String answeredAt) {
	this.answeredAt = answeredAt;
}

@Override
public Long getId() {
	// TODO Auto-generated method stub
	return null;
}



}
