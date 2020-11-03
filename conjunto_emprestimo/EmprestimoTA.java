package conjunto_emprestimo;

public class EmprestimoTA extends Emprestimo{
    private float ta; //taxa administrativa

    public EmprestimoTA(float s, int n, float j, float ta){
        super(s, n, j);
        this.ta = ta;
    }

    public float getTax(){
        return this.ta;
    }

    public float proximaParcela(){
        float next = super.proximaParcela();

        if(next > 0){
            next += ta;
        }

        return next;
    }
}
