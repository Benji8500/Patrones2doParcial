package memento;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		DataBase database = new DataBase();
		Backup backup = new Backup();
		
		PersonaList personaList;
		
		personaList= new PersonaList(new ArrayList<>());
		
		
		personaList.addPersonas(new Persona("Gabriel G", "34555LP", 32));
		backup.setState(personaList);
		database.addMemento("Backup Enero", backup.createBackup());
		
		personaList.addPersonas(new Persona("Erick B", "6666LP", 52));
		personaList.addPersonas(new Persona("Andres N", "7789CB", 22));
		backup.setState(personaList);
		database.addMemento("Backup Febrero", backup.createBackup());
		
		personaList.addPersonas(new Persona("Juan I", "3333LL", 12));
		backup.setState(personaList);
		database.addMemento("Backup Marzo", backup.createBackup());
		
		personaList.addPersonas(new Persona("Felipe X", "383743SC", 12));
		backup.setState(personaList);
		database.addMemento("Backup Abril", backup.createBackup());
		
		personaList.addPersonas(new Persona("Julio N", "989898SC", 22));
		backup.setState(personaList);
		database.addMemento("Backup Mayo", backup.createBackup());
		
		backup.restoreFromMemento(database.getMemento("Backup Febrero"));
		
		
		
	}

}

/* 
 Se tiene una base de datos donde se van agregando Personas (name, ci, edad),
a medida que va creciendo la base de datos se van sacando
Backups que tiene como nombre un Alias (i.e BackupMarzo, BackupMayo),
cuando ya se tiene 5 Backups se desea restaurar
el segundo backup y mostrar las personas que tenía en dicha versión
 **/
 