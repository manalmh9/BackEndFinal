package UFOLEP_POLYTECH.Model;

import jakarta.persistence.*;

@Entity
public class Regions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dept;
    private String deptsLies;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDeptsLies() {
		return deptsLies;
	}
	public void setDeptsLies(String deptsLies) {
		this.deptsLies = deptsLies;
	}

}
