package au.com.redbackconsulting.skillsurvey.api.bean;

public class QuestionBean {
	
	private Long id;
	
	private String text;
	
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
