package com.example.usermodel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)                         //her yeni kayıt eklendiğinde otomatik id oluşturmaya yarıyor
    private Long id;
    @NotBlank(message = "User name can not be null.")
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNo;
    private Date birthday;
}
