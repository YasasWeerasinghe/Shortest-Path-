/**
  * @author Yasas Weerasingh
 *  
 *  
 */
public class Cell {
    boolean blocked;
    int gcost;
    int hcost ;
    int x ;
    int y;
    Cell parent;
    
    public int getFCost(){
        return hcost+gcost;
    }
    
}
