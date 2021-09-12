package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		
		/* Creation de l'objet server socket avec numero du port : 1234 */
		
		ServerSocket ss = new ServerSocket(1234);
		
		System.out.println("je attend la connexion , envoie seluement max un octet");
		
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		
		OutputStream os = s.getOutputStream();
		
		System.out.println("je attend le client me envoie un octet");
		
		int octectReçu = is.read();
		
		System.out.println("j ai reçu un octet " + octectReçu);
		
		int reponse = octectReçu*5;
		
		System.out.println("je envoie la reponse " + reponse);
		
		os.write(reponse);
		
		System.out.println("fin de connection");
		
		s.close();
		
		
	}

}
