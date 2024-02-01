package com.mycompany.linguagemdosistema;

import java.util.Locale;

public class LinguagemDoSistema {

    public static void main(String[] args) {
        Locale langSyst = Locale.getDefault();
        System.out.println("A linguagem do sistema é " + langSyst.toString());
    }
}
