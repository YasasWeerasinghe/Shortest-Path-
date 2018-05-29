import java.awt.Color;
import java.util.*;

/**
  * @author Yasas Weerasingh
 *  
 *  
 */
public class PathFinding {

    // create a object of the Coordinates java class
   static Coordinates objCor = new Coordinates();
   //grid size
   static boolean[][] Grid = new boolean[20][20]; // main array list
      
   
    private static List<Cell> neighbours(Cell index, Cell[][] grid) {  // neighbours cell method
        List<Cell> neighbours = new ArrayList(); //create a new neighbour arrayList
        int size = grid.length;
                                // used to go  vertical and horizontal way in the grid
        if ((index.x - 1) >= 0 && grid[index.x - 1][index.y].blocked == true) {
            neighbours.add(grid[index.x - 1][index.y]);
        }
        if ((index.x + 1) < size && grid[index.x + 1][index.y].blocked == true) {
            neighbours.add(grid[index.x + 1][index.y]);
        }
        if ((index.y - 1) >= 0 && grid[index.x][index.y - 1].blocked == true) {
            neighbours.add(grid[index.x][index.y - 1]);
        }
        if ((index.y + 1) < size && grid[index.x][index.y + 1].blocked == true) {
            neighbours.add(grid[index.x][index.y + 1]);
        }
                     // used to go Diagonal way in the grid
        if((index.x - 1)>=0 && (index.y - 1)>=0 && grid[index.x - 1][index.y - 1].blocked==true){
            neighbours.add(grid[index.x - 1][index.y - 1]);
        }
        
        if((index.x - 1)>=0 && (index.y + 1)<size && grid[index.x - 1][index.y + 1].blocked==true){
            neighbours.add(grid[index.x - 1][index.y + 1]);
        }
        
        if((index.x + 1)<size && (index.y - 1)>=0 && grid[index.x + 1][index.y - 1].blocked==true){
            neighbours.add(grid[index.x + 1][index.y - 1]);
        }
        
        if((index.x + 1)<size && (index.y + 1)<size && grid[index.x + 1][index.y + 1].blocked==true){
            neighbours.add(grid[index.x + 1][index.y + 1]);
        }

        return neighbours;
    }
        // grid show method
    public static void showGrid(boolean[][] grid, boolean cell) {
        int size = grid.length;
        StdDraw.setXscale(-1, size);
        StdDraw.setYscale(-1, size);
               for (int x = 0; x < size; x++) {  // x axis loop x0 , x1
            for (int y = 0; y < size; y++) { // y axis loop y19 , y19
                if (grid[x][y] == cell) { // if x and y corfinates are true draw the squares 
                    StdDraw.square(y, size - x - 1, .5);
                } else { // if false fill the squares according to the cordinates
                    StdDraw.filledSquare(y, size - x - 1, .5);
                }
            }
        }
                 // override the corrdinates to color the seperatly 
                 // add corrdination here coze when the programm start it has to show the obstacles 
           // warter coordinations with the colors
        for(int x =0; x<objCor.getWater_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.blue);
            StdDraw.filledSquare(objCor.getWater_X_Coordinates().get(x), size - objCor.getWater_Y_Coordinates().get(x)-1, .5);
        }
                // tree coordinations with the colors
        for(int x =0; x<objCor.getTree_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.green);
            StdDraw.filledSquare(objCor.getTree_X_Coordinates().get(x), size - objCor.getTree_Y_Coordinates().get(x)-1, .5);
        }
        // bushes coordinations with the colors
        for(int x =0; x<objCor.getBushes_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.lightGray);
            StdDraw.filledSquare(objCor.getBushes_X_Coordinates().get(x), size - objCor.getBushes_Y_Coordinates().get(x)-1, .5);
        }
            // rockes coordinations with the colors
        for(int x =0; x<objCor.getRocks_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.darkGray);
            StdDraw.filledSquare(objCor.getRocks_X_Coordinates().get(x), size - objCor.getRocks_Y_Coordinates().get(x)-1, .5);
        }
        
    }

        // show method used to draw the start and end point circle and coordinates
    public static void show(boolean[][] grid, boolean which, int x_Start, int y_Start, int x_End, int y_End) {
        int size = grid.length;
        StdDraw.setXscale(-1, size); // set the  minimum value of the x-scale
        StdDraw.setYscale(-1, size); // set the  minimum value of the y-scale
                for (int x = 0; x < size; x++) {    // x axis loop
            for (int y = 0; y < size; y++) {    // y axis loop
                if (grid[x][y] == which) {     // if x and y corfinates are true draw the squares
                    if ((x == x_Start && y == y_Start) || (x == x_End && y == y_End)) {
                        StdDraw.circle(y, size - x - 1, .5); // draw the circle
                       
                    } else {
                        StdDraw.square(y, size - x - 1, .5); // else draw the squares
                    }
                } else {
                    StdDraw.filledSquare(y, size - x - 1, .5); // fill the squares with the coordinations
                }
            }
        }      // again override the existing coordinates
                // here add the corrdinates to determine obstacles when the path draw
                // set warter coordinates to the grid
        for(int x =0; x<objCor.getWater_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.blue); // set color
            StdDraw.filledSquare(objCor.getWater_X_Coordinates().get(x), size - objCor.getWater_Y_Coordinates().get(x)-1, .5);
        }
           // set warter coordinates to the grid
        for(int x =0; x<objCor.getTree_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.green); // set color
            StdDraw.filledSquare(objCor.getTree_X_Coordinates().get(x), size - objCor.getTree_Y_Coordinates().get(x)-1, .5);
        }
        // set warter coordinates to the grid
        for(int x =0; x<objCor.getBushes_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.lightGray); // set color
            StdDraw.filledSquare(objCor.getBushes_X_Coordinates().get(x), size - objCor.getBushes_Y_Coordinates().get(x)-1, .5);
        }
          // set warter coordinates to the grid
        for(int x =0; x<objCor.getRocks_X_Coordinates().size();x++){
            StdDraw.setPenColor(Color.darkGray); // set color
            StdDraw.filledSquare(objCor.getRocks_X_Coordinates().get(x), size - objCor.getRocks_Y_Coordinates().get(x)-1, .5);
        }
    }

    //astar for finding the shortest path 
    private static void aStar(Cell[][] grid, int x_Start, int y_Start, int x_End, int y_End) {
    	Stopwatch timerFlow = new Stopwatch(); // create a new obj of the stopwatch
        int size = grid.length;
        Queue<Cell> openList = new PriorityQueue<>(new Comparator<Cell>() { // PriorityQueue is specified initial capacity that
                                                                  // orders its elements according to the specified comparator. 
            // and it used to give x and y start values
            @Override
            public int compare(Cell o1, Cell o2) {
                return o1.getFCost() < o2.getFCost() ? -1 : o1.getFCost() > o2.getFCost() ? 1 : 0;  
            }
        });
        List<Cell> closedList = new LinkedList<Cell>();  
        openList.add(grid[x_Start][y_Start]); // add x and y start values to the openList(PriorityQueue)

        while (!openList.isEmpty()) {
            Cell index = openList.poll();
            if (index.x == x_End && index.y == y_End) {
                break;
            }
            List<Cell> neighbours = neighbours(index, grid);
            for (Cell neighbour : neighbours) {
                if (!closedList.contains(neighbour)) {
                    if (!openList.contains(neighbour)) {
                        neighbour.gcost = index.gcost + 1;
                        neighbour.parent = index;
                        openList.add(neighbour);
                    } else {
                        int gCost = index.gcost + 1;
                        if (neighbour.gcost > gCost) {
                            neighbour.gcost = gCost;
                            neighbour.parent = index;
                        }

                    }

                }
            }
            closedList.add(index);
            
        }

        if (grid[x_End][y_End].parent != null) {
            Cell cell = grid[x_End][y_End].parent;
            StdDraw.setPenColor(Color.RED); // path color
            while (cell.parent != null) {
                StdDraw.filledSquare(cell.y, size - cell.x - 1, .5);
                cell = cell.parent;
            }
        }
        
        StdOut.println("Elapsed time = " + timerFlow.elapsedTime()); // show the Elapsed time
        System.out.printf("%3d Cost "+"\n",grid[x_End][y_End].gcost);	// show the cost
        
    }
       
      // use to calculate the cost of heuristic 
    private static Cell[][] createCell(boolean[][] randomlyGenGrid, int x_Start, int y_Start,int x_End, int y_End, String heuristic) {
        int size = randomlyGenGrid.length;
        Cell[][] grid = new Cell[size][size];
        for (int x = 0; x < size; x++) {        // x axis loop
            for (int y = 0; y < size; y++) {    // y axis loop
                Cell cell = new Cell(); // create a new obj in Cell class
                cell.x = x; // get the int x vakue from the cell calss and insilize it to the x coordination loop
                cell.y = y; // get the int y vakue from the cell calss and insilize it to the y coordination loop
                if(heuristic.equalsIgnoreCase("M")){ // if M or m
                cell.hcost = Math.abs(x - x_End) + Math.abs(y - y_End); // calculate the cost
                }
                else if(heuristic.equalsIgnoreCase("E")){ // if E or e
                cell.hcost= (int)Math.pow((int) Math.pow(x-x_End,2)+(int)Math.pow(y - y_End,2),1/2);    // calculate the cost
                }
                else if(heuristic.equalsIgnoreCase("C")){ // if C or c
                cell.hcost=Math.max(Math.abs(x - x_End),Math.abs(y - y_End));   // calculate the cost
                }else{
                    // heuristic measuring distances
                System.err.println("Wrong Input : Slect the Algorithm method ");
                    System.out.println(" ");
                System.out.println("Manhatten, Enter M ");
                System.out.println("Euclidean, Enter E ");
                System.out.println("Chebyshev, Enter C ");
                Scanner sc = new Scanner(System.in);
                heuristic = sc.nextLine();
                
            }
                
                
                cell.blocked = randomlyGenGrid[x][y];
                grid[x][y] = cell;
            }
        }
        return grid;

    }
      
    // main method
    public static void main(String[] args) {       
                
        for (int x = 0; x < 20; x++) { // x side grid value
            for (int y = 0; y < 20; y++) { // y side grid value
                Grid[x][y]=true; // x side and y side values are true      x0 y0,,,, x0 y1,,,, x0 y19
                //x1 y0,,, x1 y1
            }
        }
           // set coordinates to the grid
           // set tree coordinates to the grid
        for(int x =0; x<objCor.Tree_X_Coordinates.size();x++){
            Grid[objCor.getTree_Y_Coordinates().get(x)][objCor.getTree_X_Coordinates().get(x)]=false;
        }
           // set bushes coordinates to tthe grid
        for(int x = 0; x<objCor.Bushes_X_Coordinates.size();x++){
            Grid[objCor.getBushes_Y_Coordinates().get(x)][objCor.getBushes_X_Coordinates().get(x)] =false;
   
             }
            // set rocks coordinates to tthe grid
         for(int x = 0; x<objCor.Rocks_X_Coordinates.size();x++){
            Grid[objCor.getRocks_Y_Coordinates().get(x)][objCor.getRocks_X_Coordinates().get(x)] =false;
        }
              // set water coordinates to tthe grid
          for(int x = 0; x<objCor.Water_X_Coordinates.size();x++){
            Grid[objCor.getWater_Y_Coordinates().get(x)][objCor.getWater_X_Coordinates().get(x)] =false;
        }
        
             showGrid(Grid, true); // show the grid // call the Main grid and cell boolean is true
try{
  
    Scanner in = new Scanner(System.in);
    Scanner in2 =new Scanner(System.in);

             // input  coordinates 
        System.out.println("Enter the Start point x coordinates:  ");
        int x_Start = in.nextInt(); //read the input

        System.out.println("Enter the Start point y coordinates:");
       int y_Start = in.nextInt();      //read the input
        
       
       if(validateInputs(x_Start,y_Start)){ // invalide input error msg
           System.err.println("**  ERROR  **  Inputs are incorrect. Please enter values from 0 to 19");
           System.out.println("\n====================================================================================\n\n");
       }
            // coordinates input
        System.out.println("Enter the End point x coordinates: ");
        int x_End = in.nextInt();  //read the input

        System.out.println("Enter the End point y coordinates: ");
        int y_End = in.nextInt();  //read the input
       
      if(validateInputs(x_End,y_End)){ // invalide input error msg
           System.err.println("**  ERROR  **  Inputs are incorrect. Please enter values from 0 to 19");
           System.out.println("\n====================================================================================\n\n");
       }
       
            // select the heuristic method
        System.out.println("Slect the heuristic method ");
        System.out.println("Manhatten, Enter M ");
        System.out.println("Euclidean, Enter E ");
        System.out.println("Chebyshev, Enter C ");
        String readInput = in2.next();  //read the input
               
        show(Grid, true, x_Start, y_Start, x_End, y_End); // show the grid
       
        Cell[][] grid = createCell(Grid, x_Start, y_Start, x_End, y_End,readInput); //calculate the cost
               aStar(grid, x_Start, y_Start, x_End, y_End);

    }catch(Exception e){
    
    System.err.println("Some thing went wrong"); // error msg   
    //System.exit(0);
   
            }
}
    
    // x y input validation method
    public static boolean validateInputs(int x, int y){
        
        boolean tf = false;
        if(x<0 || x>19 || y<0 || y>19){ // x and y input range
            tf =true;
        }
        return tf;
    }

    }

