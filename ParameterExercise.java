public class ParameterExercise {
    public static void main(String[] args) {
        System.out.println("Titlu carte: " + args[0]);
        System.out.println("Autor: " + args[1]);
        System.out.println("Editura: " + args[2]);
        System.out.println("Anul publicarii: " + args[3]);
        System.out.println("Numar de exemplare vandute: " + args[4]);
        String primaCarte = "Cartea " + args[0] + " a fost scrisa de " + args[1] + " si a fost publicata de editura " + args[2]
                + " in anul "+ args[3]+". S-a vandut in " + args[4] + " de exemplare."+ "\n";
        System.out.println(primaCarte);
        String inversareString = primaCarte;

        String result = new StringBuffer(inversareString).reverse().toString();
        System.out.println(result);
        System.out.println("Textul inversat contine: " + result.length() + " caractere.");

        System.out.println(new StringBuilder(primaCarte).reverse().toString());
        System.out.println();

        System.out.println("Titlu carte: " + args[5]);
        System.out.println("Autor: " + args[6]);
        System.out.println("Editura: " + args[7]);
        System.out.println("Anul publicarii: " + args[8]);
        System.out.println("Numar de exemplare vandute: " + args[9]);
        String aDouaCarte = "Cartea " + args[5] + " a fost scrisa de " + args[6] + " si a fost publicata de editura " + args[7]
                + " in anul "+ args[8]+". S-a vandut in " + args[9] + " de exemplare.";
        System.out.println(aDouaCarte);




    }


}
