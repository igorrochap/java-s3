package conjunto_emprestimo;

public class EmprestimoTAP extends Emprestimo{
    private float tap; //taxa administrativa percentual

    public EmprestimoTAP(float s, int n, float j, float tap){
        super(s, n, j);
        this.tap = tap;
    }

    public float getTap(){
        return this.tap;
    }

    public float proximaParcela(){
        float next = super.proximaParcela();

        if(next > 0)
            next = next + (next * tap/100);
        
        return next;
    }
}
