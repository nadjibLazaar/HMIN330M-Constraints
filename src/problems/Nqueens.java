package problems;

import org.kohsuke.args4j.Option;


public class Nqueens extends AbstractProblem {

    @Option(name = "-n", usage = "number of queens.", required = false)
    int m = 8;
    


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
        new Nqueens().execute(args);
    }
}
