package UFOLEP_POLYTECH.Model;

import jakarta.persistence.*;

@Entity
public class GtLangue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomLangue;
    private String setLocale;
    private String dossierLangue;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomLangue() {
		return nomLangue;
	}
	public void setNomLangue(String nomLangue) {
		this.nomLangue = nomLangue;
	}
	public String getSetLocale() {
		return setLocale;
	}
	public void setSetLocale(String setLocale) {
		this.setLocale = setLocale;
	}
	public String getDossierLangue() {
		return dossierLangue;
	}
	public void setDossierLangue(String dossierLangue) {
		this.dossierLangue = dossierLangue;
	}

    
}
