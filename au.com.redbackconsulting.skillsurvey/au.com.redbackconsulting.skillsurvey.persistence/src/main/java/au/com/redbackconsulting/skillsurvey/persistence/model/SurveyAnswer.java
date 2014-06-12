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
@Table(name = "SURVEYANSWER", uniqueConstraints = { @UniqueConstraint(columnNames = { "UOC_QUESTIONID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_SURVEYANSWER, query = "select o from SurveyAnswer o where o.uoc_QuestionId = :uoc_QuestionId")})

public class SurveyAnswer implements Serializable,IDBEntity {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

public Long getId() {
	// TODO Auto-generated method stub
	return null;
}



}
