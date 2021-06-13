package mediator;

public class Client {

	public static void main(String[] args) {
		Skype skype= new Skype();

        DEV dev1 = new DEV(skype);
        dev1.setLenguaje("Java");
        dev1.setName("dev1");
        dev1.setCi("111");
        
        DEV dev2 = new DEV(skype);
        dev2.setLenguaje("Python");

        
        DEV dev3 = new DEV(skype);
        dev3.setLenguaje("Javascript");
        
        
        dev2.setName("dev2");
        dev2.setCi("1112");
        dev3.setName("dev3");
        dev3.setCi("1113");
        
        QA qa1 = new QA(skype);
        QA qa2 = new QA(skype);
        QA qa3 = new QA(skype);
        
        qa1.setName("qa1");
        qa1.setCi("11133");
        qa2.setName("qa2");
        qa2.setCi("111533");
        qa3.setName("qa3");
        qa3.setCi("8889");
        
        qa1.setGrado("jefe1");
        qa2.setGrado("jefe2");
        qa3.setGrado("jefe3");

        
        
        SM sm1 = new SM(skype);
        SM sm2 = new SM(skype);
        SM sm3 = new SM(skype);
        sm1.setName("sm11");
        sm1.setCi("424124");
        sm2.setName("sm22");
        sm2.setCi("4545");
        sm3.setName("sm33");
        sm3.setCi("45454");
        sm1.setCertificaciones("AWS");
        sm2.setCertificaciones("JS");
        sm3.setCertificaciones("Angular");



        skype.addPersonasAlChat(dev1,dev1.getLenguaje());
        skype.addPersonasAlChat(dev2,dev2.getLenguaje());
        skype.addPersonasAlChat(dev3,dev3.getLenguaje());
        
        skype.addPersonasAlChat(qa1,qa1.getGrado());
        skype.addPersonasAlChat(qa2,qa2.getGrado());
        skype.addPersonasAlChat(qa3,qa3.getGrado());
        
        
        skype.addPersonasAlChat(sm1,sm1.getCertificaciones());
        skype.addPersonasAlChat(sm2,sm2.getCertificaciones());
        skype.addPersonasAlChat(sm3,sm3.getCertificaciones());
        
        



        

        dev1.send("hola como estan todos los DEVs");
        dev2.send("todo bien DEVs");

        qa2.send("hola a todos los QAs");

        sm1.send("hola a todos!! hoy acaba el sprint");

	}

}

/*

Se tiene un canal de comunicacion que se llama SKYPE, este canal de
comunicacion es empresarial donde existen QA (name,ci,grado), DEV(name, ci, lenguaje), SM (name,ci,certificaciones)
cuando un QA envia un mensaje envia a todos los QA registrados
cuando un SM envia un mensaje envia a todos los que estan registrados
esto quiere decir que se envia a QA / DEV / SM
cuando un DEV envia un mensage envia a todos los DEV

-nota asegurarse que la persona que envia el mensage no reciba
su propio mensaje

- se debe utilizar Map

agregar minimamente 3 DEV, 3 QA y 3 SM al chat
*/