package com.example.demo5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Error {

    @FXML
    private Button add;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    @FXML
    public void initialize() {
        add.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Avtoriz.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Администратор гостиницы ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }

}
