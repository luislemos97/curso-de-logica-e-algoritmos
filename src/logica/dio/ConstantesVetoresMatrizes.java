package logica.dio;

import java.util.ArrayList;

public class ConstantesVetoresMatrizes {

            public static void main(String[] args) {

                //Uso de Constantes
                String poteCafe = "café Pilão";
                String poteAçucar = " Açucar Cristal";
                String poteBiscooito = " Biscoito da Vovó";
         String menssagemDaVovo = "Na cozinha da vovó hoje tem: ";

                 System.out.println( menssagemDaVovo +
                        poteCafe + " -  \n " +
                        poteAçucar + " - \n " +
                        poteBiscooito
                );

                poteCafe = " Café 3 Corações ";

                System.out.println( menssagemDaVovo +
                        poteCafe + " - \n" +
                        poteAçucar + " - \n " +
                        poteBiscooito
                );

                String Pokemom = ( "Pikachu, Chamander , Bulbassaru");
                String Pokemom1 = ("Bulbassaru");


                System.out.println("Dentro do armario eu tenho: " + Pokemom1);

                ArrayList <String> Pokemom2 = new ArrayList<String>();

                Pokemom2.add("Pikachu");
                Pokemom2.add("Chamander");
                Pokemom2.add("Bulbassaru");

                Pokemom2.remove(2);

                System.out.println ("Na caixa tem: " + Pokemom2 );

                // trabalhando com Vetores e Matrizes
                ArrayList<String> timePokemom3 = new ArrayList<String>();
                ArrayList<String> nomeDoPokemom3 = new ArrayList<String>();

                nomeDoPokemom3.add("Pikachu , Chamander, Bulbassaru");

                timePokemom3.add("Pikachu , M , 10");
                timePokemom3.add("Chamander , F , 6");
                timePokemom3.add("Bulbassaru, M , 10");

                // Acessando a linha 1 e coluna 0 dentro da linha 1
                // Linha 1 significa índice e o  0 (primeiro elemento da ArrayList)
                String linha1 = timePokemom3.get(1); // "Chamander , F , 6"

                // Dividindo a string em partes por ", "
                String[] colunas = linha1.split (", ");
                String coluna0 = colunas[0]; // "Chamander"

                System.out.println("No armário tem: " + timePokemom3 + "\ne E eu quero o Pokemom do nome: " + coluna0 + "\nE o sexo é: " + colunas[1] +
                        "\ne o seu nivel é: "+ colunas [2]);
            }
}
