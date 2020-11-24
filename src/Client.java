import standard.Standard;

// Le client est composé de la classe Standard, dont il se sert pour faire les traitements
// En l'état, il ne peut pas se servir des anciennes interfaces
public class Client {

    private Standard standard;

    public void setStandard(Standard s) {
        this.standard = s;
    }

    public void traitement(int a, int b) {
        standard.operation(a,b);

    }
}
