package belajarspringdasar.belajar_spring_dasar.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicA {
    private CyclicB cyclicB;
}
