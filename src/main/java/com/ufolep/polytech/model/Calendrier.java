package com.ufolep.polytech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Calendrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idEvenement;
    private int idExpediteur;
    private int idProprietaire;
    private int idGroupe;
    private String departement;
    private String titre;
    private String description;
    private Date datePost;
    private Date dateDebut;
    private Date dateFin;
    private String important;
    private String statut;
    private String organisateur;
    private String lieu;
    private String adresseLieu;
    private String cpLieu;
    private String villeLieu;
    private String depart1;
    private String depart2;
    private String depart3;
    private String depart4;
    private String nbDeparts;
    private String discipline;
    private String rang;
    private String nbVagues;
    private String code;
    private String arbitres1;
    private String arbitres2;
    private String arbitres3;
    private String arbitres4;
    private String engagement1;
    private String engagement2;
    private String dateButtoir;
    private String region;
    private String arme;
    private String repas;
    private String lien;
    private String pcent;
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
	public int getIdExpediteur() {
		return idExpediteur;
	}
	public void setIdExpediteur(int idExpediteur) {
		this.idExpediteur = idExpediteur;
	}
	public int getIdProprietaire() {
		return idProprietaire;
	}
	public void setIdProprietaire(int idProprietaire) {
		this.idProprietaire = idProprietaire;
	}
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDatePost() {
		return datePost;
	}
	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getImportant() {
		return important;
	}
	public void setImportant(String important) {
		this.important = important;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getOrganisateur() {
		return organisateur;
	}
	public void setOrganisateur(String organisateur) {
		this.organisateur = organisateur;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getAdresseLieu() {
		return adresseLieu;
	}
	public void setAdresseLieu(String adresseLieu) {
		this.adresseLieu = adresseLieu;
	}
	public String getCpLieu() {
		return cpLieu;
	}
	public void setCpLieu(String cpLieu) {
		this.cpLieu = cpLieu;
	}
	public String getVilleLieu() {
		return villeLieu;
	}
	public void setVilleLieu(String villeLieu) {
		this.villeLieu = villeLieu;
	}
	public String getDepart1() {
		return depart1;
	}
	public void setDepart1(String depart1) {
		this.depart1 = depart1;
	}
	public String getDepart2() {
		return depart2;
	}
	public void setDepart2(String depart2) {
		this.depart2 = depart2;
	}
	public String getDepart3() {
		return depart3;
	}
	public void setDepart3(String depart3) {
		this.depart3 = depart3;
	}
	public String getDepart4() {
		return depart4;
	}
	public void setDepart4(String depart4) {
		this.depart4 = depart4;
	}
	public String getNbDeparts() {
		return nbDeparts;
	}
	public void setNbDeparts(String nbDeparts) {
		this.nbDeparts = nbDeparts;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public String getRang() {
		return rang;
	}
	public void setRang(String rang) {
		this.rang = rang;
	}
	public String getNbVagues() {
		return nbVagues;
	}
	public void setNbVagues(String nbVagues) {
		this.nbVagues = nbVagues;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getArbitres1() {
		return arbitres1;
	}
	public void setArbitres1(String arbitres1) {
		this.arbitres1 = arbitres1;
	}
	public String getArbitres2() {
		return arbitres2;
	}
	public void setArbitres2(String arbitres2) {
		this.arbitres2 = arbitres2;
	}
	public String getArbitres3() {
		return arbitres3;
	}
	public void setArbitres3(String arbitres3) {
		this.arbitres3 = arbitres3;
	}
	public String getArbitres4() {
		return arbitres4;
	}
	public void setArbitres4(String arbitres4) {
		this.arbitres4 = arbitres4;
	}
	public String getEngagement1() {
		return engagement1;
	}
	public void setEngagement1(String engagement1) {
		this.engagement1 = engagement1;
	}
	public String getEngagement2() {
		return engagement2;
	}
	public void setEngagement2(String engagement2) {
		this.engagement2 = engagement2;
	}
	public String getDateButtoir() {
		return dateButtoir;
	}
	public void setDateButtoir(String dateButtoir) {
		this.dateButtoir = dateButtoir;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getArme() {
		return arme;
	}
	public void setArme(String arme) {
		this.arme = arme;
	}
	public String getRepas() {
		return repas;
	}
	public void setRepas(String repas) {
		this.repas = repas;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getPcent() {
		return pcent;
	}
	public void setPcent(String pcent) {
		this.pcent = pcent;
	}

    
}
