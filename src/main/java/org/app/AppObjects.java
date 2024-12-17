package org.app;

import java.awt.GradientPaint;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;

public class AppObjects {
	private AppObjects appObjects;
	private Gui gui;
	private FxComponents fxComponents;
	private EventAction eventAction;
	private WsdlToJavaGenerator wsdlToJavaGenerator;
	private Edeklaracje edeklaracje;
	private GuiPerson guiPerson;
	private Person[] person;
	private Group group;
	private Scene scene;
	private ProgressBar progressBar;
	
	public AppObjects() {
		gui = new Gui();
//		fxComponents = new FxComponents();
		eventAction = new EventAction();
		wsdlToJavaGenerator = new WsdlToJavaGenerator();
		edeklaracje = new Edeklaracje();
		guiPerson = new GuiPerson();
//		group = new Group();
//		scene = new Scene(group);
	}

	public AppObjects getAppObjects() {
		return appObjects;
	}

	public void setAppObjects(AppObjects appObjects) {
		this.appObjects = appObjects;
	}

	public Gui getGui() {
		return gui;
	}

	public void setGui(Gui gui) {
		this.gui = gui;
	}

	public FxComponents getFxComponents() {
		return fxComponents;
	}

	public void setFxComponents(FxComponents fxComponents) {
		this.fxComponents = fxComponents;
	}

	public EventAction getEventAction() {
		return eventAction;
	}

	public void setEventAction(EventAction eventAction) {
		this.eventAction = eventAction;
	}

	public WsdlToJavaGenerator getWsdlToJavaGenerator() {
		return wsdlToJavaGenerator;
	}

	public void setWsdlToJavaGenerator(WsdlToJavaGenerator wsdlToJavaGenerator) {
		this.wsdlToJavaGenerator = wsdlToJavaGenerator;
	}

	public Edeklaracje getEdeklaracje() {
		return edeklaracje;
	}

	public void setEdeklaracje(Edeklaracje edeklaracje) {
		this.edeklaracje = edeklaracje;
	}

	public GuiPerson getGuiPerson() {
		return guiPerson;
	}

	public void setGuiPerson(GuiPerson guiPerson) {
		this.guiPerson = guiPerson;
	}

	public Person getPerson(int i) {
		return person[i];
	}

	public void setPerson(int i, Person person) {
		this.person[i] = person;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Person[] getPerson() {
		return person;
	}

	public void setPerson(Person[] person) {
		this.person = person;
	}

	public ProgressBar getProgressBar() {
		return progressBar;
	}

	public void setProgressBar(ProgressBar progressBar) {
		this.progressBar = progressBar;
	}
	
}
