
package oo_unisul;
import javax.swing.*;

public class Caminhao extends Veiculo {
    
    int Toneladas;
    int AlturaMax;
    int Comprimento;

    public static void main(String args[]) {

    }

    public Caminhao() {
    }

    public Caminhao(int Toneladas, int AlturaMax, int Comprimento, int Peso, int VelocMax, float Preco) {
        super(Peso, VelocMax, Preco);
        this.Toneladas = Toneladas;
        this.AlturaMax = AlturaMax;
        this.Comprimento = Comprimento;
    }

    public int getToneladas() {
        return Toneladas;
    }

    public void setToneladas(int Toneladas) {
        this.Toneladas = Toneladas;
    }

    public int getAlturaMax() {
        return AlturaMax;
    }

    public void setAlturaMax(int AlturaMax) {
        this.AlturaMax = AlturaMax;
    }

    public int getComprimento() {
        return Comprimento;
    }

    public void setComprimento(int Comprimento) {
        this.Comprimento = Comprimento;
    }
    
    @Override
    public void leitura() {
    super.leitura();
    setToneladas(Integer.parseInt(JOptionPane.showInputDialog("Digite a tonelada")));
    setAlturaMax(Integer.parseInt(JOptionPane.showInputDialog("Digite a altura maxima")));
    setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento")));
}
    @Override
    public void imprimir() {
    super.imprimir();
    JOptionPane.showMessageDialog(null,"A tonelada é " + getToneladas());
    JOptionPane.showMessageDialog(null,"A Altura maxima é " + getAlturaMax());
    JOptionPane.showMessageDialog(null,"O Comprimento é " + getComprimento());
}
}
