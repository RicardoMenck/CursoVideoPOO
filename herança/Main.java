package video.curso.herança;

public class Main {
    public static void main(String[] args) {

        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        v1.setNome("Cleria");
        v1.setIdade(25);
        v1.setSexo("F");
        v1.fazerAniv();
        v1.toString();

        a1.setNome("Pedro");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setSexo("M");
        a1.setIdade(18);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setCurso("Informática");
        b1.setSexo("M");
        b1.pagarMensalidade();

        p3.setNome("Alexis");
        p4.setNome("Barcelos");


        p3.setSexo("M");
        p4.setSexo("M");

        ;
        p3.setSalario(2500.00);
        p4.setSetor("Estoque");

        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
