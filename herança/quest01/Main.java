/*
Crie uma classe base chamada Animal com métodos como fazerSom(). 
Crie subclasses como Cachorro, Gato e Vaca que herdam de Animal e 
implementam o método fazerSom() com sons específicos para cada animal.
*/

// Classe base Animal
abstract class Animal {
    // Método abstrato que deve ser implementado pelas subclasses
    abstract void fazerSom();
}

// Subclasse Cachorro
class Cachorro extends Animal {
    // Implementação específica do método fazerSom() para Cachorro
    @Override
    void fazerSom() {
        System.out.println("O cachorro faz: Au Au");
    }
}

// Subclasse Gato
class Gato extends Animal {
    // Implementação específica do método fazerSom() para Gato
    @Override
    void fazerSom() {
        System.out.println("O gato faz: Miau");
    }
}

// Subclasse Vaca
class Vaca extends Animal {
    // Implementação específica do método fazerSom() para Vaca
    @Override
    void fazerSom() {
        System.out.println("A vaca faz: Muuu");
    }
}

// Classe principal para testar as subclasses
public class Main {
    public static void main(String[] args) {
        // Cria instâncias das subclasses
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        // Chama o método fazerSom() de cada instância
        cachorro.fazerSom(); // Saída: O cachorro faz: Au Au
        gato.fazerSom();     // Saída: O gato faz: Miau
        vaca.fazerSom();     // Saída: A vaca faz: Muuu
    }
}

