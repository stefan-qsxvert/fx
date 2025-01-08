package org.app;

import javax.net.ssl.SSLException;

public class Rn implements Runnable{
	
	public AppObjects appObjects;
	
	public Rn(AppObjects appObjects) {
		this.appObjects = appObjects;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		etc();
	}
	
	public void etc() {
		//--------------------------------		
						
						appObjects.getProgressBar().setProgress(0);
						appObjects.getProgressIndicator().setProgress(0);

						double progress = 1;
						while (progress < 100) {
							progress += 1;
							appObjects.getProgressBar().setProgress(progress/100);
//							appObjects.getProgressIndicator().setProgress(progress/100);
							System.out.println(progress/100);
							try {
								Thread.sleep(30);
							}catch (Exception e) {
								
							}
							
						}
					
					}
	

}
