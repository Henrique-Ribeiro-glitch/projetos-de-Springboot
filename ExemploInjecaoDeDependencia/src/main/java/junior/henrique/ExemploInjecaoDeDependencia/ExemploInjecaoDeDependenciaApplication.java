package junior.henrique.ExemploInjecaoDeDependencia;

import junior.henrique.ExemploInjecaoDeDependencia.model.Cat;
import junior.henrique.ExemploInjecaoDeDependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 11:20
 */
@SpringBootApplication
public class ExemploInjecaoDeDependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploInjecaoDeDependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

	}

}
