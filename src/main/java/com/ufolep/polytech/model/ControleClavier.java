package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class ControleClavier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idEvenement;
    private int depart;
    private int cible;
    private String licence;
    private Long idUtilisateur;
    private String adresseIp;
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
	public int getDepart() {
		return depart;
	}
	public void setDepart(int depart) {
		this.depart = depart;
	}
	public int getCible() {
		return cible;
	}
	public void setCible(int cible) {
		this.cible = cible;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getAdresseIp() {
		return adresseIp;
	}
	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}

    
}
