package UFOLEP_POLYTECH.Model;

import jakarta.persistence.*;

@Entity
public class CatAge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String catAge;
    private String catAgeLong;
    private String distanceInt;
    private String blasonInt;
    private String distanceExtCourt;
    private String distanceExtLong;
    private String blasonExt;
    private String ageMini;
    private String ageMaxi;
    private String hauteurOr;
    private String distanceSarbacane;
    private String distanceCourt;
    private String blasonCourt;
    private String distanceLong;
    private String blasonLong;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCatAge() {
		return catAge;
	}
	public void setCatAge(String catAge) {
		this.catAge = catAge;
	}
	public String getCatAgeLong() {
		return catAgeLong;
	}
	public void setCatAgeLong(String catAgeLong) {
		this.catAgeLong = catAgeLong;
	}
	public String getDistanceInt() {
		return distanceInt;
	}
	public void setDistanceInt(String distanceInt) {
		this.distanceInt = distanceInt;
	}
	public String getBlasonInt() {
		return blasonInt;
	}
	public void setBlasonInt(String blasonInt) {
		this.blasonInt = blasonInt;
	}
	public String getDistanceExtCourt() {
		return distanceExtCourt;
	}
	public void setDistanceExtCourt(String distanceExtCourt) {
		this.distanceExtCourt = distanceExtCourt;
	}
	public String getDistanceExtLong() {
		return distanceExtLong;
	}
	public void setDistanceExtLong(String distanceExtLong) {
		this.distanceExtLong = distanceExtLong;
	}
	public String getBlasonExt() {
		return blasonExt;
	}
	public void setBlasonExt(String blasonExt) {
		this.blasonExt = blasonExt;
	}
	public String getAgeMini() {
		return ageMini;
	}
	public void setAgeMini(String ageMini) {
		this.ageMini = ageMini;
	}
	public String getAgeMaxi() {
		return ageMaxi;
	}
	public void setAgeMaxi(String ageMaxi) {
		this.ageMaxi = ageMaxi;
	}
	public String getHauteurOr() {
		return hauteurOr;
	}
	public void setHauteurOr(String hauteurOr) {
		this.hauteurOr = hauteurOr;
	}
	public String getDistanceSarbacane() {
		return distanceSarbacane;
	}
	public void setDistanceSarbacane(String distanceSarbacane) {
		this.distanceSarbacane = distanceSarbacane;
	}
	public String getDistanceCourt() {
		return distanceCourt;
	}
	public void setDistanceCourt(String distanceCourt) {
		this.distanceCourt = distanceCourt;
	}
	public String getBlasonCourt() {
		return blasonCourt;
	}
	public void setBlasonCourt(String blasonCourt) {
		this.blasonCourt = blasonCourt;
	}
	public String getDistanceLong() {
		return distanceLong;
	}
	public void setDistanceLong(String distanceLong) {
		this.distanceLong = distanceLong;
	}
	public String getBlasonLong() {
		return blasonLong;
	}
	public void setBlasonLong(String blasonLong) {
		this.blasonLong = blasonLong;
	}

    
}
