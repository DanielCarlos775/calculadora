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
	private Button btSubtracao;
	
	@FXML
	private Button btMultiplicacao;
	
	@FXML
	private Button btDivisao;
	
	@FXML
	private Button btLimpar;
	
	@FXML
	private Label lblResultado;
	
	@FXML
	private void onSomar() {
		try {
			double numero1 = Double.parseDouble(txfNumero1.getText());
			double numero2 = Double.parseDouble(txfNumero2.getText());
			double resultado = numero1 + numero2;
			
			lblResultado.setText(String.format("Resultado: %.2f", resultado));
		} catch (NumberFormatException e) {
			lblResultado.setText("Digite Números Válidos");
		}
	}
	
	@FXML
	private void onSubtrair() {
		try {
			double numero1 = Double.parseDouble(txfNumero1.getText());
			double numero2 = Double.parseDouble(txfNumero2.getText());
			double resultado = numero1 - numero2;
			
			lblResultado.setText(String.format("Resultado: %.2f", resultado));
		} catch (NumberFormatException e) {
			lblResultado.setText("Digite Números Válidos");
		}
	}
	
	@FXML
	private void onMultiplicar() {
		try {
			double numero1 = Double.parseDouble(txfNumero1.getText());
			double numero2 = Double.parseDouble(txfNumero2.getText());
			double resultado = numero1 * numero2;
			
			lblResultado.setText(String.format("Resultado: %.2f", resultado));
		} catch (NumberFormatException e) {
			lblResultado.setText("Digite Números Válidos");
		}
	}
	
	@FXML
	private void onDividir() {
		try {
			double numero1 = Double.parseDouble(txfNumero1.getText());
			double numero2 = Double.parseDouble(txfNumero2.getText());
			
			if (numero2 == 0) {
				lblResultado.setText("Impossível Dividir por Zero");
				return;
			}
			double resultado = numero1 / numero2;
			
			lblResultado.setText(String.format("Resultado: %.2f", resultado));
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
