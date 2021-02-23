package Optional;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor opcional");
        System.out.println("Valor está presente? "+optionalString.isPresent());

        System.out.println("\nAtravés de ifPresent");
        optionalString.ifPresent(System.out::println);

        System.out.println("\nAtravés de lambda ifPresentOrElse");
        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor não está presente"));

        System.out.println("\nAtravés de if");
        if (optionalString.isPresent()){
            String valor = optionalString.get();
            System.out.println(valor);
        }

        System.out.println("\nAtravés de map para poder modificar o valor, nesse caso acrescentar ****");
        optionalString.map((valor)-> valor.concat("****")).ifPresent(System.out::println);


        optionalString.orElseThrow(IllegalStateException::new);

    }
}
