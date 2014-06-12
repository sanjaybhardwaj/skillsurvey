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
@Table(name = "CLAIM", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_CLAIM, query = "select u from Claim u where u.id = :id")})



public class Claim implements Serializable, IDBEntity {


	private static final long serialVersionUID = -8129499475178666334L;

	@Id
	@Column(name = "ID")
	private long  id;

	@Basic
	@Column(name = "CODE")
	private String Code;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}


}
