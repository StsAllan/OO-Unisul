package oo_unisul;
import javax.swing.*;

public class Veiculo {
    
    private int Peso;
    private int VelocMax;
    private float Preco;

    public static void main(String args[]) {
             
    }

    public Veiculo() {
    }

    public Veiculo(int Peso, int VelocMax, float Preco) {
        this.Peso = Peso;
        this.VelocMax = VelocMax;
        this.Preco = Preco;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getVelocMax() {
        return VelocMax;
    }

    public void setVelocMax(int VelocMax) {
        this.VelocMax = VelocMax;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }
    public void leitura() {
    setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso: ")));
    setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade maxima: ")));
    setPreco(Integer.parseInt(JOptionPane.showInputDialog("Digite o peço: ")));
}
    public void imprimir() {
    JOptionPane.showMessageDialog(null,"O peso é " + getPeso());
    JOptionPane.showMessageDialog(null,"A velocidade maxima é " + getVelocMax());
    JOptionPane.showMessageDialog(null,"O preço é " + getPreco());
    }
}
