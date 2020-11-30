import java.io.IOException;
import java.net.Socket;

public class RemotePortScanner {

	public static void main(String[] args) throws IOException {
		int port = 5899;
		while (port <= 5904) {
			try {
				Socket socket = new Socket("kosmidas.mooo.com", port);
				System.out.println("I porta " + port + " einai anoixti");
				port++;
				socket.close();

			} catch (IOException e) {
				System.out.println("I porta " + port + " einai kleisti");
				port++;
			}
		}
	}
}
