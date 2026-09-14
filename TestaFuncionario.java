public class TestaFuncionario{
    public static void main(String[] args){
        Funcionario meiokilo1 = new Funcionario();
        meiokilo1.setCpf("999.888.222-44");
        meiokilo1.setNome("João Pedro");
        meiokilo1.setSalario(2460.86);

        System.out.println(meiokilo1.getNome());
        System.out.println(meiokilo1.getCpf());
        System.out.println(meiokilo1.getSalario());
        System.out.println(meiokilo1.getBonificacao());

        Gerente joaov = new Gerente();
        joaov.setCpf("888.555.333-09");
        joaov.setNome("João Victor");
        joaov.setSalario(8907.86);
        joaov.setTipo(1);
        joaov.setSenha(135791);

        System.out.println("\n O nome é: " + joaov.getNome());
        System.out.println("O CPF é: " + joaov.getCpf());
        System.out.println("O salário é: " + joaov.getSalario());
        System.out.println("A bonificação é: " + joaov.getBonificacao());
        System.out.println(joaov.autentica(135791));
    }
}