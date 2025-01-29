package org.app;

public class Paths {
	AppObjects appObjects;
	public Paths(AppObjects appObjects) {
		this.appObjects = appObjects;
	}
	
//	private String referenceIdsPath;
	private String pitFilesToSendPath;
	private String sentPitFilesPath;
	private String cacertPath;
	private String newCertificatPath;
	private String upoFilesPath;
	public AppObjects getAppObjects() {
		return appObjects;
	}
	public void setAppObjects(AppObjects appObjects) {
		this.appObjects = appObjects;
	}

	public String getPitFilesToSendPath() {
		return pitFilesToSendPath;
	}
	public void setPitFilesToSendPath(String pitFilesToSendPath) {
		this.pitFilesToSendPath = pitFilesToSendPath;
	}
	public String getSentPitFilesPath() {
		return sentPitFilesPath;
	}
	public void setSentPitFilesPath(String sentPitFilesPath) {
		this.sentPitFilesPath = sentPitFilesPath;
	}
	public String getCacertPath() {
		return cacertPath;
	}
	public void setCacertPath(String cacertPath) {
		this.cacertPath = cacertPath;
	}
	public String getNewCertificatPath() {
		return newCertificatPath;
	}
	public void setNewCertificatPath(String newCertificatPath) {
		this.newCertificatPath = newCertificatPath;
	}
	public String getUpoFilesPath() {
		return upoFilesPath;
	}
	public void setUpoFilesPath(String upoFilesPath) {
		this.upoFilesPath = upoFilesPath;
	}
	
}
