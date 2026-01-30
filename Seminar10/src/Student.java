/*2. Krijoni një klasë Student që trashëgon nga klasa Person. Student duhet të ketë një fushë shtesë nota
të tipit double. Ndërtoni konstruktorin për klasën Student duke përdorur konstruktorin e klasës prind
dhe testoni krijimin e një objekti Student.
3. Shtoni në klasën Person një metodë shfaqInfo() që afishon emrin dhe moshën e personit. Më pas, në
klasën Student, bëni override këtë metodë në mënyrë që të afishohen edhe të dhënat shtesë të
studentit, përfshirë notën.*/
public class Student extends Person {

    private double nota;

    public Student(String emri, int mosha, double nota) {
        super(emri, mosha);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override
    public void shfaqInfo() {
        System.out.println(
                "Student -> Emri: " + getEmri() +
                        ", Mosha: " + getMosha() +
                        ", Nota: " + nota
        );
    }

}
