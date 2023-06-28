public class Decrementare {
    public static void main(String[] args) {

        //Copii gradinita dimineata ora 7
        int copiiGradinitaOra7 = 0;

        System.out.println("Copii gradinita ora 7: " + copiiGradinitaOra7++);
        System.out.println("Copii gradinita ora 7:05: " + copiiGradinitaOra7++);
        System.out.println("Copii gradinita ora 7:10: " + copiiGradinitaOra7++);
        System.out.println("Copii gradinita ora 7:20: " + ++copiiGradinitaOra7);
        System.out.println("Copii gradinita ora 7:30: " + ++copiiGradinitaOra7);

        //Copii gradinita dupa ora 18
        int copiiGradinitaOra18 = 26;

        System.out.println("Copii gradinita ora 18: " + copiiGradinitaOra18--);
        System.out.println("Copii gradinita ora 18:05: " + copiiGradinitaOra18--);
        System.out.println("Copii gradinita ora 18:10: " + copiiGradinitaOra18--);
        System.out.println("Copii gradinita ora 18:20: " + --copiiGradinitaOra18);
        System.out.println("Copii gradinita ora 18:30: " + --copiiGradinitaOra18);
    }
}
