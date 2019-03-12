package com.game.main;

import java.awt.*;
//projectile object created by player
public class Projectile extends Player {
    public Projectile(int x, int y, ID id, Handler handler) {
        super(x, y, id, handler);
        velX = 2;
    }

    @Override
    public void tick() {
        x += velX;
        if(this.x > WIDTH || this.y > HEIGHT){
            System.out.println("removed");
            handler.removeObject(this);
        }
    }

    @Override
    public void render(Graphics g) {
        if(this.getId() == ID.Projectile) {
            g.setColor(Color.red);
            g.fillRect(this.x, this.y - 32, 10, 5);
        }
        else if(this.getId() == ID.Projectile2) {
            g.setColor(Color.blue);
            g.fillRect(this.x, this.y - 32, 10, 5);
        }
    }
}
