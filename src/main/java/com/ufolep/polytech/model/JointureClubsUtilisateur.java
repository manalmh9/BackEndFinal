package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class JointureClubsUtilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idGroupe;
    private int idUtilisateur;
    private String droit;
    private int dateAffectation;
    private String groupeConnexion;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private ClubsUtilisateur utilisateur;

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

	public String getDroit() {
		return droit;
	}

	public void setDroit(String droit) {
		this.droit = droit;
	}

	public int getDateAffectation() {
		return dateAffectation;
	}

	public void setDateAffectation(int dateAffectation) {
		this.dateAffectation = dateAffectation;
	}

	public String getGroupeConnexion() {
		return groupeConnexion;
	}

	public void setGroupeConnexion(String groupeConnexion) {
		this.groupeConnexion = groupeConnexion;
	}

	public ClubsUtilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(ClubsUtilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
