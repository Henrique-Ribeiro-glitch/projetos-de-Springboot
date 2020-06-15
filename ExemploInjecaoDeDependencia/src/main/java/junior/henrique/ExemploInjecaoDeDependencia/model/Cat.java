package junior.henrique.ExemploInjecaoDeDependencia.model;

import junior.henrique.ExemploInjecaoDeDependencia.Interfaces.AnimalsInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 10:40
 * @category Model
 */
@Component
@Primary
@Qualifier("cat")
public class Cat implements AnimalsInterface {

    @Override
    public void comunicar() {
        System.out.println("Miaaau");
    }

}
