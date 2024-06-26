package com.mediavar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aventura em Java");

        Button btnNewGame = new Button("Novo Jogo");
        Button btnLoadGame = new Button("Carregar Jogo");
        Button btnSettings = new Button("Configurações");
        Button btnExit = new Button("Sair");

        btnNewGame.setOnAction(e -> {
            // Iniciar novo jogo
        });

        btnLoadGame.setOnAction(e -> {
            // Carregar jogo salvo
        });

        btnSettings.setOnAction(e -> {
            // Abrir configurações
        });

        btnExit.setOnAction(e -> {
            primaryStage.close();
        });

        VBox vbox = new VBox(btnNewGame, btnLoadGame, btnSettings, btnExit);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}