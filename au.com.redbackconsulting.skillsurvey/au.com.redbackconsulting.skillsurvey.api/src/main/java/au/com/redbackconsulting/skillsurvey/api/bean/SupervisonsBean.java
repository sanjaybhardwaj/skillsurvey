package au.com.redbackconsulting.skillsurvey.api.bean;

public class SupervisonsBean {
	
	private Long supervisorId;
	
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
