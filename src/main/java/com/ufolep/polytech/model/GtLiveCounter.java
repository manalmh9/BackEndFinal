package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class GtLiveCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idGroupe;
    private int idUtilisateur;
    private String adresseIp;
    private int dateConnexion;
    private int dateVerif;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getAdresseIp() {
		return adresseIp;
	}
	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}
	public int getDateConnexion() {
		return dateConnexion;
	}
	public void setDateConnexion(int dateConnexion) {
		this.dateConnexion = dateConnexion;
	}
	public int getDateVerif() {
		return dateVerif;
	}
	public void setDateVerif(int dateVerif) {
		this.dateVerif = dateVerif;
	}

    
}
