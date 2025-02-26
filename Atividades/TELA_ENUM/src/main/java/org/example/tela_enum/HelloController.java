package org.example.tela_enum;

import AtividadeENUM.entities.Produto;
import AtividadeENUM.entities.StatusPedido;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    private ComboBox<String> produtoComboBox;

    @FXML
    private Button adicionarCarrinhoButton;

    @FXML
    private TextArea statusTextArea;

    // Produtos simulados
    private Produto produto1  = new Produto(101, "Calça Legging Feminina", 75.90);
    private Produto produto2  = new Produto(102, "Camisa Dry-Fit Masculina", 58.99);
    private Produto produto3  = new Produto(103, "Chinelo Kenner", 199.90);
    private Produto produto4  = new Produto(104, "Óculos de Sol", 129.90);

    // Status dos pedidos simulados
    private StatusPedido statusPedido1 = StatusPedido.Aguardando_Pagamento;
    private StatusPedido statusPedido2 = StatusPedido.Preparando;
    private StatusPedido statusPedido3 = StatusPedido.Em_Deslocamento;
    private StatusPedido statusPedido4 = StatusPedido.Finalizado;

    // Método que é chamado quando o botão é clicado
    @FXML
    private void adicionarCarrinho() {
        String selectedProduct = produtoComboBox.getValue();

        if (selectedProduct == null) {
            showAlert("Seleção inválida", "Por favor, selecione um produto!");
            return;
        }

        Produto produtoSelecionado = null;
        StatusPedido statusSelecionado = null;

        switch (selectedProduct.split(" - ")[0]) {
            case "101":
                produtoSelecionado = produto1;
                statusSelecionado = statusPedido1;
                break;
            case "102":
                produtoSelecionado = produto2;
                statusSelecionado = statusPedido1;
                break;
            case "103":
                produtoSelecionado = produto3;
                statusSelecionado = statusPedido1;
                break;
            case "104":
                produtoSelecionado = produto4;
                statusSelecionado = statusPedido1;
                break;
            default:
                break;
        }

        // Atualiza a área de texto com o carrinho e o status
        if (produtoSelecionado != null && statusSelecionado != null) {
            statusTextArea.setText("Carrinho: \n" + produtoSelecionado.toString() + "\nStatus: " + statusSelecionado);
        }
    }

    // Função para mostrar alertas
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

