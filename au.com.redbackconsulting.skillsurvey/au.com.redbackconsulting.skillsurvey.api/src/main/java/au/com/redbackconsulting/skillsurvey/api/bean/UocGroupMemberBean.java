package au.com.redbackconsulting.skillsurvey.api.bean;

public class UocGroupMemberBean {
	@Expose
	private Long uoc_GroupId;
	@Expose
	private Long uoc_Id;

	public Long getUoc_GroupId() {
		return uoc_GroupId;
	}

	public void setUoc_GroupId(Long uoc_GroupId) {
		this.uoc_GroupId = uoc_GroupId;
	}

	public Long getUoc_Id() {
		return uoc_Id;
	}

	public void setUoc_Id(Long uoc_Id) {
		this.uoc_Id = uoc_Id;
	}

	
}
