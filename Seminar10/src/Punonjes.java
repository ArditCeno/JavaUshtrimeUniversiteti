/*4. Implementoni një klasë Punonjës që trashëgon nga Person. Kjo klasë duhet të ketë një fushë paga të
tipit double që përfaqëson pagën mujore. Ndërtoni konstruktorin dhe një metodë gjejPagenVjetore()
e cila kthen pagën vjetore të punonjësit.*/
public class Punonjes extends Person {

    private double paga;

    public Punonjes(String emri, int mosha, double paga) {
        super(emri, mosha);
        this.paga = paga;
    }

    public double getPaga() {
        return paga;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    public double gjejPagenVjetore() {
        return paga * 12;
    }
}
