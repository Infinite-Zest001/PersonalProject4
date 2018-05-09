package edu.cuny.brooklyn.project.controller;

import edu.cuny.brooklyn.project.GameSettings;
import edu.cuny.brooklyn.project.message.I18n;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FlashFrameViewController {
    @FXML
    private Label flashLabel;

    @FXML
    private Button startButton;
    
    @FXML
    private Button settingsButton;
    
    /*
     * the initialize() method:
     * see 
     * https://docs.oracle.com/javase/8/javafx/api/javafx/fxml/doc-files/introduction_to_fxml.html#controllers
     */
    public void initialize() {
		flashLabel.setText(I18n.getBundle().getString(GameSettings.MSG_GAME_DESCRIPTION_KEY));
		startButton.setText(I18n.getBundle().getString(GameSettings.MSG_START_GAME_KEY));
		settingsButton.setText(I18n.getBundle().getString(GameSettings.MSG_SETTINGS_GAME_KEY));
    }
    
    public void setOnStartButtonAction(EventHandler<ActionEvent> handler) {
    	startButton.setOnAction(handler);
    }
    
    public void setOnSettingsButtonAction(EventHandler<ActionEvent> handler) {
    	settingsButton.setOnAction(handler);
    }
}