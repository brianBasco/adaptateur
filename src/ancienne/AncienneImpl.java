package ancienne;

public class AncienneImpl implements Ancienne{
    @Override
    public void calcul(int a, int b) {
        System.out.println("--------------traitement Ancienne-----------");
        System.out.println("Ancienne interface retourne : " + a*b);
        System.out.println("------------fin du traitement --------------");
    }
}
