package com.game.main;

import java.awt.*;
//abstract class -- blueprint class for those that extend it. this is a blueprint for all the game's objects. common methods include...
//protected means only things that extend it can use it
public abstract class GameObject {
    public static final int WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    public static final int HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    protected int x, y;
    protected ID id;
    protected int velX, velY;
    protected Handler handler;

    public GameObject(int x, int y, ID id, Handler handler){
        this.x = x;
        this.y = y;
        this.id = id;
        this.handler = handler;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract void shoot(Handler handler);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setId(ID id){
        this.id = id;
    }

    public ID getId(){
        return id;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }
}
