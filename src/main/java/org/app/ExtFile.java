package org.app;

import java.io.File;

public class ExtFile extends File {
	
	private String sentStatus;
	private long lp; 
	private String type;
	
	public ExtFile(String pathname) {
		super(pathname);
	}

	private static final long serialVersionUID = 1L;

	public String getSentStatus() {
		return sentStatus;
	}

	public void setSentStatus(String sentStatus) {
		this.sentStatus = sentStatus;
	}

	public long getLp() {
		return lp;
	}

	public void setLp(long lp) {
		this.lp = lp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
