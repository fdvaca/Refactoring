/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeClass.largeClassMal;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Fernando
 */
public class MovingCircle {
    
    private BorderPane border;
    private Pane shapePane;
    private Circle circulo;
    private double initX;
    private double initY;
    private Point2D posicionInitMouse;
    
    
    
    public void MovingCircle(){
        setUpCircle();
        moveMouse();
        
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
    
    public void moveMouse(){
        circulo.setOnMousePressed(me ->{
        initX=circulo.getCenterX();
        initY=circulo.getCenterY();
        posicionInitMouse=new Point2D(me.getSceneX(),me.getSceneY());  
        });
        
        circulo.setOnMouseDragged((MouseEvent me)->{
            double dragX=me.getSceneX()-posicionInitMouse.getX();
            double dragY=me.getSceneY()- posicionInitMouse.getY();
            
            double newXPosition= initX+dragX;
            double newYPosition=initY+dragY;
            double widthArea=shapePane.widthProperty().doubleValue();
            double heightArea=shapePane.heightProperty().doubleValue();
            
            if((newXPosition>=circulo.getRadius())&& (newXPosition<=widthArea-circulo.getRadius())){
                circulo.setCenterX(newXPosition);
            }
            if((newYPosition>=circulo.getRadius())&& (newYPosition<=heightArea-circulo.getRadius())){
                circulo.setCenterY(newYPosition);
            }
            
        
    });
    }
    
    
}
