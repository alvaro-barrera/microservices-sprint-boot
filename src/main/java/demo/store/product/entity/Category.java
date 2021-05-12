package demo.store.product.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
