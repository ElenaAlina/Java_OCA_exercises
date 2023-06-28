public class MasinaMea {
    public static void main(String[] args) {
        /*
        *Într-o altă clasă creați variabile care să poată conține informații precum:
        * modelul unei mașini,
        * puterea motorului,
        * numărul de uși,
        * masa în tone,
        * culoarea,
        * viteza maximă (în km/h).
         */

        String numeMasina = "Renault";
        String modelMasina = "Captur";
        String tipMasina = "Full Hybrid";
        int putereMotor = 1650;
        int numarUsiMasina = 5;
        double masaMasina = 1.751;
        char tipMasuraMasaMasina = 't';
        String normaPoluare = "Euro6";
        int pretMasina = 19200;
        char monedaMasina = '€';
        int vitezaMaximaMasina = 170;

        System.out.println("Mi-am cumparat o masina " + numeMasina + modelMasina + "," + tipMasina + "." + '\n' + "Imi place deoarece ajunge pana la " +
                vitezaMaximaMasina + "km/h, si are " + numarUsiMasina +  " usi." + '\n' + "Iata cateva informatii despre masina aceasta: " +
                '\n' + "Putere motor: " + putereMotor + '\n'+ "Masa Masina: " + masaMasina + " " + tipMasuraMasaMasina + '\n'+
                "Are norma de poluare: " + normaPoluare + " si un pret acceptabil de: "+ pretMasina + " " + monedaMasina +".");


    }
}
