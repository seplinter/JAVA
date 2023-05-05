package tp3_ex3.mon.projet;

public class Filiere {
    //private static int count;
private int id;
private String code;
private String libelle;

public Filiere (int id,String code,String libelle)
{
    this.id=id;
    this.code=code;
    this.libelle=libelle;
}

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String toString()
    {
        return "\t Filiere : "+ this.libelle;
    }
}
