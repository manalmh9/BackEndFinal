package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statut;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private ClubsUtilisateur utilisateur;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}
