/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;
import java.lang.Math;

/**
 *
 * @author higor
 */
public class HeuristicaManhattan8d implements Heuristic<TileNode>{
    private float dx;
    private float dy;
    @Override
    public float estimate(TileNode n, TileNode n1) {
        dx = Math.abs(n.getPosition().x - n1.getPosition().x)/9;
        dy = Math.abs(n.getPosition().y - n1.getPosition().y)/9;
        return (float) ((dx+dy)+(Math.sqrt(2.0)-2)*Math.min(dx, dy));
    }
    
}
