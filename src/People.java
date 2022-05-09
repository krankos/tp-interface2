public class People {
    private Man Country[] = new Man[100];
    private int nbMen = 0;

    public void birth(Man m) {
        // add m to Country
        if (nbMen > 100)
            System.out.println("Country full!!");
        else {
            int i = 0;
            Country[nbMen] = m;
            nbMen++;
            System.out.println(i);
        }
    }

    public void explore() {
        for (int i = 0; i < nbMen; i++) {
            Country[i].identity();
        }
    }

}
