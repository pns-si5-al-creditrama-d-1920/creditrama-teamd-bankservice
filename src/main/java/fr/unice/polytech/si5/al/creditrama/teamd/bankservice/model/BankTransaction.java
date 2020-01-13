package fr.unice.polytech.si5.al.creditrama.teamd.bankservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BankTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bankTransactionId;
    private String ibanSource;
    private String ibanDestination;
    private Double amount;
}
