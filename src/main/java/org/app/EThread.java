package org.app;

import javafx.scene.control.ProgressBar;

public class EThread {
	
	private AppObjects appObjects;
	private ProgressBar progressBar;

	public EThread(AppObjects appObjects) {
		this.appObjects = appObjects;
		this.progressBar = appObjects.getProgressBar();
	}

	
	public void testProgress() {
	
		System.out.println();
		
		Thread.startVirtualThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				double progress = 1;
				while (progress <= 100) {
					progress += 1;
					progressBar.setProgress(progress/100);
					appObjects.getProgressIndicator().setProgress(progress/100);
					System.out.println(progress/100);
					try {
						Thread.sleep(100);
					}catch (Exception e) {
						
					}
				}
				
			}
		});
	}
	
	public AppObjects getAppObjects() {
		return appObjects;
	}

	public void setAppObjects(AppObjects appObjects) {
		this.appObjects = appObjects;
	}
	
	

}
