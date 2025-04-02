package UFOLEP_POLYTECH.Model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Clubs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private long tailleDossier;
    private String nomDossier;
    private String logo;
    private String adresseClub;
    private String cpClub;
    private String villeClub;
    private String droits;
    private String departement;
    private String autresDepts;
    private String affiliation;
    private String siteWeb;
    private String numJs;
    private String siret;
    private String carte;
    private String label;
    private String armes;
    

    @OneToMany(mappedBy = "club")
    private List<ClubsUtilisateur> utilisateurs;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public long getTailleDossier() {
        return tailleDossier;
    }

    public void setTailleDossier(long tailleDossier) {
        this.tailleDossier = tailleDossier;
    }

    public String getNomDossier() {
        return nomDossier;
    }

    public void setNomDossier(String nomDossier) {
        this.nomDossier = nomDossier;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAdresseClub() {
        return adresseClub;
    }

    public void setAdresseClub(String adresseClub) {
        this.adresseClub = adresseClub;
    }

    public String getCpClub() {
        return cpClub;
    }

    public void setCpClub(String cpClub) {
        this.cpClub = cpClub;
    }

    public String getVilleClub() {
        return villeClub;
    }

    public void setVilleClub(String villeClub) {
        this.villeClub = villeClub;
    }

    public String getDroits() {
        return droits;
    }

    public void setDroits(String droits) {
        this.droits = droits;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getAutresDepts() {
        return autresDepts;
    }

    public void setAutresDepts(String autresDepts) {
        this.autresDepts = autresDepts;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getNumJs() {
        return numJs;
    }

    public void setNumJs(String numJs) {
        this.numJs = numJs;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getArmes() {
        return armes;
    }

    public void setArmes(String armes) {
        this.armes = armes;
    }
}
