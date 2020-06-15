package junior.henrique.ExercicioTrimestre.View;

import junior.henrique.ExercicioTrimestre.Model.Mes;

import java.util.Scanner;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 13:00
 * @category View
 */
public class Principal {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        Mes mes = new Mes();

        System.out.println("Digite seu mês de nascimento");
        mes.setMes(scanner.next());
        System.out.println(mes);

    }
}
