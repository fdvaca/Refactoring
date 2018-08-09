/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeClass.largeClassBien;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Fernando
 */
public class Circulo {
    
    private BorderPane border;
    private Pane shapePane;
    private Circle circulo;
    
    public Circulo(){
        setUpCircle();
    }
    
    private void setUpCircle(){
        shapePane=new Pane();
        circulo= new Circle(15);
        shapePane.getChildren().add(circulo);
        
        border.setCenter(shapePane);
        
        Background bg= new Background(new BackgroundFill(Color.AQUA,CornerRadii.EMPTY,Insets.EMPTY));
        shapePane.setBackground(bg);
        
        circulo.setFill(Color.RED);
        circulo.setCenterX(15);
        circulo.setCenterY(15);
        circulo.setStroke(Color.BLACK);
        
   
    }
    
}
