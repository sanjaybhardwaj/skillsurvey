package au.com.redbackconsulting.skillsurvey.api.bean;

public class UocBean {
	@Expose
	private Long id;
	@Expose
	private String name;
	@Expose
	private String description;
	@Expose
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
