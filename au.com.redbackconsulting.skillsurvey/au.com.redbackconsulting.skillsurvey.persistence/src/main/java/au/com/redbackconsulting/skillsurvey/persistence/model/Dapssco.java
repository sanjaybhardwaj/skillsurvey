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
@Table(name = "DAPSSCO", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_DAPSSCO, query = "select o from Dapssco o where o.id = :id")})


public class Dapssco implements Serializable,IDBEntity {

	private static final long serialVersionUID = -8129499475178666334L;

	@Id
	@Column(name = "ID")
	private Long id;
	
	
	

	@Basic
	@Column(name = "OCCUPTIONID")
	private Long occupatioId;
	
	@Basic
	@Column(name = "LEVELID")
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
