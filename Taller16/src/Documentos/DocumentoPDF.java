package Documentos;

public class DocumentoPDF extends Documento{
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento a PDF con contenido: " + contenido);
    }
}
