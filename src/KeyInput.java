package com.game.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.atomic.AtomicBoolean;
//keypress method
public class KeyInput extends KeyAdapter {

    private final AtomicBoolean canShoot = new AtomicBoolean(true);
    private Handler handler;
    public String direction;

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
                    tempObject.setVelY(-5);
                    direction = "up";
                }

                else if(key == KeyEvent.VK_S) {
                    tempObject.setVelY(5);
                    direction = "down";

                }

                else if(key == KeyEvent.VK_A) {
                    tempObject.setVelX(-5);
                    direction = "left";
                }

                else if(key == KeyEvent.VK_D) {
                    tempObject.setVelX(5);
                    direction = "right";
                }
                else if(key == KeyEvent.VK_SPACE){
                    if(canShoot.compareAndSet(true, false)) {
                        handler.addObject(new Projectile(tempObject.getX(), tempObject.getY() + 32, ID.Projectile, handler));
                        tempObject.shoot(handler);
                    }

                }
            }

            else if(tempObject.getId() == ID.Player2){
                //key events for player 1
                if(key == KeyEvent.VK_UP) {
                    tempObject.setVelY(-5);
                    direction = "up";
                }

                else if(key == KeyEvent.VK_DOWN) {
                    tempObject.setVelY(5);
                    direction = "down";
                }

                else if(key == KeyEvent.VK_LEFT) {
                    tempObject.setVelX(-5);
                    direction = "left";
                }

                else if(key == KeyEvent.VK_RIGHT) {
                    tempObject.setVelX(5);
                    direction = "right";
                }
                else if(key == KeyEvent.VK_ENTER){
                    if(canShoot.compareAndSet(true, false)) {
                        handler.addObject(new Projectile(tempObject.getX(), tempObject.getY() + 32, ID.Projectile2, handler));
                        tempObject.shoot(handler);
                    }
                }
            }
        }
        //System.out.println(key);
    }
    public void keyReleased(KeyEvent e){
        int key =  e.getKeyCode();
        for(int i = 0;  i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.Player){
                //key events for player 1
                if(key == KeyEvent.VK_W) {
                    tempObject.setVelY(0);
                }

                else if(key == KeyEvent.VK_S) {
                    tempObject.setVelY(0);

                }

                else if(key == KeyEvent.VK_A) {
                    tempObject.setVelX(0);

                }

                else if(key == KeyEvent.VK_D) {
                    tempObject.setVelX(0);

                }
                else if(key == KeyEvent.VK_SPACE){
                    canShoot.set(true);
                }
            }

            else if(tempObject.getId() == ID.Player2){
                //key events for player 1
                if(key == KeyEvent.VK_UP) {
                    tempObject.setVelY(0);
                }

                else if(key == KeyEvent.VK_DOWN) {
                    tempObject.setVelY(0);

                }

                else if(key == KeyEvent.VK_LEFT) {
                    tempObject.setVelX(0);

                }

                else if(key == KeyEvent.VK_RIGHT) {
                    tempObject.setVelX(0);

                }

                else if(key == KeyEvent.VK_ENTER){
                    canShoot.set(true);
                }
            }
        }
    }
}
