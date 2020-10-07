package problems;

import org.kohsuke.args4j.Option;


public class LatinSquare extends AbstractProblem {

    @Option(name = "-n", usage = "Latin square size.", required = false)
    int m = 20;
    


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
        new LatinSquare().execute(args);
    }
}
