package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class CatMateriel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String catMat;
    private String catMatLong;
    private String challenge;
    private String criteres;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCatMat() {
		return catMat;
	}
	public void setCatMat(String catMat) {
		this.catMat = catMat;
	}
	public String getCatMatLong() {
		return catMatLong;
	}
	public void setCatMatLong(String catMatLong) {
		this.catMatLong = catMatLong;
	}
	public String getChallenge() {
		return challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	public String getCriteres() {
		return criteres;
	}
	public void setCriteres(String criteres) {
		this.criteres = criteres;
	}

    
}
