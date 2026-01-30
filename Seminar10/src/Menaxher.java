/*5. Krijoni një klasë Menaxher që trashëgon nga Punonjës dhe ka një fushë shtesë bonus të tipit double.
Bëni Override metodën gjejPagenVjetore() në mënyrë që paga vjetore të përfshijë edhe bonusin.*/
public class Menaxher extends Punonjes {

    private double bonus;

    public Menaxher(String emri, int mosha, double paga, double bonus) {
        super(emri, mosha, paga);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double gjejPagenVjetore() {
        return super.gjejPagenVjetore() + bonus;
    }
}
