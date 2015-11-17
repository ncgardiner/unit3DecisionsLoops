import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 10 rows and 10 columns
    private final int ROWS = 30;
    private final int COLS = 30;
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 1, Y1 = 0;
        final int X2 = 2, Y2 = 1;
        final int X3 = 0, Y3 = 2;
        final int X4 = 1, Y4 = 2;
        final int X5 = 2, Y5 = 2;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock5);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        ArrayList<Location> survivors = new ArrayList<Location>();
        ArrayList<Actor> neighbors = new ArrayList<Actor>();
        ArrayList<Location> currentlyAlive = new ArrayList<Location>();
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        for (int row=0;row<ROWS;row++)//Cycle through the rows 1 by 1
        {
            for (int col=0;col<COLS;col++)//Cycle through the columns 1 by 1
            {
                Location loc = new Location(row,col);
                Actor cell = grid.get(loc);
                neighbors = grid.getNeighbors(loc);
                if (cell== null && neighbors.size()==3)
                    // decide if an empty cell should come to life
                    survivors.add(loc);
                else if (cell!=null)
                {
                    //decide if a live cell should stay alive or die
                    currentlyAlive.add(loc);
                    if (neighbors.size()==2||neighbors.size()==3)
                        survivors.add(loc);
                }
            }
        }
        for (Location die : currentlyAlive)
            //kill every live cell
            grid.remove(die);
        for (Location newloc : survivors)
        {
            //recreate all cells that should be alive in the new generation
            Rock newrock= new Rock();
            grid.put(newloc,newrock);
        }
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        //Lets the user know how to enter a custom pattern, and how to start the program
        System.out.print("If you want to enter a custom pattern, click a cell and use the\nbuttons to create a different beginning pattern.\nEnter anything here after you press [Run] in order to begin: ");
        Scanner scan = new Scanner(System.in);
        String block = scan.next();//This is only necessary to avoid a problem with Gridworld that starts the program automatically without updating unless you press [Run]
        for (int i=0; i<100; i++)
        {
            //Updates the grid by generation and adds a pause to space things out
            game.createNextGeneration();
            Thread.sleep(500);
        }
    }
}
