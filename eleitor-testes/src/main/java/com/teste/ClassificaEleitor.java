package com.teste;

public class ClassificaEleitor {

    public static String classifica(int idade) {
        if (idade < 0 || idade > 130) return "Idade Inválida";
        if (idade <= 15)              return "Não Permitido";
        if (idade <= 17)              return "Facultativo";
        if (idade <= 69)              return "Obrigatório";
        return "Facultativo";
    }

    public static String classifica(Object entrada) {
        if (!(entrada instanceof Integer)) {
            throw new IllegalArgumentException("Entrada deve ser um número inteiro.");
        }
        return classifica((int) entrada);
    }
}