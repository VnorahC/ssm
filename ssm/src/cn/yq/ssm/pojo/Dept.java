package cn.yq.ssm.pojo;

public class Dept {
	public Dept(Integer id, String name, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String name;
	private String manager;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", manager=" + manager + "]";
	}
	
}
