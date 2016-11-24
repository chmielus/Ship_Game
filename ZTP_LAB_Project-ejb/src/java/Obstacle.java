/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class Obstacle {
    private Vector2 position;
    
    public Obstacle(){
        this.position = new Vector2();
    }
    /**
     * 
     * @return 
     */
    public abstract Vector2[] draw();
    /**
     * Finds points of collision between edge (v1,v2).
     * @param v1 
     * @param v2
     * @return Array of collision vectors.
     */
    public abstract Vector2[] hit(Vector2 v1, Vector2 v2);
}
