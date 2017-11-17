/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ASUS
 */
public class kalkulatorController implements Initializable {
    
      @FXML
    private TextField nilai1 = new TextField();
    @FXML
    private TextField nilai2 = new TextField();
    @FXML
    private TextField hasil = new TextField();
   
    @FXML
    public void tambahkan(ActionEvent event) {
        int a = Integer.valueOf(nilai1.getText());
        int b = Integer.valueOf(nilai2.getText());
        int jum = a + b;
        String jumab = String.valueOf(jum);
        String jmlhab =  jumab; 
       hasil.setText(jmlhab);
        
    }

    public void kurangkan(ActionEvent event) {
        int a = Integer.valueOf(nilai1.getText());
        int b = Integer.valueOf(nilai2.getText());
        int jum = a - b;
        String jumab = String.valueOf(jum);
        String jmlhab = jumab;
        hasil.setText(jmlhab);
    }

    public void kalikan(ActionEvent event) {
        int a = Integer.valueOf(nilai1.getText());
        int b = Integer.valueOf(nilai2.getText());
        int jum = a * b;
        String jumab = String.valueOf(jum);
        String jmlhab = jumab;
        hasil.setText(jmlhab);
    }
    
    public void bagikan(ActionEvent event) {
        int a = Integer.valueOf(nilai1.getText());
        int b = Integer.valueOf(nilai2.getText());
        float jum = a / b;
        String jumab = String.valueOf(jum);
        String jmlhab =  jumab;
        hasil.setText(jmlhab);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
