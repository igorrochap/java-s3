package conjunto_emprestimo;

public class App {
    public static void main(String[] args) {
        int max = 10;
        ConjuntoEmprestimos cj = new ConjuntoEmprestimos(max);

        Emprestimo emp = new Emprestimo(100, 5, 7);
        Emprestimo emp2 = new EmprestimoTA(200, 4, 3, 15);
        Emprestimo emp3 = new EmprestimoTAP(452, 2, 7, 12);
        Emprestimo emp4 = new EmprestimoTA(170, 6, 1, 7);
        Emprestimo emp5 = new EmprestimoTA(1000, 4, 7, 30);
        Emprestimo emp6 = new Emprestimo(400, 3, 8);
        Emprestimo emp7 = new EmprestimoTAP(200, 8, 3, 15);
        Emprestimo emp8 = new EmprestimoTA(200, 8, 3, 15);
        Emprestimo emp9 = new Emprestimo(700, 10, 4);
        Emprestimo emp10 = new EmprestimoTAP(280, 3, 6, 12);

        cj.add(emp);
        cj.add(emp2);
        cj.add(emp3);
        cj.add(emp4);
        cj.add(emp5);
        cj.add(emp6);
        cj.add(emp7);
        cj.add(emp8);
        cj.add(emp9);
        cj.add(emp10);

        cj.proximasParcelas();
    }
}
