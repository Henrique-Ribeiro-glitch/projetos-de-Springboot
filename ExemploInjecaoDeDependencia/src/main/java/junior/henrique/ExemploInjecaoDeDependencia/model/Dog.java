package junior.henrique.ExemploInjecaoDeDependencia.model;

import junior.henrique.ExemploInjecaoDeDependencia.Interfaces.AnimalsInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 10:55
 * @category Model
 */
@Component
@Qualifier("dog")
public class Dog implements AnimalsInterface {

    @Override
    public void comunicar() {
        System.out.println("Au au");
    }

}
