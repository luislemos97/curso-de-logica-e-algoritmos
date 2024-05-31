package logica.dio;

public class EstruturaDeRepetição {
    // For,

    public static void main(String[] args) {
        // Corrigindo o loop for
        for (int i = 0; i < 10; i++) {
            // Incrementa pontosDeVida dentro do loop
            int pontosDeVida = i + 1;
            System.out.println("Tomou porção de Vida " + pontosDeVida);
        }

        // Declaração e inicialização da variável pontosDeVida fora do loop
        int pontosDeVida = 10; // Considerando que após o loop, pontosDeVida seja 10
        System.out.println("Tomou porção de Vida Totais: " + pontosDeVida);

    }

    }

