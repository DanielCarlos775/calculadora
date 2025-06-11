package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaCalcController {
	
	@FXML
	private TextField txfNumero1;
	
	@FXML
	private TextField txfNumero2;
	
	@FXML
	private Button btSomar;
	
	@FXML
	private Button btLimpar;
	
	@FXML
	private Label lblResultado;
	
	@FXML
	private void onSomarValores() {
		try {
			double numero1 = Double.parseDouble(txfNumero1.getText());
			double numero2 = Double.parseDouble(txfNumero2.getText());
			double resultado = numero1 + numero2;
			
			lblResultado.setText("Resultado :" + resultado);
		} catch (NumberFormatException e) {
			lblResultado.setText("Digite Números Válidos");
		}
	}
	
	@FXML
	private void onLimparResultado() {
			txfNumero1.clear();
			txfNumero2.clear();
			lblResultado.setText("");
		}
	
	}
