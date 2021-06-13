package mediatorPractica;

public class Client {

	public static void main(String[] args) {
		Whatsapp wap = new Whatsapp();
		
		Usuario user1 = new Usuario(wap);
		Usuario user2 = new Usuario(wap);
		Usuario user3 = new Usuario(wap);
		Usuario user4 = new Usuario(wap);
		Usuario user5 = new Usuario(wap);
		Usuario user6 = new Usuario(wap);
		Usuario user7 = new Usuario(wap);
		Usuario user8 = new Usuario(wap);
		Usuario user9 = new Usuario(wap);
		Usuario user10 = new Usuario(wap);
		
		user1.setName("Erick A");
		user1.setNumber(72088822);
		user2.setName("Juan B");
		user2.setNumber(6668303);
		user3.setName("Mica C");
		user3.setNumber(3163643);
		user4.setName("Benji D");
		user4.setNumber(7676545);
		user5.setName("Enrique E");
		user5.setNumber(6545684);
		user6.setName("Michelle F");
		user6.setNumber(7658658);
		user7.setName("Jonny G");
		user7.setNumber(6654335);
		user8.setName("Thom H");
		user8.setNumber(7574357);
		user9.setName("Michael I");
		user9.setNumber(8888358);
		user10.setName("Mark J");
		user10.setNumber(35835358);
		
		
		wap.addPersonasAlChat(user1);
		wap.addPersonasAlChat(user2);
		wap.addPersonasAlChat(user3);
		wap.addPersonasAlChat(user4);
		wap.addPersonasAlChat(user5);
		wap.addPersonasAlChat(user6);
		wap.addPersonasAlChat(user7);
		wap.addPersonasAlChat(user8);
		wap.addPersonasAlChat(user9);
		wap.addPersonasAlChat(user10);

		
		user1.send("Hola como estas", 6668303);
		user10.sendToAll("Saludos Amigos!");


	}

}

/*
(Mediator) Se tiene un canal de comunicación Whatapp donde las personas
 pueden enviar mensajes a personas especificas (comunicacion 1 a 1 ) y 
 tambien se pueden enviar mensajes a un grupo de personas, 
 agregar 10 personas (usuarios) hacer la comunicación del usuario 1 al usuario 2 
 directamente, y el usuario 10 que envie un mensaje a los otros usuarios

 * */
