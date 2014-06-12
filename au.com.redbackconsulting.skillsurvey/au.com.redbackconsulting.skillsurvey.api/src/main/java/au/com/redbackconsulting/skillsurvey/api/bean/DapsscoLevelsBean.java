package au.com.redbackconsulting.skillsurvey.api.bean;

import com.google.gson.annotations.Expose;

public class DapsscoLevelsBean {
	
	
	@Expose
	private Long dapssco_id;
	
	
	@Expose
	private Long levelId;

	public Long getDapssco_id() {
		return dapssco_id;
	}

	public void setDapssco_id(Long dapssco_id) {
		this.dapssco_id = dapssco_id;
	}

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}
	
	

}
