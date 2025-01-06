package org.app;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import javafx.scene.control.ProgressBar;

public class EThread {
	
	private AppObjects appObjects;
	private ProgressBar progressBar;

	public EThread(AppObjects appObjects) {
		this.appObjects = appObjects;
		this.progressBar = appObjects.getProgressBar();
	}

	
	public void testProgress() {
//		System.out.println("start test");
		
	   Thread tr = new Thread(new Runnable() {
		
		@Override
		public void run() {
			double progress = 1;
			while (progress <= 100) {
				progressBar.setProgress(progress/100);
				
				System.out.println(progress/100);
				
				progress += 1;
				
				try {
					Thread.sleep(100);
				}catch (Exception e) {
					
				}
			}
			
		}
	});
	   
	   tr.run();
	}
	
	
	public AppObjects getAppObjects() {
		return appObjects;
	}

	public void setAppObjects(AppObjects appObjects) {
		this.appObjects = appObjects;
	}
	
	

}
