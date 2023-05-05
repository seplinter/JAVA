package tp3_ex3.mon.projet;
import tp3_ex3.mon.projet.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Etudiant {

    private final Filiere filiere;
    private int id;
private String nom;
private String prenom;
private Date dateNaissance;
    //private static int count;

public Etudiant(int id,String nom,String prenom,Date dateNaissance,Filiere filiere)
{
    this.id=id;
    this.nom=nom;
    this.prenom=prenom;
    this.dateNaissance=dateNaissance;
    this.filiere=filiere;
}
public Filiere getFiliere()
{
    return filiere;
}

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return "Je suis l'étudiant " + this.nom + " " + this.prenom
                + " ma date de naissance est : "
                + sdf.format(this.dateNaissance);
    }
}
