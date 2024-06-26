package net.javaguides.Bankingapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;
    @Column(name = "accountHolderName")
    private String accountHolderName;
    private double balance;

}
