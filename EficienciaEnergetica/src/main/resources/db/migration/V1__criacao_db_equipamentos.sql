CREATE SEQUENCE SEQ_DB_EQUIPAMENTOS
  START WITH 1
  INCREMENT BY 1
  NOCACHE
  NOCYCLE;

CREATE TABLE TBL_EQUIPAMENTOS (
  id_equipamento integer DEFAULT SEQ_DB_EQUIPAMENTOS.nextval not null,
  nome_equipamento VARCHAR2(20) not null,
  tipo_equipamento VARCHAR2(20) not null,
  potencia_equipamento NUMBER(10) not null,
  fabricante_equipamento VARCHAR2(20),
  modelo_equipamento VARCHAR2(20),
  status_equipamento VARCHAR2(20) DEFAULT 'Inativo',
  validade_equipamento date not null
);