/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethod.longMethodMal;


import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Fernando
 */
public class GameWindowMal {
    
    private BorderPane bp;
    private Button continuar;
    private Button atras;
    private Rectangle rect;
    private Circle circulo;
    private Ellipse elipse;
    
    
   public void setUpElements(){
       bp=new BorderPane();
       continuar=new Button("Continuar");
       atras=new Button("Atras");
       continuar.setMaxSize(24.0, 15.0);
       atras.setMaxSize(24.0, 15.0);
       continuar.setStyle("-fx-font-size: 24;");
       atras.setStyle("-fx-font-size: 24;");
       rect=new Rectangle(25,10);
       rect.setFill(Color.web("#ed4b00"));
       circulo=new Circle(45);
       circulo.setFill(Color.web("#ed4b00"));
       elipse=new Ellipse(3.4,6.7);
       elipse.setFill(Color.web("#ed4b00"));
       bp.getChildren().addAll(continuar,atras,rect,circulo,elipse);
 
   }
    
}
