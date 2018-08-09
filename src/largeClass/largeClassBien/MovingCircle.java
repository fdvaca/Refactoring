/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeClass.largeClassBien;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

/**
 *
 * @author Fernando
 */
public class MovingCircle {
    private double initX;
    private double initY;
    private Point2D posicionInitMouse;
    
    public void moveMouse(Circle circulo, Pane shapePane){
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
