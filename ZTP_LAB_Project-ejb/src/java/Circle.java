/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Circle extends Obstacle {

    private double r;

    public Circle(Vector2 position, Vector2 size) {
        this.position = position;
        this.size = size;
        this.r = size.x < size.y ? size.x / 2 : size.y / 2;
    }

    @Override
    public int[][] draw() {
        int arraySize = (int) (r * 2 + 0.5);
        int[][] ret = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                ret[i][j] = 
                    (i - r) * (i - r) + (j - r) * (j - r) <= r * r ? 1 : 0;
            }
        }
        return ret;
    }

    @Override
    public Vector2[] hit(Vector2 v1, Vector2 v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
