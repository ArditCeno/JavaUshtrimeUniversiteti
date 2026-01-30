/*1. Implementoni një klasë Person me fushat: emri i tipit String dhe mosha e tipit int. Ndërtoni
konstruktorin dhe metodat getter/setter për të implementuar Enkapsulimin.*/
public class Person {

    private String emri;
    private int mosha;

    public Person(String emri, int mosha) {
        this.emri = emri;
        this.mosha = mosha;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        if (mosha >= 0) {
            this.mosha = mosha;
        }
    }

    public void shfaqInfo() {
        System.out.println("Emri: " + emri + ", Mosha: " + mosha);
    }
}
