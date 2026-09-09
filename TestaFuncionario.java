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
    }
}