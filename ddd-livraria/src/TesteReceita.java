public class TesteReceita {
    public static void main (String[] args) {
        Receita minhaReceita = new Receita();
        minhaReceita.nomeReceita = "Bolo de Fubá";
        minhaReceita.autorReceita = "";
        minhaReceita.dificuldade = "Fácil";
        minhaReceita.porcoes = Integer.parseInt("8");
        minhaReceita.ingredientes = "1 xícara de chá de óleo\n" +
                "4 ovos\n" +
                "2 xícaras de chá de açúcar\n" +
                "1 xícara de chá de leite morno\n" +
                "2 xícaras de chá de farinha de trigo\n" +
                "1 xícara de chá de fubá\n" +
                "1 colher de sopa de fermento em pó";

        minhaReceita.modoDePreparo =
                "Bata no liquidificador o óleo, ovos e a açúcar até ficar homogêneo. Depois, adicione leite e bata novamente .\n" +
                "Com o liquidificador batendo, adicione farinha de trigo aos poucos.\n" +
                "Acrescente o fubá e bata até misturar bem.\n" +
                "Sem bater, acrescente o fubá e misture com uma espátula.\n" +
                "Despeje em uma forma untada com manteiga. Leve para assar em forno preaquecido a 250 graus Celsius por 35 minutos.";

        System.out.println(minhaReceita.exibirReceita());

    }
}
