package standard;

public class StandardImpl implements Standard {

    @Override
    public void operation(int a, int b) {
        System.out.println("--------------traitement standard-----------");
        System.out.println("opération standard : " + a*b);
        System.out.println("------------fin du traitement --------------");
    }
}
