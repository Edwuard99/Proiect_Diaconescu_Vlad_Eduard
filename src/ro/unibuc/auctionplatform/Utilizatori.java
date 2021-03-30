package ro.unibuc.auctionplatform;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class Utilizatori {
    @NotNull
    protected String userName;
    protected String adress;
    protected final int id;
    protected final String phoneNumber;
    protected final Date birthday;
    private static int utilizatoriCnt = 0;

    public Utilizatori(@NotNull String userName, String adress, Date birthday, String phoneNumber) {
        this.userName = userName;
        this.adress = adress;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        utilizatoriCnt++;
        this.id = utilizatoriCnt;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
