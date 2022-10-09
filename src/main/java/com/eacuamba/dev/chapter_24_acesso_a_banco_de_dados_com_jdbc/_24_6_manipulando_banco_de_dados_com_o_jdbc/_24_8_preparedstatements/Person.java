package com.eacuamba.dev.chapter_24_acesso_a_banco_de_dados_com_jdbc._24_6_manipulando_banco_de_dados_com_o_jdbc._24_8_preparedstatements;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
