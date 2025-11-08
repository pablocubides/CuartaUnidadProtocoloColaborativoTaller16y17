package Mensajes;

public class SMS extends Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a " + destinatario + " con el mensaje: " + mensaje);
    }
    
}
