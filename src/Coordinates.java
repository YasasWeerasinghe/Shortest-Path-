

import java.util.ArrayList;

/**
  * @author Yasas Weerasingh
 *  
 *  
 */
// cell Coordinates
public class Coordinates {
    
  // create 2 arrays for the every Coordinates
    //tree  array
    public ArrayList<Integer> Tree_X_Coordinates = new ArrayList<Integer>();
    public ArrayList<Integer> Tree_Y_Coordinates = new ArrayList<Integer>();
    //bushes  array
    public ArrayList<Integer> Bushes_X_Coordinates = new ArrayList<Integer>();
    public ArrayList<Integer> Bushes_Y_Coordinates = new ArrayList<Integer>();
    //rocks  array
    public ArrayList<Integer> Rocks_X_Coordinates = new ArrayList<Integer>();
    public ArrayList<Integer> Rocks_Y_Coordinates = new ArrayList<Integer>();
    //water  array
    public ArrayList<Integer> Water_X_Coordinates = new ArrayList<Integer>();
    public ArrayList<Integer> Water_Y_Coordinates = new ArrayList<Integer>();

    public Coordinates() {
        Tree(); // call methods to the constructer
        Bushes();
        Rocks();
        Water();
    }
    
    
     // tree Coordinates method
    public void Tree(){
                Tree_X_Coordinates.add(1); Tree_Y_Coordinates.add(6);
                Tree_X_Coordinates.add(1); Tree_Y_Coordinates.add(7);
                Tree_X_Coordinates.add(1); Tree_Y_Coordinates.add(9);
                Tree_X_Coordinates.add(1); Tree_Y_Coordinates.add(10);
                Tree_X_Coordinates.add(1); Tree_Y_Coordinates.add(11);
                Tree_X_Coordinates.add(2); Tree_Y_Coordinates.add(8);
                Tree_X_Coordinates.add(2); Tree_Y_Coordinates.add(9);
                Tree_X_Coordinates.add(2); Tree_Y_Coordinates.add(10);
                Tree_X_Coordinates.add(2); Tree_Y_Coordinates.add(11);
                Tree_X_Coordinates.add(3); Tree_Y_Coordinates.add(7);
                Tree_X_Coordinates.add(3); Tree_Y_Coordinates.add(8);
                Tree_X_Coordinates.add(3); Tree_Y_Coordinates.add(9);
                Tree_X_Coordinates.add(3); Tree_Y_Coordinates.add(10);
                Tree_X_Coordinates.add(4); Tree_Y_Coordinates.add(5);
                Tree_X_Coordinates.add(4); Tree_Y_Coordinates.add(6);
                Tree_X_Coordinates.add(4); Tree_Y_Coordinates.add(8);
                Tree_X_Coordinates.add(4); Tree_Y_Coordinates.add(9);
                Tree_X_Coordinates.add(4); Tree_Y_Coordinates.add(10);
                Tree_X_Coordinates.add(5); Tree_Y_Coordinates.add(5);
                Tree_X_Coordinates.add(5); Tree_Y_Coordinates.add(6);
                Tree_X_Coordinates.add(5); Tree_Y_Coordinates.add(8);
                Tree_X_Coordinates.add(5); Tree_Y_Coordinates.add(9);
                Tree_X_Coordinates.add(5); Tree_Y_Coordinates.add(10);
                Tree_X_Coordinates.add(6); Tree_Y_Coordinates.add(8);
                Tree_X_Coordinates.add(6); Tree_Y_Coordinates.add(9);
                Tree_X_Coordinates.add(6); Tree_Y_Coordinates.add(10);
                Tree_X_Coordinates.add(7); Tree_Y_Coordinates.add(1);
                Tree_X_Coordinates.add(7); Tree_Y_Coordinates.add(9);
                Tree_X_Coordinates.add(7); Tree_Y_Coordinates.add(10);
                Tree_X_Coordinates.add(8); Tree_Y_Coordinates.add(1);
                Tree_X_Coordinates.add(8); Tree_Y_Coordinates.add(2);
                Tree_X_Coordinates.add(8); Tree_Y_Coordinates.add(3);
                Tree_X_Coordinates.add(8); Tree_Y_Coordinates.add(4);
                Tree_X_Coordinates.add(9); Tree_Y_Coordinates.add(1);
                Tree_X_Coordinates.add(9); Tree_Y_Coordinates.add(2);
                Tree_X_Coordinates.add(9); Tree_Y_Coordinates.add(3);
                Tree_X_Coordinates.add(9); Tree_Y_Coordinates.add(4);
                Tree_X_Coordinates.add(9); Tree_Y_Coordinates.add(5);
                Tree_X_Coordinates.add(10); Tree_Y_Coordinates.add(0);
                Tree_X_Coordinates.add(10); Tree_Y_Coordinates.add(1);
                Tree_X_Coordinates.add(10); Tree_Y_Coordinates.add(2);
                Tree_X_Coordinates.add(10); Tree_Y_Coordinates.add(3);
                Tree_X_Coordinates.add(10); Tree_Y_Coordinates.add(4);
                Tree_X_Coordinates.add(10); Tree_Y_Coordinates.add(5);
                Tree_X_Coordinates.add(11); Tree_Y_Coordinates.add(1);
                Tree_X_Coordinates.add(11); Tree_Y_Coordinates.add(2);
                Tree_X_Coordinates.add(11); Tree_Y_Coordinates.add(3);
                Tree_X_Coordinates.add(11); Tree_Y_Coordinates.add(4);
                Tree_X_Coordinates.add(11); Tree_Y_Coordinates.add(5);
                Tree_X_Coordinates.add(12); Tree_Y_Coordinates.add(0);
                Tree_X_Coordinates.add(12); Tree_Y_Coordinates.add(1);
                Tree_X_Coordinates.add(12); Tree_Y_Coordinates.add(2);
                Tree_X_Coordinates.add(12); Tree_Y_Coordinates.add(3);
                Tree_X_Coordinates.add(12); Tree_Y_Coordinates.add(4);
                Tree_X_Coordinates.add(12); Tree_Y_Coordinates.add(5);
                Tree_X_Coordinates.add(13); Tree_Y_Coordinates.add(3);
                Tree_X_Coordinates.add(13); Tree_Y_Coordinates.add(4);
                Tree_X_Coordinates.add(13); Tree_Y_Coordinates.add(5);
        
    }
    // bushes Coordinates method
    public void Bushes(){
                Bushes_X_Coordinates.add(0); Bushes_Y_Coordinates.add(17);
                Bushes_X_Coordinates.add(1); Bushes_Y_Coordinates.add(16);
                Bushes_X_Coordinates.add(1); Bushes_Y_Coordinates.add(17);
                Bushes_X_Coordinates.add(2); Bushes_Y_Coordinates.add(16);
                Bushes_X_Coordinates.add(3); Bushes_Y_Coordinates.add(16);
                Bushes_X_Coordinates.add(4); Bushes_Y_Coordinates.add(16);
                Bushes_X_Coordinates.add(5); Bushes_Y_Coordinates.add(16);
                Bushes_X_Coordinates.add(9); Bushes_Y_Coordinates.add(14);
                Bushes_X_Coordinates.add(9); Bushes_Y_Coordinates.add(16);
                Bushes_X_Coordinates.add(10);Bushes_Y_Coordinates.add(14);
                Bushes_X_Coordinates.add(10); Bushes_Y_Coordinates.add(15);
                Bushes_X_Coordinates.add(15); Bushes_Y_Coordinates.add(5);
                Bushes_X_Coordinates.add(15); Bushes_Y_Coordinates.add(6);
                Bushes_X_Coordinates.add(16); Bushes_Y_Coordinates.add(4);
                Bushes_X_Coordinates.add(16); Bushes_Y_Coordinates.add(5);
                Bushes_X_Coordinates.add(16); Bushes_Y_Coordinates.add(6);
                Bushes_X_Coordinates.add(17); Bushes_Y_Coordinates.add(4);
                Bushes_X_Coordinates.add(17); Bushes_Y_Coordinates.add(5);
        
    }

    
    // rocks Coordinates method
    public void Rocks(){
                Rocks_X_Coordinates.add(0); Rocks_Y_Coordinates.add(1);
                Rocks_X_Coordinates.add(0); Rocks_Y_Coordinates.add(2);
                Rocks_X_Coordinates.add(0); Rocks_Y_Coordinates.add(3);
                Rocks_X_Coordinates.add(0); Rocks_Y_Coordinates.add(6);
                Rocks_X_Coordinates.add(0); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(1); Rocks_Y_Coordinates.add(1);
                Rocks_X_Coordinates.add(1); Rocks_Y_Coordinates.add(2);
                Rocks_X_Coordinates.add(1); Rocks_Y_Coordinates.add(3);
                Rocks_X_Coordinates.add(1); Rocks_Y_Coordinates.add(5);
                Rocks_X_Coordinates.add(1); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(2); Rocks_Y_Coordinates.add(2);
                Rocks_X_Coordinates.add(2); Rocks_Y_Coordinates.add(3);
                Rocks_X_Coordinates.add(2); Rocks_Y_Coordinates.add(4);
                Rocks_X_Coordinates.add(2); Rocks_Y_Coordinates.add(5);
                Rocks_X_Coordinates.add(2); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(2); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(2); Rocks_Y_Coordinates.add(14);
                Rocks_X_Coordinates.add(3); Rocks_Y_Coordinates.add(1);
                Rocks_X_Coordinates.add(3); Rocks_Y_Coordinates.add(2);
                Rocks_X_Coordinates.add(3); Rocks_Y_Coordinates.add(3);
                Rocks_X_Coordinates.add(3); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(3); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(3); Rocks_Y_Coordinates.add(14);
                Rocks_X_Coordinates.add(4); Rocks_Y_Coordinates.add(2);
                Rocks_X_Coordinates.add(4); Rocks_Y_Coordinates.add(3);
                Rocks_X_Coordinates.add(4); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(4); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(4); Rocks_Y_Coordinates.add(14);////
                Rocks_X_Coordinates.add(5); Rocks_Y_Coordinates.add(2);
                Rocks_X_Coordinates.add(5); Rocks_Y_Coordinates.add(3);
                Rocks_X_Coordinates.add(5); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(5); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(5); Rocks_Y_Coordinates.add(14);
                Rocks_X_Coordinates.add(6); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(6); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(6); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(7); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(7); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(7); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(8); Rocks_Y_Coordinates.add(10);
                Rocks_X_Coordinates.add(8); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(8); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(8); Rocks_Y_Coordinates.add(13);
                Rocks_X_Coordinates.add(9); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(9); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(9); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(9); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(9); Rocks_Y_Coordinates.add(12);
                Rocks_X_Coordinates.add(12); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(12); Rocks_Y_Coordinates.add(10);
                Rocks_X_Coordinates.add(12); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(13); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(13); Rocks_Y_Coordinates.add(10);
                Rocks_X_Coordinates.add(13); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(14); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(14); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(14); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(14); Rocks_Y_Coordinates.add(10);
                Rocks_X_Coordinates.add(14); Rocks_Y_Coordinates.add(11);
                Rocks_X_Coordinates.add(15); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(15); Rocks_Y_Coordinates.add(10);
                Rocks_X_Coordinates.add(16); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(17); Rocks_Y_Coordinates.add(8);
                Rocks_X_Coordinates.add(17); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(18); Rocks_Y_Coordinates.add(7);
                Rocks_X_Coordinates.add(18); Rocks_Y_Coordinates.add(8);
                Rocks_X_Coordinates.add(18); Rocks_Y_Coordinates.add(9);
                Rocks_X_Coordinates.add(19); Rocks_Y_Coordinates.add(7);
                Rocks_X_Coordinates.add(19); Rocks_Y_Coordinates.add(8);
    }
    // water Coordinates method
    public void Water(){
                Water_X_Coordinates.add(11); Water_Y_Coordinates.add(13);
                Water_X_Coordinates.add(11); Water_Y_Coordinates.add(14);
                Water_X_Coordinates.add(11); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(11); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(12); Water_Y_Coordinates.add(14);
                Water_X_Coordinates.add(12); Water_Y_Coordinates.add(15);
                Water_X_Coordinates.add(12); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(12); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(13); Water_Y_Coordinates.add(15);
                Water_X_Coordinates.add(13); Water_Y_Coordinates.add(16);
                Water_X_Coordinates.add(13); Water_Y_Coordinates.add(17);
                Water_X_Coordinates.add(13); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(13); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(14); Water_Y_Coordinates.add(15);
                Water_X_Coordinates.add(14); Water_Y_Coordinates.add(16);
                Water_X_Coordinates.add(14); Water_Y_Coordinates.add(17);
                Water_X_Coordinates.add(14); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(14); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(15); Water_Y_Coordinates.add(16);
                Water_X_Coordinates.add(15); Water_Y_Coordinates.add(17);
                Water_X_Coordinates.add(15); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(15); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(16); Water_Y_Coordinates.add(16);
                Water_X_Coordinates.add(16); Water_Y_Coordinates.add(17);
                Water_X_Coordinates.add(16); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(16); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(17); Water_Y_Coordinates.add(15);
                Water_X_Coordinates.add(17); Water_Y_Coordinates.add(16);
                Water_X_Coordinates.add(17); Water_Y_Coordinates.add(17);
                Water_X_Coordinates.add(17); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(17); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(18); Water_Y_Coordinates.add(15);
                Water_X_Coordinates.add(18); Water_Y_Coordinates.add(16);
                Water_X_Coordinates.add(18); Water_Y_Coordinates.add(17);
                Water_X_Coordinates.add(18); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(18); Water_Y_Coordinates.add(19);
                Water_X_Coordinates.add(19); Water_Y_Coordinates.add(13);
                Water_X_Coordinates.add(19); Water_Y_Coordinates.add(14);
                Water_X_Coordinates.add(19); Water_Y_Coordinates.add(15);
                Water_X_Coordinates.add(19); Water_Y_Coordinates.add(16);
                Water_X_Coordinates.add(19); Water_Y_Coordinates.add(17);
                Water_X_Coordinates.add(19); Water_Y_Coordinates.add(18);
                Water_X_Coordinates.add(19); Water_Y_Coordinates.add(19);

    }
     // return arraylist
    public ArrayList<Integer> getTree_X_Coordinates() {
        return Tree_X_Coordinates;
    }

    public ArrayList<Integer> getTree_Y_Coordinates() {
        return Tree_Y_Coordinates;
    }

    public ArrayList<Integer> getBushes_X_Coordinates() {
        return Bushes_X_Coordinates;
    }

    public ArrayList<Integer> getBushes_Y_Coordinates() {
        return Bushes_Y_Coordinates;
    }

    public ArrayList<Integer> getRocks_X_Coordinates() {
        return Rocks_X_Coordinates;
    }

    public ArrayList<Integer> getRocks_Y_Coordinates() {
        return Rocks_Y_Coordinates;
    }

    public ArrayList<Integer> getWater_X_Coordinates() {
        return Water_X_Coordinates;
    }

    public ArrayList<Integer> getWater_Y_Coordinates() {
        return Water_Y_Coordinates;
    }
    
}
