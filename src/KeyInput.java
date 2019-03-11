package com.game.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        for(int i = 0;  i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.Player){
                //key events for player 1
                if(key == KeyEvent.VK_W) {
                    tempObject.setY(tempObject.getY() - 5);
                }

                else if(key == KeyEvent.VK_S) {
                    tempObject.setY(tempObject.getY() + 5);

                }

                else if(key == KeyEvent.VK_A) {
                    tempObject.setX(tempObject.getX() - 5);

                }

                else if(key == KeyEvent.VK_D) {
                    tempObject.setX(tempObject.getX() + 5);

                }
                else if(key == KeyEvent.VK_SPACE){

                    handler.addObject(new Projectile(tempObject.getX(), tempObject.getY()+32,  ID.Projectile, handler));
                    tempObject.shoot(handler);
                    System.out.println(handler);

                }
            }

            else if(tempObject.getId() == ID.Player2){
                //key events for player 1
                if(key == KeyEvent.VK_UP) {
                    tempObject.setY(tempObject.getY() - 5);
                }

                else if(key == KeyEvent.VK_DOWN) {
                    tempObject.setY(tempObject.getY() + 5);

                }

                else if(key == KeyEvent.VK_LEFT) {
                    tempObject.setX(tempObject.getX() - 5);

                }

                else if(key == KeyEvent.VK_RIGHT) {
                    tempObject.setX(tempObject.getX() + 5);

                }
                else if(key == KeyEvent.VK_ENTER){
                    handler.addObject(new Projectile(tempObject.getX(), tempObject.getY()+32,  ID.Projectile2, handler));
                    tempObject.shoot(handler);
                    System.out.println(handler);
                }
            }
        }
        //System.out.println(key);
    }
    public void keyReleased(KeyEvent e){
        int key =  e.getKeyCode();
    }
}
