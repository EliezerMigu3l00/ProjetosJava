package com.mycompany.resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Dimension resolucaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = resolucaoTela.width;
        int altura = resolucaoTela.height;
        System.out.println("A resolução da sua tela é " + largura + "X" + altura);
    }
}
