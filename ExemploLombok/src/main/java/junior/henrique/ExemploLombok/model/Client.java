package junior.henrique.ExemploLombok.model;

import lombok.*;

/**
 * @author Henrique Júnior
 * @version 1.0
 * @since 14/06/2020 09:35
 * @category Model
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String LastName;

    @Getter @Setter
    private int age;

    /**
     * @return tranform age in mounths
     */
    public int calculateAgeInMounths() {
        return this.age * 12;
    }

}
