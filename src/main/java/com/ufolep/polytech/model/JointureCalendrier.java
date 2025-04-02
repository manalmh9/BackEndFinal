package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class JointureCalendrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idEvenement;
    private String cible;
    private int depart;
    private int numeroTir;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private ClubsUtilisateur utilisateur;

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

	public String getCible() {
		return cible;
	}

	public void setCible(String cible) {
		this.cible = cible;
	}

	public int getDepart() {
		return depart;
	}

	public void setDepart(int depart) {
		this.depart = depart;
	}

	public int getNumeroTir() {
		return numeroTir;
	}

	public void setNumeroTir(int numeroTir) {
		this.numeroTir = numeroTir;
	}

	public ClubsUtilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(ClubsUtilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

    
}
