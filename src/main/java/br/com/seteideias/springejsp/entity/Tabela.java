package br.com.seteideias.springejsp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tabela")
public class Tabela implements Serializable {

    @Serial
    private static final long serialVersionUID = 2806421523585360625L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String descricao;

}
