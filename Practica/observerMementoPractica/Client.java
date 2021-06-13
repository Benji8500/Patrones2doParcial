package observerMementoPractica;

public class Client {
    public static void main (String []argsss ){
        Github github= new Github();
        Git git= new Git();
        
        
        Developer dev1 = new Developer("Jaime S", "Python");
        Developer dev2 = new Developer("Andres O", "Java");
        Developer dev3 = new Developer("Jaime P", "JS");
        
        git.attach(dev1);
        git.attach(dev2);
        git.attach(dev3);

        

        Codigo codigo;

        codigo = new Codigo("codigo 1",false);
        git.setState(codigo);
        github.createCommit("111111",git.createVersion());

        codigo = new Codigo("codigo 2",true);
        git.setState(codigo);
        github.createCommit("2222222",git.createVersion());

        codigo = new Codigo("codigo 3",false);
        git.setState(codigo);
        github.createCommit("3333333",git.createVersion());

        codigo = new Codigo("codigo 4",false);
        git.setState(codigo);
        github.createCommit("444444",git.createVersion());

        codigo = new Codigo("codigo 5",true);
        git.setState(codigo);
        github.createCommit("555555",git.createVersion());

        codigo = new Codigo("codigo 6",false);

        git.restoreFromMemento(github.getMemento("111111"),"Commit 111111");

        git.deattach(dev1);
        git.deattach(dev2);
        git.deattach(dev3);
        
        Developer dev4 = new Developer("Wilson S", "C++");
        Developer dev5 = new Developer("Mark V", "Swift");
        Developer dev6 = new Developer("Albert W", "JS");
        
        git.attach(dev4);
        git.attach(dev5);
        git.attach(dev6);
        
        git.restoreFromMemento(github.getMemento("555555"),"Commit 555555");

        
        


    }
}