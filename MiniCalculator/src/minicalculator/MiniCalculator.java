/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicalculator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author paoloaliprandi
 */
public class MiniCalculator extends Application {
    
    
     public void start(Stage stage) {
        /*
        Fa tutto questo metodo
        @param stage è il palcoscenico
        */
    Pane vbox = new VBox();
    Pane hbox = new HBox();
    TextField primo = new TextField(""); //primo operand0
    TextField secondo = new TextField(); //secondo operando
    TextField res = new TextField(); //risultato
    
    res.setEditable(false); //il risultato non è modificabile
    
    primo.setPrefSize(400, 10);
    secondo.setPrefSize(400, 10);
    
    
    vbox.getChildren().add(primo);
    vbox.getChildren().add(secondo);
    
    Button piu = new Button(); //somma
    Button meno = new Button(); //differenza
    Button per = new Button(); //moltiplicazione
    Button div = new Button(); //divisione
    Button clear = new Button("Clear"); //reset
    
    piu.setText("+");
    meno.setText("-");
    per.setText("*");
    div.setText("/");
    
    piu.setPrefSize(100,10);
    meno.setPrefSize(100,10);
    per.setPrefSize(100,10);
    div.setPrefSize(100,10);
    
    hbox.getChildren().add(piu);
    hbox.getChildren().add(meno);
    hbox.getChildren().add(per);
    hbox.getChildren().add(div);
    vbox.getChildren().add(res);
    vbox.getChildren().add(clear);
    vbox.getChildren().add(hbox);
    
    /*public boolean check(this) {
        if primo.s
                
    };*/
    
    EventHandler p = new EventHandler() { //somma col pulsante
    @Override
        public void handle(Event event) {
            System.out.println("Somma");
            try {float var1 = Float.parseFloat(primo.getText());
            float var2 = Float.parseFloat(secondo.getText());
            float ris = var1+var2;
            res.setText(ris+"");
            } catch (NumberFormatException x) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("attenzione!");
            alert.setContentText("attento agli input");
            alert.showAndWait();
             primo.setText("");
            secondo.setText("");
            res.setText("");
            }
            
        }
    };
    
    piu.addEventHandler(ActionEvent.ACTION,p);
    
    EventHandler m = new EventHandler() {//differenza col pulsante
    @Override
        public void handle(Event event) {
            System.out.println("Differenza");
            try {float var1 = Float.parseFloat(primo.getText());
            float var2 = Float.parseFloat(secondo.getText());
            float ris = var1-var2;
            res.setText(ris+"");
            } catch (NumberFormatException x) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("attenzione!");
            alert.setContentText("attento agli input");
            alert.showAndWait();
             primo.setText("");
            secondo.setText("");
            res.setText("");
            }
        }
    };
    
    meno.addEventHandler(ActionEvent.ACTION,m);
    
    EventHandler t = new EventHandler() {//moltiplicazione col pulsante
    @Override
        public void handle(Event event) {
            System.out.println("Moltiplicazione");
            try {float var1 = Float.parseFloat(primo.getText());
            float var2 = Float.parseFloat(secondo.getText());
            float ris = var1*var2;
            res.setText(ris+"");
            } catch (NumberFormatException x) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("attenzione!");
            alert.setContentText("attento agli input");
            alert.showAndWait();
             primo.setText("");
            secondo.setText("");
            res.setText("");
            }
        }
    };
    
    per.addEventHandler(ActionEvent.ACTION,t);
    
    EventHandler d = new EventHandler() {//divisione col pulsante
    @Override
        public void handle(Event event) {
            System.out.println("Divisione");
            
          
           
                try {float var1 = Float.parseFloat(primo.getText());
            float var2 = Float.parseFloat(secondo.getText());
            float ris = var1/var2;
            res.setText(ris+"");
            } catch (NumberFormatException x) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("attenzione!");
            alert.setContentText("attento agli input");
            alert.showAndWait();
             primo.setText("");
            secondo.setText("");
            res.setText("");
            }
             
        }
    };
    
    div.addEventHandler(ActionEvent.ACTION,d);
    
    
    
    EventHandler c = new EventHandler() {//reset col pulsante
    

        @Override
        public void handle(Event event) {
            System.out.println("Memory Cleared");
            primo.setText("");
            secondo.setText("");
            res.setText("");
        }
    };
    
    clear.addEventHandler(ActionEvent.ACTION, c);
    
    Scene scene = new Scene(vbox, 600, 300);
    stage.setScene(scene);
    stage.show();
    
    
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
