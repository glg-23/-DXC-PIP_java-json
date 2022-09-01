package jsonParsing.json;

//utilizzato solo per versione 2

public class RicettaBean {

    private int id;
    private String categoria;
    private String nome;
    private String ingredienti;
    private String colore;

    public RicettaBean() {
    }

    public RicettaBean(int id, String categoria, String nome, String ingredienti, String colore) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.colore = colore;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

}
