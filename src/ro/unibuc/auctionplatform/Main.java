package ro.unibuc.auctionplatform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int optiune = in.nextInt();
        Interogari interogari = new Interogari();

        while(optiune>0)
        {
            if(optiune==1)
            {
                interogari.addUtilizatori(in);
            }

            if(optiune==2)
            {
                interogari.addProduse(in);
            }

            if(optiune==3)
            {
                interogari.addLicitatii(in);
            }

            if(optiune==4)
            {
                interogari.addBids(in);
            }

            if(optiune==5)
            {
                System.out.println(interogari.getUtilizatoriById(in.nextInt()));
            }

            if(optiune==6)
            {
                System.out.println(interogari.getProduseById(in.nextInt()));
            }

            if(optiune==7)
            {
                System.out.println(interogari.getLicitatiiById(in.nextInt()));
            }
        }
        System.out.println("introduceti optiunea dumneavoastra");
        optiune = in.nextInt();
    }
}
