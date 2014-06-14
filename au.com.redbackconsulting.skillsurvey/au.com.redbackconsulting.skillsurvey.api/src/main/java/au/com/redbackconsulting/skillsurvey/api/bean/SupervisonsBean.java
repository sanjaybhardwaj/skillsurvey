package au.com.redbackconsulting.skillsurvey.api.bean;

import com.google.gson.annotations.Expose;

public class SupervisonsBean {
	@Expose
	private Long supervisorId;
	@Expose
	private Long supervisedId;
  
	public Long getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Long supervisorId) {
		this.supervisorId = supervisorId;
	}

	public Long getSupervisedId() {
		return supervisedId;
	}

	public void setSupervisedId(Long supervisedId) {
		this.supervisedId = supervisedId;
	}

	
}
