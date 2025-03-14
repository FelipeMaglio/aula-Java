import java.sql.SQLOutput;

public class Receita {
    String ingredientes;
    String modoDePreparo;
    String nomeReceita;
    String dificuldade;
    int porcoes;
    String autorReceita;

    public String exibirReceita() {
        return "Nome da Receita: " + nomeReceita + "\n" +
                "Autor: " + (autorReceita.isEmpty() ? "Não informado" : autorReceita) + "\n" +
                "Dificuldade: " + dificuldade + "\n" +
                "Porções: " + porcoes + "\n\n" +
                "Ingredientes:\n" + ingredientes + "\n\n" +
                "Modo de Preparo:\n" + modoDePreparo;


    }
}
