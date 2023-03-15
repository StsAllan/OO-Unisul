
package oo_unisul;

public class CarroPasseio extends Veiculo{
    
    String Cor;
    String Modelo;

    public static void main(String args[]) {

    }

    public CarroPasseio() {
    }

    public CarroPasseio(String Cor, String Modelo, int Peso, int VelocMax, float Preco) {
        super(Peso, VelocMax, Preco);
        this.Cor = Cor;
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
}
