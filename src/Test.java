import adaptateur.Adaptateur;
import standard.StandardImpl;

public class Test {

    public static void main(String[] args) {

        Client client = new Client();

        // client composé du standard
        client.setStandard(new StandardImpl());
        client.traitement(4,5);

        // cette fois, on aimerait utiliser un autre type de standard
        // grâce à l'adaptateur, on va passer au client un autre type de standard
        // l'ancienne implémentation par exemple, dont le client ne peut pas se servir en l'état
        // Adaptateur implémente Standard, donc Client peut s'en servir
        client.setStandard(new Adaptateur());
        client.traitement(4,5);

    }
}
