package tp3_ex3.mon.projet;
import tp3_ex3.mon.projet.Etudiant;
import tp3_ex3.mon.projet.Filiere;
import java.util.Date;
import java.text.SimpleDateFormat;
public class classes {


    public static void main(String[] args) {
        Filiere[] filieres = new Filiere[3];
        filieres[0] = new Filiere(0,"INFO ", "Informatique");
        filieres[1] = new Filiere("TIC", "Techno de l'info et de communication");
        filieres[2] = new Filiere("GC", "Génie civil");

        System.out.println("La liste des filières de notre école :");
        for (Filiere f : filieres)
            System.out.println(f);

        Etudiant etudiants[] = new Etudiant[5];
        etudiants[0] = new Etudiant("Rashid", "Mohamed", new Date("1995/01/02"), filieres[0]);
        etudiants[1] = new Etudiant("Yves", "Chakib", new Date("1992/04/02"), filieres[0]);
        etudiants[2] = new Etudiant("Safi", "Meriem", new Date("2000/11/02"), filieres[2]);
        etudiants[3] = new Etudiant("Rami", "Mouad", new Date("2013/01/02"), filieres[2]);
        etudiants[4] = new Etudiant("Alaoui", "Manal", new Date("2011/03/02"), filieres[1]);

        System.out.println("Liste des étudiants par filière :");
        for (Filiere f : filieres) {
            System.out.println(f);
            for (Etudiant e : etudiants) {
                if (e.getFilière().getId() == f.getId()) {
                    System.out.println("\t\t" + e);
                }
            }
        }
    }
}

