package ro.unibuc.auctionplatform;

import java.util.Date;
import java.util.Scanner;

public class Interogari implements InterfataAdmin{
    @Override
    public Utilizatori getUtilizatoriById(int id){
        for(Utilizatori utilizator: utilizatori)
        {
            if(utilizator.getId() == id)
                return utilizator;
        }
        return null;
    }

    @Override
    public Produse getProduseById(int id){
        for(Produse produs: produse)
        {
            if(produs.getId() == id)
                return produs;
        }
        return null;
    }

    @Override
    public Licitatii getLicitatiiById(int id){
        for(Licitatii licitatie: licitatii)
        {
            if(licitatie.getId() == id)
                return licitatie;
        }
        return null;
    }

    public void addUtilizatori(Scanner in){
        System.out.println("username");
        String userName = in.next();

        System.out.println("adresa");
        String adress = in.next();

        System.out.println("Data nasterii yyyy-mm-dd");
        Date birthday = parseDate(in);

        System.out.println("Numar de telefon");
        String phoneNumber = in.next();

        Utilizatori utilizatori = new Utilizatori(userName, adress, birthday, phoneNumber);
    }

    public void addProduse(Scanner in){
        System.out.println("Nume produs");
        String numeProduse = in.next();

        System.out.println("Descriere produs");
        String descriere = in.next();

        Produse produse = new Produse(numeProduse, descriere);
    }

    public void addLicitatii(Scanner in){
        System.out.println("Produs");
        String product = in.next();

        System.out.println("Data la care se liciteaza");
        Date date = parseDate(in);

        System.out.println("Pretul de la care se porneste licitatia");
        int startingBid = in.nextInt();

        System.out.println("Pretul la care poti cumpara produsul fara sa il mai licitezi");
        int buyOut = in.nextInt();

        Licitatii licitatii = new Licitatii(product, date, startingBid, buyOut);
    }

    public void addBids(Scanner in){
        System.out.println("Produsul pentru care licitati");
        String product =  in.next();

        System.out.println("Data la care licitati");
        Date date = parseDate(in);

        System.out.println("Pretul de la care porneste licitatia");
        int startingBid = in.nextInt();

        System.out.println("Pretul de buyout pe care sunteti dispusi sa il oferiti");
        int buyOut = in.nextInt();
    }
}
