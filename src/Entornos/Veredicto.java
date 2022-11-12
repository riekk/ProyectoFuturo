package Entornos;

class Veredicto {
    static String veredicto(int valor1, int valor2) {
        if (valor1*2>valor2) {
            return "Bien. Pero puede ser insuficiente.";
        }

        return "Ideal. Trabajas los contenidos en casa.";
    }
}