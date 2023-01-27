package com.example.demo5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Romany {

    @FXML
    private Button fore;

    @FXML
    private ImageView imagine1;

    @FXML
    private ImageView imagine2;

    @FXML
    private ImageView imagine3;

    @FXML
    private ImageView imagine4;

    @FXML
    private Button one;

    @FXML
    private Button razd;

    @FXML
    private Text text1;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    public void initialize() {
        razd.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Razdeli.fxml"));
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
        one.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Master.fxml"));
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
        two.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Geroy.fxml"));
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
        three.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Voina.fxml"));
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

        fore.setOnAction(clik -> {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Otzy.fxml"));
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

