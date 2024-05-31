package logica.dio;

public class TrabalhandoComFunções {

    public static void main(String[] args) {
        torrar ("pão na chapa", "Luis ",  "98");

        String userName = getFirstName("Carlos-Almeida-Juanito-Gargalo", "-");
        System.out.println("Seja bem vindo " + userName);

        userName = getFirstName("Felipe Silva Han Solo", " ");
        System.out.println("Seja bem vindo " + userName);

    }

    static void torrar(String pao, String nome, String valor) {

        System.out.println(" a torrada foi feita com: " +pao);
        System.out.println(" ele é um pedido de: " +nome);
        System.out.println(" e o custo foi: " +valor );
    }

    public static String getFirstName(String name, String splitChar) {
        String[] parts = name.split(splitChar);
        return parts[0];
    }
}



