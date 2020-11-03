package conjunto_emprestimo; 

public class Emprestimo {
    private float s, j, p;         // s = valor da primeira parcela
    private int n, corrente;       // n = numero de parcelas
                                   // p = ṕarcela
                                  // j = percentual de juros mensal
    public Emprestimo(float s, int n, float j){
        this.s = s;
        this.n = n;
        this.j = j;
        corrente = 1;
        this.p = s;
    }

    public float proximaParcela(){
        float ret = p;
        corrente++;
        if(corrente <= n)
            p = p + (p * j/100);
        else
            p = 0;
        return ret;
    }
}
