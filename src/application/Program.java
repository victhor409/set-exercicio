package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entites.LogEntry;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner sc =  new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//instacia do SET
			//hashset é mais rapido e para as entradas de logs não interessa a ordem
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				//logica para ler uma linha do arquivo de log 
				String[]fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				//se tentar inserir o logentry com o mesmo nome vai da erro
				set.add(new LogEntry(username, moment));
				
				line = br.readLine();
				
			}
			
			System.out.print("Total users: "+ set.size());
			
			
		}
		catch(IOException e ) {
			System.out.println("Error: "+ e.getMessage());
		} 
		sc.close();

	}

}
