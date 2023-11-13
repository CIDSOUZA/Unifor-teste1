class Motor {
    // Atributos
    String tipo;
    int potencia;

    // Método para definir (set) o tipo e a potência do motor
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    // Método para obter (get) o tipo e a potência do motor
    public String getMotorInfo() {
        return "Motor: " + tipo + ", Potência: " + potencia + " HP";
    }
}

class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;
    private int quilometragem;
    Motor motor;

    // Método construtor sem o motor
    public Carro() {

    }

    // Método construtor com o motor
    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    // Método para definir (set) a marca. modelo e ano
    public void setCarroInfo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para obter (get) a marca. modelo e ano
    public String getCarroInfo() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano;
    }

    // Método para imprimir em tela as informações obtidas
    public void exibirCarroInfo() {
        System.out.println(getCarroInfo());
    }

    // Método para definir (set) a quilometragem
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    // Método para obter (get) a quilometragem
    public int getQuilometragem() {
        return quilometragem;
    }

    // Método que calcula a quantidade de quilometros percorridos
    public void rodar(int quilometragemPercorrida) {
        if (quilometragemPercorrida > 0) {
            quilometragem += quilometragemPercorrida;
        }
    }

    // Método para ligar o motor
    public void ligar() {
        System.out.println("Ligando o carro...");
        System.out.println(motor.getMotorInfo());
    }
}

// Aplicação do conceito de Herança
class CarroEsportivo extends Carro {
    // Atributos
    int velocidadeMaxima;

    // Método para acelerar o carro
    public void acelerar() {
        System.out.println("Acelerando o carro esportivo!");
    }

    // Método para definir (set) a velocidade máxima
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método para obter (get) a velocidade máxima
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    // Método para retorno em forma de texto
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Velocidade Máxima: " + velocidadeMaxima;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("--- Questão 01 ---");
        Carro meuCarro = new Carro();
        meuCarro.setCarroInfo("Toyota", "Corolla", 2022);
        meuCarro.exibirCarroInfo();
        
        System.out.println("\n--- Questão 02 ---");
        meuCarro.rodar(100);
        meuCarro.rodar(-100);
        meuCarro.rodar(50);
        meuCarro.rodar(73);
        meuCarro.rodar(122);
        meuCarro.rodar(-3);
        System.out.println("Quilometragem: " + meuCarro.getQuilometragem());

        System.out.println("\n--- Questão 03 ---");
        CarroEsportivo meuCarroEsportivo = new CarroEsportivo();
        meuCarroEsportivo.setCarroInfo("Ferrari", "488 GTB", 2023);
        meuCarroEsportivo.setVelocidadeMaxima(330);
        meuCarroEsportivo.acelerar();
        System.out.println(meuCarroEsportivo);
        meuCarroEsportivo.setVelocidadeMaxima(80);
        System.out.println(meuCarroEsportivo);

        System.out.println("\n--- Questão 04 ---");
        Motor motorCarro = new Motor("V8", 500);
        Carro meuCarroComMotor = new Carro("Chevrolet", "Camaro", 2023, motorCarro);
        meuCarroComMotor.ligar();
    }
}