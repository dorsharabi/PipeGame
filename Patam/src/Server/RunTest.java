package Server;

public class RunTest {
	
    public static void main(String[] args) {
    	System.out.println("**** Server Side ****");

//        Server s = new MyServer(Integer.parseInt(args[0]));//Take the port from the args
       
        try {
            Server s = new MyServer(6404);//Take the port from the args

        	s.start(new MyCHandler());
        	System.in.read();
            s.stop();
            System.out.println("Closed server");
        }catch(Exception e) {e.printStackTrace();}
    }
}
