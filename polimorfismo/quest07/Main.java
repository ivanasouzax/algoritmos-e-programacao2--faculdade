import java.util.ArrayList;

abstract class Documento{
    abstract void imprimir();
 }

 class Relatorio extends Documento{
    @Override
    public void imprimir(){
        System.out.println("Imprimindo documento");
    }
 }

 class Carta extends Documento{
    @Override
    public void imprimir(){
        System.out.println("Imprimindo carta");
    }
 }

class Contrato extends Documento{
 @Override
    public void imprimir(){
        System.out.println("Imprimindo o contrato");
    }
}
public class Main{
    public static void main(String[] args) {
        ArrayList<Documento> documentos = new ArrayList<>();
        documentos.add(new Relatorio());
        documentos.add(new Carta());
        documentos.add(new Contrato());

        for (Documento documento : documentos){
            documento.imprimir();
        }
    }
}
