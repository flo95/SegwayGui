package application;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FxmlController {

	@FXML
	private LineChart areaBattery;
	@FXML
	private LineChart areaCycleTime;
	@FXML
	private LineChart areaGyroAngel;
	@FXML
	private LineChart areaOffset;
	@FXML
	private LineChart areaMotor;
	@FXML
	private TextField tfKp;
	@FXML
	private TextField tfTn;
	@FXML
	private TextField tfTv;
	@FXML
	private Button btSend;
	@FXML
	private Button btUp;
	@FXML
	private Button btLeft;
	@FXML
	private Button btDown;
	@FXML
	private Button btRight;

	@FXML
	public void buttonSendOnAction() {
	}

	@FXML
	public void buttonUp() {
	}

	@FXML
	public void buttonLeft() {
	}

	@FXML
	public void buttonDown() {
	}

	@FXML
	public void buttonRight() {
	}

}
