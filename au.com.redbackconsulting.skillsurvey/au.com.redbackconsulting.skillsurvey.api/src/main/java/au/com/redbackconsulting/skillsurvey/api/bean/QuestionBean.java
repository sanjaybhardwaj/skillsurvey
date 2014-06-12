package au.com.redbackconsulting.skillsurvey.api.bean;

import com.google.gson.annotations.Expose;

public class QuestionBean {
	@Expose
	private Long id;
	@Expose
	private String text;
	@Expose
	private String style;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	

}
