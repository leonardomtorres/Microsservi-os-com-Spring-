package br.com.fiap.EficienciaEnergetica.model;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.sql.Clob;
import java.time.LocalDate;

@EqualsAndHashCode
@Entity
@Table(name = "tbl_relatorios")
public class RelatoriosModel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_DB_RELATORIOS"
    )
    @SequenceGenerator(
            name = "SEQ_DB_RELATORIOS",
            sequenceName = "SEQ_DB_RELATORIOS",
            allocationSize = 1
    )

    @Column(name = "id_relatorio")
    private Long idRelatorio;

    @Column(name = "data_relatorio")
    private LocalDate DtRelatorio;

    @Column(name = "tipo_relatorio")
    private String TipoRelatorio;
    //@Column()
    //private Clob ConteudoRelatorio;
}
