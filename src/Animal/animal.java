package Animal;

public class animal {

    private String nome;
    private String tipoDeAnimal;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public animal(String nome, String tipoDeAnimal, int idade){
        this.nome = nome;
        this.tipoDeAnimal = tipoDeAnimal;
        this.idade = idade;
    }

    public animal(){

    }

    public void emitirSom(String som){
        System.out.println("O animal " + this.tipoDeAnimal + " faz " + som);
    }
}


