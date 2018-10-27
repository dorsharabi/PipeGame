package Server;
//import java.io.IOException;

//import Server.Solver;

public interface Server {
	
	public void start(ClientHandler ch);
	//void runServer(Solver<?> sol) throws IOException;
	public void stop();
	

}
