package com.example.demo5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

public class Avtoriz {

    @FXML
    private Button addlogin;

    @FXML
    private Button addnumber;

    @FXML
    private Button addpass;

    @FXML
    private Button addreg;

    @FXML
    private TextField login;

    @FXML
    private TextField number;

    @FXML
    private TextField pass;

    @FXML
    private Text text1;

    @FXML
    private Button reg;

    @FXML
    private Text text2;

    @FXML
    void initialize() {


        addreg.setOnAction(clik -> {
            addreg.setText("Спасибо за авторизацию ");
            System.out.println("Логин: " + login.getText());
            System.out.println("Пароль: " + pass.getText());
            System.out.println("Номер: " + number.getText());
            addreg.getScene().getWindow().hide();


            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo5\\src\\main\\resources\\com\\example\\demo5\\inputlogin")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(login.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("Razdeli.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Библиотека ");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("password success");
                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("Error.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Библиотека ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo5\\src\\main\\resources\\com\\example\\demo5\\inputpass")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(pass.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("Razdeli.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Библиотека ");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("password success");
                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("Error.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Библиотека ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo5\\src\\main\\resources\\com\\example\\demo5\\inputnumber")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(number.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("Razdeli.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Библиотека ");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("password success");
                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("Error.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Библиотека ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


            reg.setOnAction(clik -> {
                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("Registration.fxml"));
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


