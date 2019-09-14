package sistemaexperto;

import Rule.*;
import javax.swing.JOptionPane;

public class SE {

    BooleanRuleBase basereglas = new BooleanRuleBase("REGLAS");

    RuleVariable Genero;
    RuleVariable Altura;
    RuleVariable Complexion;
    RuleVariable TesDePiel;
    RuleVariable Borracho;
    RuleVariable RisaFuerte;
    RuleVariable Enojon;

    RuleVariable ResultadoFinal;

    String resultado = "";

    public void obtenerGenero() {
        String[] options = {"Hombre", "Mujer"};
        int x = JOptionPane.showOptionDialog(null, "Es Hombre o Mujer",
                "Selecciona", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        Genero.setValue(options[x]);

        basereglas.forwardChain();
    }

    public void obtenerAltura() {
        String[] options = {"Alta", "Baja"};
        int x = JOptionPane.showOptionDialog(null, "La persona es Alta o Baja???",
                "Selecciona", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        Altura.setValue(options[x]);

        basereglas.forwardChain();
    }

    public void obtenerComplexion() {
        String[] options = {"Delgada", "Gorda"};
        int x = JOptionPane.showOptionDialog(null, "La persona es Delgada o Gorda???",
                "Selecciona", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        Complexion.setValue(options[x]);

        basereglas.forwardChain();
    }

    public void obtenerTesDePiel() {
        String[] options = {"Güera", "Morena"};
        int x = JOptionPane.showOptionDialog(null, "La persona es Güera o Morena???",
                "Selecciona", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        TesDePiel.setValue(options[x]);

        basereglas.forwardChain();
    }

    public void obtenerBorracho() {
        String[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "La persona es borracha???",
                "Selecciona", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        Borracho.setValue(options[x]);

        basereglas.forwardChain();
    }

    public void obtenerRisas() {
        String[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "La risa de la persona es fuerte???",
                "Selecciona", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        RisaFuerte.setValue(options[x]);

        basereglas.forwardChain();
    }

    public void obtenerEnojon() {
        String[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "La persona es enojona???",
                "Selecciona", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        Enojon.setValue(options[x]);

        basereglas.forwardChain();
    }

    public void baseconocimiento() {
        Genero = new RuleVariable(basereglas, "");
        Altura = new RuleVariable(basereglas, "");
        TesDePiel = new RuleVariable(basereglas, "");
        Complexion = new RuleVariable(basereglas, "");
        Borracho = new RuleVariable(basereglas, "");
        RisaFuerte = new RuleVariable(basereglas, "");
        Enojon = new RuleVariable(basereglas, "");

        ResultadoFinal = new RuleVariable(basereglas, "");

        Condition igual = new Condition("=");

        Rule regla1 = new Rule(basereglas, "Regla1",
                new Clause[]{
                    new Clause(Genero, igual, "Hombre"),
                    new Clause(Altura, igual, "Baja"),
                    new Clause(Complexion, igual, "Delgada"),
                    new Clause(TesDePiel, igual, "Morena"),
                    new Clause(Borracho, igual, "Si"),
                    new Clause(RisaFuerte, igual, "No"),
                    new Clause(Enojon, igual, "No")
                },
                new Clause(ResultadoFinal, igual, "Brandon")
        );

        Rule regla2 = new Rule(basereglas, "Regla2",
                new Clause[]{
                    new Clause(Genero, igual, "Hombre"),
                    new Clause(Altura, igual, "Alta"),
                    new Clause(Complexion, igual, "Gorda"),
                    new Clause(TesDePiel, igual, "Güera"),
                    new Clause(Borracho, igual, "Si"),
                    new Clause(RisaFuerte, igual, "No"),
                    new Clause(Enojon, igual, "No")
                },
                new Clause(ResultadoFinal, igual, "Raziel")
        );

        Rule regla3 = new Rule(basereglas, "Regla3",
                new Clause[]{
                    new Clause(Genero, igual, "Mujer"),
                    new Clause(Altura, igual, "Alta"),
                    new Clause(Complexion, igual, "Gorda"),
                    new Clause(TesDePiel, igual, "Güera"),
                    new Clause(Borracho, igual, "Si"),
                    new Clause(RisaFuerte, igual, "Si"),
                    new Clause(Enojon, igual, "No")
                },
                new Clause(ResultadoFinal, igual, "Yessica")
        );

        Rule regla4 = new Rule(basereglas, "Regla4",
                new Clause[]{
                    new Clause(Genero, igual, "Mujer"),
                    new Clause(Altura, igual, "Baja"),
                    new Clause(Complexion, igual, "Gorda"),
                    new Clause(TesDePiel, igual, "Güera"),
                    new Clause(Borracho, igual, "Si"),
                    new Clause(RisaFuerte, igual, "No"),
                    new Clause(Enojon, igual, "No")
                },
                new Clause(ResultadoFinal, igual, "Samanta")
        );

        Rule regla5 = new Rule(basereglas, "Regla5",
                new Clause[]{
                    new Clause(Genero, igual, "Hombre"),
                    new Clause(Altura, igual, "Alta"),
                    new Clause(Complexion, igual, "Delgada"),
                    new Clause(TesDePiel, igual, "Güera"),
                    new Clause(Borracho, igual, "No"),
                    new Clause(RisaFuerte, igual, "No"),
                    new Clause(Enojon, igual, "Si")
                },
                new Clause(ResultadoFinal, igual, "Enrique")
        );
        
        Rule regla6 = new Rule(basereglas, "Regla6",
                new Clause[]{
                    new Clause(Genero, igual, "Hombre"),
                    new Clause(Altura, igual, "Alta"),
                    new Clause(Complexion, igual, "Gorda"),
                    new Clause(TesDePiel, igual, "Güera"),
                    new Clause(Borracho, igual, "No"),
                    new Clause(RisaFuerte, igual, "No"),
                    new Clause(Enojon, igual, "No")
                },
                new Clause(ResultadoFinal, igual, "Chefe")
        );

    }

    public static void main(String[] args) {
        Interface S = new Interface();
        S.setVisible(true);
    }
}
