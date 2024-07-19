package org.kubernetes.tomato;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Table
@Data
@Accessors(chain = true)
public class Tomato {

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private int weight;

    @Column
    private boolean isAngry;

}
