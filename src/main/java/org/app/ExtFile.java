package org.app;

import java.io.File;

public class ExtFile extends File {
	
	public ExtFile(String pathname) {
		super(pathname);
	}

	private static final long serialVersionUID = 1L;
	
	private String sent;

	public String isSent() {
		return sent;
	}

	public void setSent(String sent) {
		this.sent = sent;
	}
}
