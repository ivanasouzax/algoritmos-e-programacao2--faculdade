public class Main {
        public static void main(String[] args) {
            // Criando objetos Pneus
            Pneus pneus1 = new Pneus(2000, "Radial", "Michelin");
            Pneus pneus2 = new Pneus(1500, "Diagonal", "Pirelli");
            Pneus pneus3 = new Pneus(1800, "Tubeless", "Bridgestone");
    
            // Criando objetos Motor
            Motor motor1 = new Motor(150, 10000, "Toyota");
            Motor motor2 = new Motor(180, 12000, "Honda");
            Motor motor3 = new Motor(200, 14000, "Ford");
    
            // Criando objetos Bancos
            Bancos bancos1 = new Bancos(3000, "Esportivo", "Recaro");
            Bancos bancos2 = new Bancos(2500, "Conforto", "Sparco");
            Bancos bancos3 = new Bancos(2800, "Luxo", "Corbeau");
    
            // Criando objetos Carro
            Carro carro1 = new Carro(pneus1, motor1, bancos1);
            Carro carro2 = new Carro(pneus2, motor2, bancos2);
            Carro carro3 = new Carro(pneus3, motor3, bancos3);
    
            // Imprimindo os preços totais dos carros
            System.out.println("Detalhes do Carro 1:");
            carro1.printDetalhes();
            System.out.println();
    
            System.out.println("Detalhes do Carro 2:");
            carro2.printDetalhes();
            System.out.println();
    
            System.out.println("Detalhes do Carro 3:");
            carro3.printDetalhes();
    }
}
