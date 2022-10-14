package com.mycompany.exemplo.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {

    public static void main(String[] args) {

        Database database = new Database();

        JdbcTemplate connection = database.getConnection();
        /*
        connection.execute(
                "CREATE TABLE filme ("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(255) NOT NULL,"
                + "ano_lancamento int NOT NULL"
                + ");"
        );
        */
        
        connection.update("INSERT INTO filme VALUES (?, ?, ?)",
            null, "Avatar", 1998
            );
              
        List<Filme> resultado = connection.query("SELECT * FROM filme", 
                new BeanPropertyRowMapper(Filme.class)
                );
        
        for (Filme filme : resultado) {
            System.out.println("Id: " + filme.getId() +" Nome: "+ filme.getNome() + "\n");
        }
        
        //System.out.println(connection.queryForList("SELECT * FROM filme"));
    }
}
