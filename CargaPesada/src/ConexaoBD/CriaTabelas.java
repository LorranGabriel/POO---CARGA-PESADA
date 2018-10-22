/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author 20171BSI0367
 */
public class CriaTabelas {
    public  void insertCategoria() {

        Connection c = null;
        Statement stmt = null;
        try {            
            c = Conexao.getInstance();
            System.out.println("Base de dados aberta");                        
            stmt = c.createStatement();
            String sql = "CREATE TABLE CLIENTE (\n" +
                            "  ID SERIAL,\n" +
                            "  NOME VARCHAR(45),\n" +
                            "  TIPO_CLIENTE CHAR(1),\n" +
                            "  CNPJ VARCHAR(18),\n" +
                            "  CPF VARCHAR(14),\n" +
                            "  DATA_CADASTRO DATE,\n" +
                            "  PRIMARY KEY (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE FUNCIONARIO (\n" +
                            "  ID SERIAL,\n" +
                            "  NOME VARCHAR(45),\n" +
                            "  CPF VARCHAR(14),\n" +
                            "  CARGO VARCHAR(30),\n" +
                            "  SALARIO FLOAT,\n" +
                            "  SEXO CHAR(1),\n" +
                            "  DATA_CADASTRO DATE,\n" +
                            "  DATA_NASCIMENTO DATE,\n" +
                            "  PRIMARY KEY (ID)\n" +
                            ");\n" +
                            "\n" +
                            "\n" +
                            "CREATE TABLE MOTORISTA (\n" +
                            "  ID SERIAL,\n" +
                            "  CNH VARCHAR(11),\n" +
                            "  DATA_VENCIMENTO DATE,\n" +
                            "  CATEGORIA_CNH VARCHAR(2),\n" +
                            "  ID_FUNCIONARIO INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_FUNCIONARIO)\n" +
                            "  REFERENCES FUNCIONARIO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "\n" +
                            "CREATE TABLE CONTATO (\n" +
                            "  ID SERIAL,\n" +
                            "  TELEFONE_01 VARCHAR(12),\n" +
                            "  TELEFONE_02 VARCHAR(12),\n" +
                            "  TELEFONE_03 VARCHAR(12),\n" +
                            "  EMAIL VARCHAR(45),\n" +
                            "  PRIMARY KEY (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE ENDERECO (\n" +
                            "  ID SERIAL,\n" +
                            "  ENDERECO VARCHAR(45),\n" +
                            "  LOGRADOURO VARCHAR(20),\n" +
                            "  NUMERO INT,\n" +
                            "  CEP VARCHAR(9),\n" +
                            "  COMPLEMENTO VARCHAR(20),\n" +
                            "  CIDADE VARCHAR(35),\n" +
                            "  ESTADO VARCHAR(20),\n" +
                            "  PRIMARY KEY (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE CATEGORIA (\n" +
                            "  ID INT NOT NULL,\n" +
                            "  NOME VARCHAR(45),\n" +
                            "  PRIMARY KEY (ID)\n" +
                            ");\n" +
                            "\n" +
                            "\n" +
                            "CREATE TABLE MODELO (\n" +
                            "  ID SERIAL,\n" +
                            "  MODELO VARCHAR(45),\n" +
                            "  MARCA VARCHAR(20),\n" +
                            "  ANO VARCHAR(4),\n" +
                            "  EIXO INT,\n" +
                            "  PESO FLOAT,\n" +
                            "  ALTURA FLOAT,\n" +
                            "  LARGURA FLOAT,\n" +
                            "  COMPRIMENTO FLOAT,\n" +
                            "  COR VARCHAR(20),\n" +
                            "  PRIMARY KEY (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE VEICULO (\n" +
                            "  ID SERIAL,\n" +
                            "  NOME VARCHAR(45),\n" +
                            "  CHASSI VARCHAR(45),\n" +
                            "  PLACA VARCHAR(7),\n" +
                            "  STATUS VARCHAR(20),\n" +
                            "  COMBUSTIVEL VARCHAR(15),\n" +
                            "  ID_CATEGORIA INT NOT NULL,\n" +
                            "  ID_MODELO INT NOT NULL,\n" +
                            "  ID_MOTORISTA INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_CATEGORIA)\n" +
                            "  REFERENCES CATEGORIA (ID),\n" +
                            "  FOREIGN KEY (ID_MODELO)\n" +
                            "  REFERENCES MODELO (ID),\n" +
                            "  FOREIGN KEY (ID_MOTORISTA)\n" +
                            "  REFERENCES MOTORISTA (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE SEGURO (\n" +
                            "  ID SERIAL,\n" +
                            "  STATUS VARCHAR(20),\n" +
                            "  DATA_VENCIMENTO DATE,\n" +
                            "  FIM_CONTRATO DATE,\n" +
                            "  ID_VEICULO INT NOT NULL,\n" +
                            "  VALOR FLOAT,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_VEICULO)\n" +
                            "  REFERENCES VEICULO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "\n" +
                            "CREATE TABLE FINANCIAMENTO (\n" +
                            "  ID SERIAL,\n" +
                            "  VALOR_PARCELA FLOAT,\n" +
                            "  PARCELAS_TOTAIS INT,\n" +
                            "  PARCELAS_PAGAS INT,\n" +
                            "  FINANCIADOR VARCHAR(45),\n" +
                            "  ID_VEICULO INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_VEICULO)\n" +
                            "  REFERENCES VEICULO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "\n" +
                            "CREATE TABLE ENDERECO_SERVICO (\n" +
                            "  ID SERIAL,\n" +
                            "  TIPO CHAR,\n" +
                            "  ID_ENDERECO INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_ENDERECO)\n" +
                            "  REFERENCES ENDERECO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE SERVICO (\n" +
                            "  ID SERIAL,\n" +
                            "  STATUS VARCHAR(15),\n" +
                            "  VALOR_CONTRATO FLOAT,\n" +
                            "  DATA_INICIO DATE,\n" +
                            "  DATA_FIM DATE,\n" +
                            "  ID_CLIENTE INT NOT NULL,\n" +
                            "  ID_FUNCIONARIO INT NOT NULL,\n" +
                            "  ID_VEICULO INT NOT NULL,\n" +
                            "  ID_ENDERECO_ORIGEM INT NOT NULL,\n" +
                            "  ID_ENDERECO_DESTINO INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_ENDERECO_ORIGEM)\n" +
                            "  REFERENCES ENDERECO_SERVICO (ID),\n" +
                            "  FOREIGN KEY (ID_ENDERECO_DESTINO)\n" +
                            "  REFERENCES ENDERECO_SERVICO (ID),\n" +
                            "  FOREIGN KEY (ID_CLIENTE)\n" +
                            "  REFERENCES CLIENTE (ID),\n" +
                            "  FOREIGN KEY (ID_FUNCIONARIO)\n" +
                            "  REFERENCES FUNCIONARIO (ID),\n" +
                            "  FOREIGN KEY (ID_VEICULO)\n" +
                            "  REFERENCES VEICULO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE ENDERECO_CLIENTE (\n" +
                            "  ID SERIAL,\n" +
                            "  ID_CLIENTE INT NOT NULL,\n" +
                            "  ID_ENDERECO INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_CLIENTE)\n" +
                            "  REFERENCES CLIENTE (ID),\n" +
                            "  FOREIGN KEY (ID_ENDERECO)\n" +
                            "  REFERENCES ENDERECO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE ENDERECO_FUNCIONARIO (\n" +
                            "  ID SERIAL,\n" +
                            "  ID_FUNCIONARIO INT NOT NULL,\n" +
                            "  ID_ENDERECO INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_FUNCIONARIO)\n" +
                            "  REFERENCES FUNCIONARIO (ID),\n" +
                            "  FOREIGN KEY (ID_ENDERECO)\n" +
                            "  REFERENCES ENDERECO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE CONTATO_FUNCIONARIO (\n" +
                            "  ID SERIAL,\n" +
                            "  ID_CONTATO INT NOT NULL,\n" +
                            "  ID_FUNCIONARIO INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_CONTATO)\n" +
                            "  REFERENCES CONTATO (ID),\n" +
                            "  FOREIGN KEY (ID_FUNCIONARIO)\n" +
                            "  REFERENCES FUNCIONARIO (ID)\n" +
                            ");\n" +
                            "\n" +
                            "CREATE TABLE CONTATO_CLIENTE (\n" +
                            "  ID SERIAL,\n" +
                            "  ID_CONTATO INT NOT NULL,\n" +
                            "  ID_CLIENTE INT NOT NULL,\n" +
                            "  PRIMARY KEY (ID),\n" +
                            "  FOREIGN KEY (ID_CONTATO)\n" +
                            "  REFERENCES CONTATO (ID),\n" +
                            "  FOREIGN KEY (ID_CLIENTE)\n" +
                            "  REFERENCES CLIENTE (ID)\n" +
                            ");";                        
            stmt.executeUpdate(sql);
            stmt.close();
            //c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            
        }
        System.out.println("Records created successfully");
    }
    
}
