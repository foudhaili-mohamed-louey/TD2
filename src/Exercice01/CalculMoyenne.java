package Exercice01;

public class CalculMoyenne {

    public static void main(String[] args) {
        int nb = 5;  // Number of students
        float[] noteCtrl = new float[nb];
        float[] noteExamen = new float[nb];

        System.out.println("Remplir noteExamen :");
        TAB.remplir(noteExamen);

        System.out.println("\nRemplir noteCtrl :");
        TAB.remplir(noteCtrl);

        System.out.println("\nAfficher noteExamen :");
        TAB.lire(noteExamen);

        System.out.println("\nAfficher noteCtrl :");
        TAB.lire(noteCtrl);

        float[] moyenne_elv = new float[nb];
        for (int i = 0; i < nb; i++) {
            moyenne_elv[i] = noteCtrl[i] + 2 * noteExamen[i];
        }

        System.out.println("\nAfficher moyenne_elv :");
        TAB.lire(moyenne_elv);

        float moyenne_classe = TAB.somme_element(moyenne_elv) / nb;
        System.out.println("\nAfficher moyenne_classe : " + moyenne_classe);

        float[] moyenne_bonus = TAB.additionner(1.5f, moyenne_elv);

        System.out.println("\nAfficher moyenne_bonus :");
        TAB.lire(moyenne_bonus);
    }
}
