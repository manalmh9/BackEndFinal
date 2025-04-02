package com.ufolep.polytech.model;

import jakarta.persistence.*;

@Entity
public class Prefectures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departement;
    private String nomDept;
    private String prefecture;
    private String region;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getNomDept() {
		return nomDept;
	}
	public void setNomDept(String nomDept) {
		this.nomDept = nomDept;
	}
	public String getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
