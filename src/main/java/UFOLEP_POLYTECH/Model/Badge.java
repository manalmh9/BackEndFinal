package UFOLEP_POLYTECH.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String badge;
    private String distance;
    private String blason;
    private int svM;//categ darcher
    private int avM;//Avec vis masc
    private int svF;// Fem
    private int avF;//avec Vis Fem
    private int cosvM;//arc sans vis masc 
    private int coavM;
    private int cosvF;
    private int coavF;
    private int distanceSarb;// distance de tir
    private int sarbM;//sarb masc
    private int sarbF;//sarb fem
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getBlason() {
		return blason;
	}
	public void setBlason(String blason) {
		this.blason = blason;
	}
	public int getSvM() {
		return svM;
	}
	public void setSvM(int svM) {
		this.svM = svM;
	}
	public int getAvM() {
		return avM;
	}
	public void setAvM(int avM) {
		this.avM = avM;
	}
	public int getSvF() {
		return svF;
	}
	public void setSvF(int svF) {
		this.svF = svF;
	}
	public int getAvF() {
		return avF;
	}
	public void setAvF(int avF) {
		this.avF = avF;
	}
	public int getCosvM() {
		return cosvM;
	}
	public void setCosvM(int cosvM) {
		this.cosvM = cosvM;
	}
	public int getCoavM() {
		return coavM;
	}
	public void setCoavM(int coavM) {
		this.coavM = coavM;
	}
	public int getCosvF() {
		return cosvF;
	}
	public void setCosvF(int cosvF) {
		this.cosvF = cosvF;
	}
	public int getCoavF() {
		return coavF;
	}
	public void setCoavF(int coavF) {
		this.coavF = coavF;
	}
	public int getDistanceSarb() {
		return distanceSarb;
	}
	public void setDistanceSarb(int distanceSarb) {
		this.distanceSarb = distanceSarb;
	}
	public int getSarbM() {
		return sarbM;
	}
	public void setSarbM(int sarbM) {
		this.sarbM = sarbM;
	}
	public int getSarbF() {
		return sarbF;
	}
	public void setSarbF(int sarbF) {
		this.sarbF = sarbF;
	}

    
}
