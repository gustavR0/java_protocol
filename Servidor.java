

import java.rmi.*;

public class Servidor {

    public Servidor(){
        try {
            System.setProperty(
                "java.rmi.server.codebase", 
                "25.72.27.24"
            );

            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//25.72.27.24/ObjetoRemoto", objetoRemoto);
            System.out.println("Iniciando server...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    } 

     public static void main(String[] args) {
        new Servidor();

    }
}

