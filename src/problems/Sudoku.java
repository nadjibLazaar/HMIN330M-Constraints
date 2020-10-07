
package problems;

import problems.AbstractProblem;
import org.chocosolver.solver.variables.IntVar;
import org.kohsuke.args4j.Option;



public class Sudoku extends AbstractProblem {

    @Option(name = "-g", aliases = "--grid", usage = "Sudoku grid ID.", required = false)
    Data data = Data.level1;

    private final int n = 9;
    IntVar[][] rows, cols, carres;



    @Override
    public void buildModel() {
    	
    	// Build Model here. 
    }

    @Override
    public void configureSearch() {
    	
    	// Set search here
    }

    @Override
    public void solve() {
  
    	// Set objective if needed;
    	// Solve the instance
    	// Print the solution
        
    }

    public static void main(String[] args) {
        new Sudoku().execute(args);
    }

    /////////////////////////////////// DATA //////////////////////////////////////////////////
    enum Data {
        level1(
                new int[][]{
                        {0, 0, 0, 2, 0, 0, 0, 0, 0},
                        {0, 8, 0, 0, 3, 0, 0, 7, 0},
                        {3, 0, 0, 5, 0, 4, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 2, 8},
                        {8, 3, 0, 0, 1, 0, 0, 0, 0},
                        {0, 4, 0, 7, 2, 0, 3, 5, 1},
                        {0, 7, 0, 0, 5, 6, 0, 0, 4},
                        {0, 0, 3, 0, 0, 0, 0, 0, 0},
                        {2, 0, 5, 4, 0, 1, 6, 0, 3}
                }
        ),
        level2(
                new int[][]{
                        {3, 0, 4, 0, 2, 0, 0, 7, 0},
                        {1, 5, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, 1, 0, 8, 3},
                        {0, 0, 0, 0, 0, 6, 1, 0, 0},
                        {2, 0, 5, 0, 3, 0, 0, 0, 8},
                        {7, 0, 0, 1, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 6, 0, 0},
                        {5, 6, 0, 0, 0, 7, 0, 0, 0},
                        {0, 0, 0, 8, 0, 0, 0, 1, 4}
                }
        ),
        level3(
                new int[][]{
                        {0, 1, 0, 0, 0, 0, 0, 0, 0},
                        {8, 0, 0, 0, 0, 2, 1, 7, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0, 0},
                        {0, 2, 0, 0, 0, 6, 0, 1, 3},
                        {0, 5, 3, 0, 7, 0, 6, 0, 2},
                        {1, 0, 0, 8, 0, 0, 5, 4, 0},
                        {0, 0, 0, 3, 1, 5, 0, 2, 6},
                        {0, 4, 0, 2, 0, 0, 0, 0, 7},
                        {0, 0, 0, 4, 8, 0, 3, 0, 0}
                }
        ),
        level4(
                new int[][]{
                        {0, 4, 0, 8, 0, 0, 0, 0, 0},
                        {0, 1, 0, 7, 2, 0, 5, 0, 4},
                        {8, 0, 0, 4, 0, 0, 0, 0, 0},
                        {1, 0, 5, 3, 0, 0, 4, 2, 0},
                        {0, 3, 0, 0, 0, 0, 0, 0, 0},
                        {4, 0, 0, 0, 5, 0, 7, 0, 1},
                        {6, 0, 0, 0, 0, 0, 1, 7, 0},
                        {0, 0, 0, 2, 1, 0, 8, 6, 0},
                        {2, 0, 0, 0, 3, 7, 0, 0, 0}
                }
        ),
        level5(
                new int[][]{
                        {0, 0, 0, 2, 0, 0, 0, 1, 5},
                        {3, 0, 0, 0, 0, 0, 7, 8, 0},
                        {0, 0, 0, 7, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 5, 7},
                        {7, 2, 0, 0, 4, 0, 0, 0, 0},
                        {8, 6, 0, 1, 0, 3, 0, 4, 0},
                        {4, 0, 0, 0, 1, 0, 0, 0, 0},
                        {2, 1, 0, 0, 0, 7, 8, 3, 0},
                        {0, 5, 0, 3, 0, 0, 0, 0, 0}
                }
        ),
        level6(
                new int[][]{
                        {0, 0, 0, 1, 0, 5, 4, 0, 0},
                        {0, 6, 0, 2, 0, 8, 0, 0, 7},
                        {0, 5, 2, 0, 0, 0, 1, 0, 0},
                        {0, 1, 5, 6, 0, 2, 0, 0, 0},
                        {2, 0, 0, 0, 0, 7, 5, 1, 0},
                        {0, 7, 8, 4, 0, 0, 0, 3, 2},
                        {0, 0, 3, 0, 1, 4, 7, 0, 6},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {6, 0, 0, 5, 0, 0, 0, 8, 0}
                }
        ),;
        final int[][] grid;

        Data(int[][] grid) {
            this.grid = grid;
        }

        int grid(int i, int j) {
            return grid[i][j];
        }
    }
}
