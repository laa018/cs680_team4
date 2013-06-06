package seminer;

import java.io.Serializable;

public class File implements Serializable {
	
	String project_name;
	int file_id;
	String relative_path;
	String branch_name;
	String file_type;
	String release_number;
	Integer raw_LOC;
	Integer CKJMWMC;
	Integer PROPIN1N;
	Integer PROPOUT1N;
	Integer PROPIN1D;
	Integer PROPOUT1D;
	Integer PROPIN3N;
	Integer PROPOUT3N;
	Integer PROPIN3D;
	Integer PROPOUT3D;
	Integer PROPIN5N;
	Integer PROPOUT5N;
	Integer PROPIN5D;
	Integer PROPOUT5D;
	Integer PROPIN10N;
	Integer PROPOUT10N;
	Integer PROPIN10D;
	Integer PROPOUT10D;
	Integer PROPIN20D;
	Integer PROPOUT20D;
	Integer CKJMDIT;
	Integer CKJMNOC;
	Integer CKJMCBO;
	Integer CKJMRFC;
	Integer CKJMLCOM;
	Integer CKJMCa;
	Integer CKJMNPM;
	Integer mccabe_max;
	Integer mccabe_min;
	Integer mccabe_sum;
	Integer mccabe_mean;
	Integer mccabe_median;
	Integer halstead_length;
	Integer halstead_vol;
	Integer halstead_level;
	Integer halstead_md;
	Integer effort_action;
	Integer effort_churn;
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public int getFile_id() {
		return file_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public String getRelative_path() {
		return relative_path;
	}
	public void setRelative_path(String relative_path) {
		this.relative_path = relative_path;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getFile_type() {
		return file_type;
	}
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
	public String getRelease_number() {
		return release_number;
	}
	public void setRelease_number(String release_number) {
		this.release_number = release_number;
	}
	public Integer getRaw_LOC() {
		return raw_LOC;
	}
	public void setRaw_LOC(Integer raw_LOC) {
		this.raw_LOC = raw_LOC;
	}
	public Integer getCKJMWMC() {
		return CKJMWMC;
	}
	public void setCKJMWMC(Integer cKJMWMC) {
		CKJMWMC = cKJMWMC;
	}
	public Integer getPROPIN1N() {
		return PROPIN1N;
	}
	public void setPROPIN1N(Integer pROPIN1N) {
		PROPIN1N = pROPIN1N;
	}
	public Integer getPROPOUT1N() {
		return PROPOUT1N;
	}
	public void setPROPOUT1N(Integer pROPOUT1N) {
		PROPOUT1N = pROPOUT1N;
	}
	public Integer getPROPIN1D() {
		return PROPIN1D;
	}
	public void setPROPIN1D(Integer pROPIN1D) {
		PROPIN1D = pROPIN1D;
	}
	public Integer getPROPOUT1D() {
		return PROPOUT1D;
	}
	public void setPROPOUT1D(Integer pROPOUT1D) {
		PROPOUT1D = pROPOUT1D;
	}
	public Integer getPROPIN3N() {
		return PROPIN3N;
	}
	public void setPROPIN3N(Integer pROPIN3N) {
		PROPIN3N = pROPIN3N;
	}
	public Integer getPROPOUT3N() {
		return PROPOUT3N;
	}
	public void setPROPOUT3N(Integer pROPOUT3N) {
		PROPOUT3N = pROPOUT3N;
	}
	public Integer getPROPIN3D() {
		return PROPIN3D;
	}
	public void setPROPIN3D(Integer pROPIN3D) {
		PROPIN3D = pROPIN3D;
	}
	public Integer getPROPOUT3D() {
		return PROPOUT3D;
	}
	public void setPROPOUT3D(Integer pROPOUT3D) {
		PROPOUT3D = pROPOUT3D;
	}
	public Integer getPROPIN5N() {
		return PROPIN5N;
	}
	public void setPROPIN5N(Integer pROPIN5N) {
		PROPIN5N = pROPIN5N;
	}
	public Integer getPROPOUT5N() {
		return PROPOUT5N;
	}
	public void setPROPOUT5N(Integer pROPOUT5N) {
		PROPOUT5N = pROPOUT5N;
	}
	public Integer getPROPIN5D() {
		return PROPIN5D;
	}
	public void setPROPIN5D(Integer pROPIN5D) {
		PROPIN5D = pROPIN5D;
	}
	public Integer getPROPOUT5D() {
		return PROPOUT5D;
	}
	public void setPROPOUT5D(Integer pROPOUT5D) {
		PROPOUT5D = pROPOUT5D;
	}
	public Integer getPROPIN10N() {
		return PROPIN10N;
	}
	public void setPROPIN10N(Integer pROPIN10N) {
		PROPIN10N = pROPIN10N;
	}
	public Integer getPROPOUT10N() {
		return PROPOUT10N;
	}
	public void setPROPOUT10N(Integer pROPOUT10N) {
		PROPOUT10N = pROPOUT10N;
	}
	public Integer getPROPIN10D() {
		return PROPIN10D;
	}
	public void setPROPIN10D(Integer pROPIN10D) {
		PROPIN10D = pROPIN10D;
	}
	public Integer getPROPOUT10D() {
		return PROPOUT10D;
	}
	public void setPROPOUT10D(Integer pROPOUT10D) {
		PROPOUT10D = pROPOUT10D;
	}
	public Integer getPROPIN20D() {
		return PROPIN20D;
	}
	public void setPROPIN20D(Integer pROPIN20D) {
		PROPIN20D = pROPIN20D;
	}
	public Integer getPROPOUT20D() {
		return PROPOUT20D;
	}
	public void setPROPOUT20D(Integer pROPOUT20D) {
		PROPOUT20D = pROPOUT20D;
	}
	public Integer getCKJMDIT() {
		return CKJMDIT;
	}
	public void setCKJMDIT(Integer cKJMDIT) {
		CKJMDIT = cKJMDIT;
	}
	public Integer getCKJMNOC() {
		return CKJMNOC;
	}
	public void setCKJMNOC(Integer cKJMNOC) {
		CKJMNOC = cKJMNOC;
	}
	public Integer getCKJMCBO() {
		return CKJMCBO;
	}
	public void setCKJMCBO(Integer cKJMCBO) {
		CKJMCBO = cKJMCBO;
	}
	public Integer getCKJMRFC() {
		return CKJMRFC;
	}
	public void setCKJMRFC(Integer cKJMRFC) {
		CKJMRFC = cKJMRFC;
	}
	public Integer getCKJMLCOM() {
		return CKJMLCOM;
	}
	public void setCKJMLCOM(Integer cKJMLCOM) {
		CKJMLCOM = cKJMLCOM;
	}
	public Integer getCKJMCa() {
		return CKJMCa;
	}
	public void setCKJMCa(Integer cKJMCa) {
		CKJMCa = cKJMCa;
	}
	public Integer getCKJMNPM() {
		return CKJMNPM;
	}
	public void setCKJMNPM(Integer cKJMNPM) {
		CKJMNPM = cKJMNPM;
	}
	public Integer getMccabe_max() {
		return mccabe_max;
	}
	public void setMccabe_max(Integer mccabe_max) {
		this.mccabe_max = mccabe_max;
	}
	public Integer getMccabe_min() {
		return mccabe_min;
	}
	public void setMccabe_min(Integer mccabe_min) {
		this.mccabe_min = mccabe_min;
	}
	public Integer getMccabe_sum() {
		return mccabe_sum;
	}
	public void setMccabe_sum(Integer mccabe_sum) {
		this.mccabe_sum = mccabe_sum;
	}
	public Integer getMccabe_mean() {
		return mccabe_mean;
	}
	public void setMccabe_mean(Integer mccabe_mean) {
		this.mccabe_mean = mccabe_mean;
	}
	public Integer getMccabe_median() {
		return mccabe_median;
	}
	public void setMccabe_median(Integer mccabe_median) {
		this.mccabe_median = mccabe_median;
	}
	public Integer getHalstead_length() {
		return halstead_length;
	}
	public void setHalstead_length(Integer halstead_length) {
		this.halstead_length = halstead_length;
	}
	public Integer getHalstead_vol() {
		return halstead_vol;
	}
	public void setHalstead_vol(Integer halstead_vol) {
		this.halstead_vol = halstead_vol;
	}
	public Integer getHalstead_level() {
		return halstead_level;
	}
	public void setHalstead_level(Integer halstead_level) {
		this.halstead_level = halstead_level;
	}
	public Integer getHalstead_md() {
		return halstead_md;
	}
	public void setHalstead_md(Integer halstead_md) {
		this.halstead_md = halstead_md;
	}
	public Integer getEffort_action() {
		return effort_action;
	}
	public void setEffort_action(Integer effort_action) {
		this.effort_action = effort_action;
	}
	public Integer getEffort_churn() {
		return effort_churn;
	}
	public void setEffort_churn(Integer effort_churn) {
		this.effort_churn = effort_churn;
	}
	
}
