package au.com.redbackconsulting.skillsurvey.api.bean;

public class SurveyAnswerBean {
	@Expose
	private Long uoc_QuestionId;
	@Expose
	private Long surveyId;
	@Expose
	private String value;
	@Expose
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
