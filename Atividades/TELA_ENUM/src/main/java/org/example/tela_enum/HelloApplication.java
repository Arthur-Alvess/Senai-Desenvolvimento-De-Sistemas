package org.example.tela_enum;

import AtividadeENUM.entities.Produto;
import AtividadeENUM.entities.StatusPedido;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega o arquivo FXML (interface gráfica)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
        StackPane root = loader.load();

        // Cria a cena
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Loja Online");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
