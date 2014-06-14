package au.com.redbackconsulting.skillsurvey.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the role_assignment database table.
 * 
 */
@Entity
@Table(name="role_assignment")
@NamedQuery(name="RoleAssignment.findAll", query="SELECT r FROM RoleAssignment r")
public class RoleAssignment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoleAssignmentPK id;

	//bi-directional many-to-one association to Individual
	@ManyToOne
	@JoinColumn(name="individual_id")
	private Individual individual;

	public RoleAssignment() {
	}

	public RoleAssignmentPK getId() {
		return this.id;
	}

	public void setId(RoleAssignmentPK id) {
		this.id = id;
	}

	public Individual getIndividual() {
		return this.individual;
	}

	public void setIndividual(Individual individual) {
		this.individual = individual;
	}

}