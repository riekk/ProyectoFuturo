package Entornos;

class Proyecto {

    public static void main(String[] args) {

        int valor1= Integer.parseInt(args[1]), valor2= Integer.parseInt(args[2]);

        System.out.println("Estudiante " + args[0] + ": ");

        String result = Veredicto.veredicto(valor1, valor2);
        System.out.println(result);

    }

}


