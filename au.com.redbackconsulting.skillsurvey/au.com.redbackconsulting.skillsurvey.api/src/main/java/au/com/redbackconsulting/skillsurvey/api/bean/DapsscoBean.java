package au.com.redbackconsulting.skillsurvey.api.bean;

import com.google.gson.annotations.Expose;

public class DapsscoBean {
	
	
	@Expose
	private Long id;
	
	@Expose
	private Long occupatioId;
	
	@Expose
	private Long levelId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOccupatioId() {
		return occupatioId;
	}

	public void setOccupatioId(Long occupatioId) {
		this.occupatioId = occupatioId;
	}

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}
	
	

}
