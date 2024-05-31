package logica.dio;

public class EstruturaDeDecisão {
    public static void main(String[] args) {
 // Estrutura de Decisão.
        String fruta = "banana";

        switch (fruta) {
            case "laranja":
                System.out.println( " suco de laranja ");
                break;

            case "banana":
            case "morango":
                System.out.println(" Vitamina ");
                break;

            case "maça":
                System.out.println(" Vitamina de maça ");
                break;

            default:
                System.out.println(" Suco Genérico");
        }


    }
}
