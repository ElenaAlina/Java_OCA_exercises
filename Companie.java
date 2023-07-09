public class Companie {

    //Creati o clasa cu numele Companie care sa aiba minim 5 campuri si doua metode. Respectati conventiile de nume.
            static void companieStructura(String numeDepartament, char numarCorpCaldire, int etajDepartament,
                                          int numarAngajatiDepartament, String prenumeManager, String numeManager) {

                System.out.println(numeDepartament + " -> " + numarCorpCaldire + " " +etajDepartament + " " + numarAngajatiDepartament + " - " + prenumeManager + " " + numeManager);

            }
            static void listaAngajati(String prenumeAngajat, String numeAngajat, int varstaAngajat, int vechimeCompanie, String studiiAngajat){

                System.out.println(prenumeAngajat +" -> " + numeAngajat + " " + varstaAngajat + " " + studiiAngajat + " " + vechimeCompanie);
            }
            public static void main(String[] args) {
                System.out.println("Structura Companie: " + "\n");
                companieStructura("Resurse Umane", 'B', 5,256, "Mihai", "Florescu" );
                companieStructura("Financiar Contabil", 'F', 6, 35, "Claudia","Moistea");
                companieStructura("IT",'5', 8,58, "Laurentiu", "Popescu");
                companieStructura("Marketing", 'B',4, 12,"Daniela","Grama");
                companieStructura("Achizitii", 'A', 3, 6,"Razvan", "Mircescu");
                System.out.println("\n" +"Lista Angajati Companie: " + "\n");
                listaAngajati("Ioana", "Musat", 42, 5, "superioare");
                listaAngajati("Andrei", "Rizescu", 38, 7, "superioare");
                listaAngajati("Matei", "Cristea", 58, 13, "superioare");
                listaAngajati("Ionut", "Badea", 28, 6,"medii");
                listaAngajati("Ayan","Stoica", 34, 11, "superioare");
            }

    


}
