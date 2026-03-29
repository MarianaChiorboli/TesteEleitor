package com.teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestaEleitor {

    @Test
    void testaNaopermitido() {
        assertEquals("Não Permitido", ClassificaEleitor.classifica(8));
        assertEquals("Não Permitido", ClassificaEleitor.classifica(0));
        assertEquals("Não Permitido", ClassificaEleitor.classifica(1));
        assertEquals("Não Permitido", ClassificaEleitor.classifica(14));
        assertEquals("Não Permitido", ClassificaEleitor.classifica(15));
    }

    @Test
    void testaFacultativo() {
        assertEquals("Facultativo", ClassificaEleitor.classifica(17));
        assertEquals("Facultativo", ClassificaEleitor.classifica(75));
        assertEquals("Facultativo", ClassificaEleitor.classifica(16));
        assertEquals("Facultativo", ClassificaEleitor.classifica(70));
        assertEquals("Facultativo", ClassificaEleitor.classifica(130));
    }

    @Test
    void testaObrigatori() {
        assertEquals("Obrigatório", ClassificaEleitor.classifica(40));
        assertEquals("Obrigatório", ClassificaEleitor.classifica(18));
        assertEquals("Obrigatório", ClassificaEleitor.classifica(19));
        assertEquals("Obrigatório", ClassificaEleitor.classifica(68));
        assertEquals("Obrigatório", ClassificaEleitor.classifica(69));
    }

    @Test
    void testaIdadeInvalida() {
        assertEquals("Idade Inválida", ClassificaEleitor.classifica(-5));
        assertEquals("Idade Inválida", ClassificaEleitor.classifica(150));
        assertEquals("Idade Inválida", ClassificaEleitor.classifica(-1));
        assertEquals("Idade Inválida", ClassificaEleitor.classifica(131));

        assertThrows(IllegalArgumentException.class, () -> {
            ClassificaEleitor.classifica("abc");
        });
    }
}