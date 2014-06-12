package au.com.redbackconsulting.skillsurvey.api.bean;

import com.google.gson.annotations.Expose;

public class RoleAssignmentBean {
	@Expose
	private Long individualId;
	@Expose
	private Long roleId;

	public Long getIndividualId() {
		return individualId;
	}

	public void setIndividualId(Long individualId) {
		this.individualId = individualId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
