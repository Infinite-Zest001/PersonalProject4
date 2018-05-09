package edu.cuny.brooklyn.project.controller;

import edu.cuny.brooklyn.project.GameSettings;
import edu.cuny.brooklyn.project.message.I18n;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class SettingsFrameViewController {
	@FXML 
	private Button saveAndReturn;
	
	@FXML
	private ToggleGroup puzzlerGroup;
	
	@FXML
	private Label puzzlerLabel;
	
	@FXML
	private ToggleButton randomPuzzler;
	
	@FXML
	private ToggleButton sqrtPuzzler;
	
	@FXML
	private ToggleButton slidingCupsPuzzler;
	
	@FXML
	private ToggleGroup diffcGroup;
	
	@FXML
	private Label diffcLabel;
	
	@FXML
	private ToggleButton easyDiffc;
	
	@FXML
	private ToggleButton normalDiffc;
	
	@FXML
	private ToggleButton hardDiffc;
	
    public void initialize() {
    	puzzlerLabel.setText(I18n.getBundle().getString(GameSettings.MSG_SETTINGS_PUZZLER_TITLE_KEY));
    	randomPuzzler.setText(I18n.getBundle().getString(GameSettings.MSG_SETTINGS_PUZZLER_RANDOM_KEY));
    	sqrtPuzzler.setText(I18n.getBundle().getString(GameSettings.MSG_SETTINGS_PUZZLER_SQRT_KEY));
    	slidingCupsPuzzler.setText(I18n.getBundle().getString(GameSettings.MSG_SETTINGS_PUZZLER_SLIDING_CUPS_KEY));
  
		//saveAndReturn.setText(I18n.getBundle().getString(GameSettings.MSG_SETTINGS_SAVE_KEY));
		//settingsButton.setText(I18n.getBundle().getString(GameSettings.MSG_SETTINGS_GAME_KEY));
    }
	
	
}
