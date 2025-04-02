package UFOLEP_POLYTECH.Model;

import jakarta.persistence.*;

@Entity
public class CiblesDispos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idEvenement;
    private String arme;
    private int numeroTir;
    private String distance;
    private String cibles;
    private String ciblerie;
    private String blason;
    private String categorie;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdEvenement() {
		return idEvenement;
	}
	public void setIdEvenement(int idEvenement) {
		this.idEvenement = idEvenement;
	}
	public String getArme() {
		return arme;
	}
	public void setArme(String arme) {
		this.arme = arme;
	}
	public int getNumeroTir() {
		return numeroTir;
	}
	public void setNumeroTir(int numeroTir) {
		this.numeroTir = numeroTir;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getCibles() {
		return cibles;
	}
	public void setCibles(String cibles) {
		this.cibles = cibles;
	}
	public String getCiblerie() {
		return ciblerie;
	}
	public void setCiblerie(String ciblerie) {
		this.ciblerie = ciblerie;
	}
	public String getBlason() {
		return blason;
	}
	public void setBlason(String blason) {
		this.blason = blason;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

    
}
