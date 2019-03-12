package com.game.main;

import java.awt.*;
//projectile object created by player
public class Projectile extends Player {
    private ID player;
    public Projectile(int x, int y, ID id, ID player, Handler handler) {
        super(x, y, id, handler);
        velX = 2;
        this.player = player;
    }

    @Override
    public void tick() {
        if(player == ID.Player)
            x += velX;
        else if(player == ID.Player2)
            x -= velX;
        if(this.x > WIDTH || this.x < 0 || this.y > HEIGHT || this.y < 0){
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
