package mediator;

import java.util.HashMap;

public class Skype implements ICanalDeComunicacion{
	
	HashMap<Persona, String> Colegas = new HashMap<Persona, String>();
	

    public void addPersonasAlChat(Persona col, String posicion){
    	Colegas.put(col,posicion);
    }

    @Override
    public void send(String message, Colleague personaOrigen) {
    	 Persona personaParseOrigen= (Persona) personaOrigen;
         for (Persona persona:Colegas.keySet()) {
             if ( !personaParseOrigen.getCi().equals(persona.getCi())){
                  if (personaOrigen instanceof SM){
                      persona.messageReceived(message);
                  }
                  if (personaOrigen instanceof QA && persona instanceof QA){
                      persona.messageReceived(message);
                  }
                 if (personaOrigen instanceof DEV && persona instanceof DEV){
                     persona.messageReceived(message);
                 }
            }
        }
    }

}
