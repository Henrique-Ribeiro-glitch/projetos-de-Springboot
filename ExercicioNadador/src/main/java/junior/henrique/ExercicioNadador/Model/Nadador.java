package junior.henrique.ExercicioNadador.Model;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 01/06/2020 09:50
 * @category Model
 */
public class Nadador {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *Classifica o nadador pela idade
     */
    public String clasificarNadador() {
        if (idade < 8) {
            return "Não pode ser nadador. A idade mínima é 8 anos";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil";
        }  else if (idade >=11 && idade <= 17) {
            return "Juvenil";
        }  else {
            return "Adulto";
        }
    }

    public String toString() {
        return "\nNome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nCategoria: " + this.clasificarNadador();
    }

}
