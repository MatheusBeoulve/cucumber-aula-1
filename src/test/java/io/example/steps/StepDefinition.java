package io.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dada;
import io.cucumber.java.pt.Dado;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StepDefinition {

    public boolean donoRegistrado = true;
    public boolean podeComparecer = false;
    public boolean sabado = false;

    @Before
    public void antesDeQualquerCenario() {
        System.out.println("Antes de qualquer cenario.");
    }

    @Before("@ApenasSabado")
    public void apenasSabado() {
        assertTrue(sabado);
    }

    @Dada("Ant4s de sair minha mae me lembro ude pegar meu casaco")
    public void maeLembrou() {
        System.out.println("Ja vou mae.");
    }

    @Dada("Como um dono de pet ja registrado")
    public void donoPetJaRegistrado() {
        assertTrue(donoRegistrado);
    }

    @Dada("Posso comparecer a uma unidade de vacinacao para vacinar meu pet")
    public void possoComparecerAVacinacao() {
        assertTrue(podeComparecer);
    }

    @Dado("Como dono de um {} {}")
    public void como_dono_de_um_cachorro(String especie, String cor) {
        assertEquals(especie, "cachorro");
        assertEquals(cor, "marrom");
    }

    @Dado("Quando a campanha de vacinacao esta em andamento")
    public void quando_a_campanha_de_vacinacao_esta_em_andamento() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("Entao posso fazer o registro para participar")
    public void entao_posso_fazer_o_registro_para_participar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
