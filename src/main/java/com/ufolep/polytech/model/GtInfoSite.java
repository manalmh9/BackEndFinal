package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class GtInfoSite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adresseWeb;
    private long espaceDisque;
    private String nom;
    private String description;
    private String footer;
    private int tailleUpload;
    private String fichiers;
    private String mails;
    private String gd2;
    private String maintenance;
    private String controleIp;
    private String saison1;
    private String saison2;
    private String sondages;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdresseWeb() {
		return adresseWeb;
	}
	public void setAdresseWeb(String adresseWeb) {
		this.adresseWeb = adresseWeb;
	}
	public long getEspaceDisque() {
		return espaceDisque;
	}
	public void setEspaceDisque(long espaceDisque) {
		this.espaceDisque = espaceDisque;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public int getTailleUpload() {
		return tailleUpload;
	}
	public void setTailleUpload(int tailleUpload) {
		this.tailleUpload = tailleUpload;
	}
	public String getFichiers() {
		return fichiers;
	}
	public void setFichiers(String fichiers) {
		this.fichiers = fichiers;
	}
	public String getMails() {
		return mails;
	}
	public void setMails(String mails) {
		this.mails = mails;
	}
	public String getGd2() {
		return gd2;
	}
	public void setGd2(String gd2) {
		this.gd2 = gd2;
	}
	public String getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}
	public String getControleIp() {
		return controleIp;
	}
	public void setControleIp(String controleIp) {
		this.controleIp = controleIp;
	}
	public String getSaison1() {
		return saison1;
	}
	public void setSaison1(String saison1) {
		this.saison1 = saison1;
	}
	public String getSaison2() {
		return saison2;
	}
	public void setSaison2(String saison2) {
		this.saison2 = saison2;
	}
	public String getSondages() {
		return sondages;
	}
	public void setSondages(String sondages) {
		this.sondages = sondages;
	}

    
}
