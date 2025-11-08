package Documentos;
public class DocumentoWord extends Documento {

    @Override
    public void exportar(String contenido){
        System.out.println("Exportando documento a Word"+ contenido);
    }
}