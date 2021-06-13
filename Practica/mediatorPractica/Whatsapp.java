package mediatorPractica;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements ICanalDeComunicacion{
	
	private List<Usuario> usuariosChat= new ArrayList<>();

    public void addPersonasAlChat(Usuario persona){
        usuariosChat.add(persona);
    }


	@Override
	public void send(String message, Colleague userOrigen, int destino) {
		Usuario usuarioParseOrigin= (Usuario) userOrigen;
		 for (Usuario user:usuariosChat) {
	            if(user.getNumber()==destino && usuarioParseOrigin.getNumber()!= destino) {
	            	user.messageReceived(message, usuarioParseOrigin.getNumber());
	            }
	        }
		
	}

	@Override
	public void sendAll(String message, Colleague userOrigen) {
		Usuario usuarioParseOrigin= (Usuario) userOrigen;
		 for (Usuario user:usuariosChat) {
	            if(usuarioParseOrigin.getNumber()!= user.getNumber()) {
	            	user.messageReceived(message, usuarioParseOrigin.getNumber());
	            }
	        }		
	}

}
