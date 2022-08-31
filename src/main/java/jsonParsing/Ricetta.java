package jsonParsing;

import org.json.simple.JSONAware;

public class Ricetta implements JSONAware {

    private int numElemento;
    private String categoria;
    private String nome;
    private String ingredienti;
    private String colore;

    public Ricetta(int numElemento, String categoria, String nome, String ingredienti, String colore) {
        this.numElemento = numElemento;
        this.categoria = categoria;
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.colore = colore;
    }

    @Override
    public String toJSONString() {
        return String.format("{\"numElemento\":%d," +
                        "\"categoria\":\"%s\"," +
                        "\"nome\":\"%s\"," +
                        "\"ingredienti\":\"%s\"," +
                        "\"colore\":\"%s\"}",
                numElemento, categoria, nome, ingredienti, colore);
    }

}
