package userinterface.controller;

// imports de arquivos locais
import aplicacao.fxml.UIabaCancelarExcluir;
import aplicacao.fxml.UIabaEditarPacote;
import entidades.pacote.Pacote;

// imports do javafx
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

// outros imports
import java.util.ArrayList;

public class abaEditarExcluirController {
    private Pacote pacote;
    private ArrayList<Pacote> listaBBD;
    private Stage stage;

    public void setLista(ArrayList<Pacote> lista){
        listaBBD = lista;
    }

    public void setPacote(Pacote pacote){
        this.pacote = pacote;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    private Button deletarBotao;

    // esse método é chamado quando o botão é pressionado no fxml
    @FXML
    private void deletarBotaoAcao(ActionEvent e) throws Exception{
        UIabaCancelarExcluir fxmlCE = new UIabaCancelarExcluir();
        fxmlCE.start(new Stage(), pacote, listaBBD, stage);
    }

    @FXML
    private Button editarBotao;

    // esse método é chamado quando o botão é pressionado no fxml
    @FXML
    private void editarBotaoAcao(ActionEvent e) throws Exception{
        UIabaEditarPacote fxmlMEP = new UIabaEditarPacote();
        fxmlMEP.start(new Stage(), pacote, listaBBD, stage);
    }

    @FXML
    private TextArea infoPacoteArea;

    public void setInfo(String info){
        infoPacoteArea.setText(info);
    }

}
