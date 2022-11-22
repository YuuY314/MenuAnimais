package Animal;
public class Ovino extends Mamifero {
    private String chifre;

    public String getChifre() {
        return chifre;
    }

    public void setChifre(String chifre) {
        if(chifre.equalsIgnoreCase("SIM") || chifre.equals("S")){
            this.chifre = "Sim";
        } else {
            this.chifre = "Não";
        }
    }
}
