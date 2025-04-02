package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class ControleLicences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int dept;
    private String idPm;
    private String nomPm;
    private String idPp;
    private String civilite;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String licencePratiquant;
    private String licenceDirigeant;
    private String officiel;
    private String saison;
    private String activitesUfolep;
    private String activitesNonUfolep;
    private String dateHomologation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getIdPm() {
		return idPm;
	}
	public void setIdPm(String idPm) {
		this.idPm = idPm;
	}
	public String getNomPm() {
		return nomPm;
	}
	public void setNomPm(String nomPm) {
		this.nomPm = nomPm;
	}
	public String getIdPp() {
		return idPp;
	}
	public void setIdPp(String idPp) {
		this.idPp = idPp;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLicencePratiquant() {
		return licencePratiquant;
	}
	public void setLicencePratiquant(String licencePratiquant) {
		this.licencePratiquant = licencePratiquant;
	}
	public String getLicenceDirigeant() {
		return licenceDirigeant;
	}
	public void setLicenceDirigeant(String licenceDirigeant) {
		this.licenceDirigeant = licenceDirigeant;
	}
	public String getOfficiel() {
		return officiel;
	}
	public void setOfficiel(String officiel) {
		this.officiel = officiel;
	}
	public String getSaison() {
		return saison;
	}
	public void setSaison(String saison) {
		this.saison = saison;
	}
	public String getActivitesUfolep() {
		return activitesUfolep;
	}
	public void setActivitesUfolep(String activitesUfolep) {
		this.activitesUfolep = activitesUfolep;
	}
	public String getActivitesNonUfolep() {
		return activitesNonUfolep;
	}
	public void setActivitesNonUfolep(String activitesNonUfolep) {
		this.activitesNonUfolep = activitesNonUfolep;
	}
	public String getDateHomologation() {
		return dateHomologation;
	}
	public void setDateHomologation(String dateHomologation) {
		this.dateHomologation = dateHomologation;
	}

    
}
