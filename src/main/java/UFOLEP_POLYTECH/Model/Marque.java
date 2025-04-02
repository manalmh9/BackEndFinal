package UFOLEP_POLYTECH.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String licence;
    private int idEvenement;
    private int idCible;
    private int depart;
    private int serie;
    private int volee;

    @ElementCollection
    private List<Integer> score; // Stocke le score sous forme de liste
    private int total;

    private int n10;
    private int n9;
    private int n8;
    private int n7;
    private int mail;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public int getIdEvenement() {
		return idEvenement;
	}
	public void setIdEvenement(int idEvenement) {
		this.idEvenement = idEvenement;
	}
	public int getIdCible() {
		return idCible;
	}
	public void setIdCible(int idCible) {
		this.idCible = idCible;
	}
	public int getDepart() {
		return depart;
	}
	public void setDepart(int depart) {
		this.depart = depart;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public int getVolee() {
		return volee;
	}
	public void setVolee(int volee) {
		this.volee = volee;
	}
	public List<Integer> getScore() {
		return score;
	}
	public void setScore(List<Integer> score) {
		this.score = score;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getN10() {
		return n10;
	}
	public void setN10(int n10) {
		this.n10 = n10;
	}
	public int getN9() {
		return n9;
	}
	public void setN9(int n9) {
		this.n9 = n9;
	}
	public int getN8() {
		return n8;
	}
	public void setN8(int n8) {
		this.n8 = n8;
	}
	public int getN7() {
		return n7;
	}
	public void setN7(int n7) {
		this.n7 = n7;
	}
	public int getMail() {
		return mail;
	}
	public void setMail(int mail) {
		this.mail = mail;
	}

    
}
