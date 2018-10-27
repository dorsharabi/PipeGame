package test;

import java.util.ArrayList;
import java.util.List;

import SearchAlgo.BFS;
import SearchAlgo.MyState;
import SearchAlgo.Searcher;
import SearchAlgo.State;
import Server.CacheManager;
import Server.ClientHandler;
import Server.File;
import Server.MyCHandler;
import Server.MyServer;
import Server.PipeGameSolver;
import Server.Server;
import Server.Solver;

// edit these imports according to your project


public class TestSetter {
	
	public static void setClasses(DesignTest dt){
		
		// set the server's Interface, e.g., "Server.class"
		// don't forget to import the correct package e.g., "import server.Server"
		dt.setServerInteface(Server.class);
		// now fill in the other types according to their names
		// server's implementation
		dt.setServerClass(MyServer.class);
		// client handler interface
		dt.setClientHandlerInterface(ClientHandler.class);
		// client handler class
		dt.setClientHandlerClass(MyCHandler.class);
		// cache manager interface
		dt.setCacheManagerInterface(CacheManager.class);
		// cache manager class
		dt.setCacheManagerClass(File.class);
		// solver interface
		dt.setSolverInterface(Solver.class);
		// solver class
		dt.setSolverClass(PipeGameSolver.class);
		// searchable interface
		dt.setSearchableInterface(State.class);
		// searcher interface
		dt.setSearcherInterface(Searcher.class);
		// your searchable pipe game class
		dt.setPipeGameClass(MyState.class);
		// your Best First Search implementation
		dt.setBestFSClass(BFS.class);
	}
	
	// run your server here
	static Server s;
	public static void runServer(int port){
		s=new MyServer(port);
		s.start(new MyCHandler());
	}
	// stop your server here
	public static void stopServer(){
		s.stop();
	}
	
	/* ------------- Best First Search Test --------------
	 * You are given a Maze
	 * Create a new Searchable from the Maze
	 * Solve the Maze
	 * and return a list of moves from {UP,DOWN,RIGHT,LEFT}
	 *  
	 */
	
	public static List<String> solveMaze(Maze m){
		
		return null;
	}

}
