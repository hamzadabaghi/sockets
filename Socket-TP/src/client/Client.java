package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("je me connecte au serveur");
		
		Socket socket = new Socket("localhost",1234);
		
		InputStream is = socket.getInputStream();
		
		OutputStream os = socket.getOutputStream();
		
		
		System.out.println("communication : saisir un nombre");
		
		Scanner scanner = new Scanner(System.in);
		
		int nb = scanner.nextInt();
		
		System.out.println("je envoie le nombre " + nb +" au serveur");
		
		os.write(nb);
		
		int reponse = is.read();
		
		System.out.println("la reponse recu est : "+reponse);
		
		
		
		
	}

}
