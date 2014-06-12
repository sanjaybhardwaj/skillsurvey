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
@Table(name = "QUESTION", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
@NamedQueries({ @NamedQuery(name = DBQueries.GET_QUESTION, query = "select o from Question o where o.id = :id")})

public class Question implements Serializable,IDBEntity {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@Column(name="ID")
private Long id;
	
@Basic
@Column(name="TEXT")
	private String text;
	
@Basic
@Column(name="STYLE")
	private String style;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public String getStyle() {
	return style;
}

public void setStyle(String style) {
	this.style = style;
}

}
