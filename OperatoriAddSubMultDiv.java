public class OperatoriAddSubMultDiv {
    public static void main(String[] args) {
        int tricouPret = 120;
        int sapcaPret = 65;
        long tricouBucatiInStoc = 1_258_358L;
        long sapcaBucatiInStoc = 1_258_358L;
        int tricouBucatiVandute = 5935;
        int sapcaBucatiVandute = 23487;

        //Pretul marfii din Stoc
        System.out.println("Pret Produsului 'Tricou' in Stoc: " + (tricouBucatiInStoc * tricouPret) + '\n' +
                "Pret Produsului 'Sapca' in Stoc: " + (sapcaBucatiInStoc * sapcaPret) + '\n');

        //Rest marfa ramasa in Stoc
        System.out.println("Tricouri ramase in stoc: " + (tricouBucatiInStoc - tricouBucatiVandute) + '\n'
                + "Sepci ramase in stoc: " + (sapcaBucatiInStoc - sapcaBucatiVandute));

        //pret 2 tricouri *=
        tricouPret *= 2;
        System.out.println("Pret 2 tricouri: " + tricouPret);

        //Rest sepci in stoc -=
        System.out.println("Rest sepci in stoc: " + (sapcaBucatiInStoc -= 23487));

        //cat costa o sapca /=
        long sumaStocSepci = sapcaBucatiInStoc * sapcaPret;
        long pretSapca = sumaStocSepci /= 1_258_358L;
        System.out.println(pretSapca);
    }
}
