package au.com.redbackconsulting.skillsurvey.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the claim database table.
 * 
 */
@Entity
@NamedQuery(name="Claim.findAll", query="SELECT c FROM Claim c")
public class Claim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idclaim;

	private String code;

	//bi-directional many-to-many association to Role
	@ManyToMany(mappedBy="claims", fetch=FetchType.EAGER)
	private List<Role> roles;

	public Claim() {
	}

	public int getIdclaim() {
		return this.idclaim;
	}

	public void setIdclaim(int idclaim) {
		this.idclaim = idclaim;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}