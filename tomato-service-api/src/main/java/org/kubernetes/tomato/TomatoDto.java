package org.kubernetes.tomato;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TomatoDto {
    private long id;
    private String name;
    private int weight;
    private boolean isAngry;
}
