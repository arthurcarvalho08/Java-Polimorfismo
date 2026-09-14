public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0;

    public int getTipo(){
        return tipo;
    }

    public double getBonificacao(){
        if (this.tipo == 0){
            return this.salario * 0.1;
        } else if (this.tipo == 1){
            return this.salario * 1;
        } else{
            return this.salario * 2;
        }
    }
}

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getCpf(){
    return cpf;
}

public void setCpf (String cpf){
    this.cpf = cpf;
}

public String getSalario(){
    return salario;
}

public void setSalario(String salario){
    this.salario = salario;
}