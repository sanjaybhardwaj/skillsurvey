package au.com.redbackconsulting.skillsurvey.api.bean;

public class SurveyAnswerBean {
	
	private Long uoc_QuestionId;
	
	private Long surveyId;
	
	private String value;
	
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
	
	

}
