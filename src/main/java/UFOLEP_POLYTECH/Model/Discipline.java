package UFOLEP_POLYTECH.Model;

import jakarta.persistence.*;

@Entity
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomDiscipline;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomDiscipline() {
		return nomDiscipline;
	}

	public void setNomDiscipline(String nomDiscipline) {
		this.nomDiscipline = nomDiscipline;
	}

    
}
