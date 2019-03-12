package com.game.main;

import java.awt.*;

//class that creates player and player actions
public class Player extends GameObject{

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id, handler);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        if(id == ID.Player) {
            g.setColor(Color.white);
            g.fillRect(x, y, 32, 32);
        }
        else if(id == ID.Player2){
            g.setColor(Color.gray);
            g.fillRect(x, y, 32, 32);
        }

    }

    public void shoot(Handler handler){
        GameObject proj = new Projectile(this.x, this.y - 32, ID.Projectile, this.getId(), handler);
    }
}
