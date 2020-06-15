package junior.henrique.ExemploInjecaoDeDependencia;

import junior.henrique.ExemploInjecaoDeDependencia.Interfaces.AnimalsInterface;
import junior.henrique.ExemploInjecaoDeDependencia.model.Cat;
import junior.henrique.ExemploInjecaoDeDependencia.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 11:30
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("dog")
    private AnimalsInterface animalsInterface;

    public void execute() {
        animalsInterface.comunicar();
    }

}
