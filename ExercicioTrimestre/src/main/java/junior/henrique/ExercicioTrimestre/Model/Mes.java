package junior.henrique.ExercicioTrimestre.Model;

/**
 * @author Henrique
 * @version 1.0
 * @since 14/06/2020 - 13:10
 * @category Model
 */
public class Mes {

    private String mes;

    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * Converte o mes de nascimento do usuario para o trimestre em que nasceu
     */
    public String converterMesParaTrimestre() {
        switch(this.mes) {
            case "Janeiro": return "Primeiro Trimestre";
            case "Fevereiro": return "Primeiro Trimestre";
            case "Março": return "Primeiro Trimestre";
            case "Abril": return "Primeiro Trimestre";
            case "Maio": return "Segundo Trimestre";
            case "Junho": return "Segundo Trimestre";
            case "Julho": return "Segundo Trimestre";
            case "Agosto": return "Segundo Trimestre";
            case "Setembro": return "Terceiro Trimestre";
            case "Outubro": return "Terceiro Trimestre";
            case "Novembro": return "Terceiro Trimestre";
            case "Dezembro": return "Terceiro Trimestre";
            default: return "Mês  inválido!";
        }
    }

    public String toString() {
        return this.converterMesParaTrimestre();
    }

}