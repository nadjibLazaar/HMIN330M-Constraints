package problems;

import org.kohsuke.args4j.Option;


public class GolombRuler extends AbstractProblem {

    @Option(name = "-m", usage = "Golomb ruler order.", required = false)
    private int m = 10;

    

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
        new GolombRuler().execute(args);
    }
}
