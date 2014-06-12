package au.com.redbackconsulting.skillsurvey.persistence.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;




@Entity
@Table(name = "INDIVIDUAL", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.CLAIM, query = "select o from Administrators o where o.emailAddress = :emailAddress and o.password = :password and o.isActive = :isActive")})

public class Individual implements Serializable,IDBEntity {

	
	@Id
	@Column(name="ID")
	private Long id;

	@Basic
	@Column(name="NAME")
	private String name;

	@Basic
	@Column(name="GENDER")
	private String gender;

	@Basic
	@Column(name="LOGINPASSWORD")
	private String loginPassword;

	@Basic
	@Column(name="DEPARTMENTID")
	private Long departmentId;

	@Basic
	@Column(name="FUNCTIONID")
	private Long functionId;

	@Basic
	@Column(name="OCCUPTIONID")
	private Long occupationId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	public Long getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(Long occupationId) {
		this.occupationId = occupationId;
	}

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name="LEVELID")
	private Long levelId;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
