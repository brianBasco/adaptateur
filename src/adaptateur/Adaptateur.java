package adaptateur;

import ancienne.Ancienne;
import ancienne.AncienneImpl;
import standard.Standard;

// la classe adaptateur permet d'utiliser les opérations de Standard
// grâce au composant ancienne
// C'est Ancienne qui sera exécutée sous le capot
// Ainsi, Standard est "remplacé" adapaté pour Ancienne.
public class Adaptateur implements Standard {

    private Ancienne ancienneImpl;

   public Adaptateur() {
       this.ancienneImpl = new AncienneImpl();
   }

    @Override
    public void operation(int a, int b) {
        ancienneImpl.calcul(a,b);
    }
}
