package logica.dio;

public class EstruturaCondicionais {

    public static void main(String[] args) {

        // Estrutura condicionais com IF,ELse IF, Else
        boolean possuiEmprego = false;
        String comprarCasa = "";

        if (possuiEmprego) {
            comprarCasa = " Aprovado ";
        } else {
            comprarCasa = "Recusado";

        }
        System.out.println("Comprar casa: " + comprarCasa);

        //if,else if ,else


        int nivelDeFome = 1;

        if (nivelDeFome == 1) {
            System.out.println("pouca fome");
        } else if (nivelDeFome == 2) {
            System.out.println("muita fome");
        } else {
            System.out.println("Você comeria mais que o pica pau");
        }
        System.out.println( " ");
    }
}
