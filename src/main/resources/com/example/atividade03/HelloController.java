package com.example.atividade03;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtIdade;

    @FXML
    private RadioButton rbMasculino;

    @FXML
    private RadioButton rbFeminino;

    @FXML
    private CheckBox chkEsportes;

    @FXML
    private Label lblResultado;

    @FXML
    private Label lblObs;

    @FXML
    protected void analisar() {

        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());

        String sexo = rbMasculino.isSelected() ? "masculino" : "feminino";

        String esportes = chkEsportes.isSelected()
                ? "gosta de esportes"
                : "não gosta de esportes";

        lblResultado.setText(nome + ", " + idade + " anos, do sexo " + sexo + ", " + esportes + ".");

        if (idade < 18) {
            lblObs.setText("Menor de idade.");
        } else {
            lblObs.setText("Maior de idade.");
        }
    }
}
