package exercicios.lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = n -> n % 2 == 0;

        Predicate<Integer> isTresDigitos = n -> n >= 100 && n<= 999;

        System.out.println(isPar.test(123)); // false
        System.out.println(isPar.and(isTresDigitos).negate().test(123)); // true
        System.out.println(isPar.or(isTresDigitos).test(123)); // true
    }
}
