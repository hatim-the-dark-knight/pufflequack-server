package com.pufflequack.pufllequack.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String emailId;
    private String phoneNumber;
    private String password;
    private Boolean isActive = true;
    private Integer loginCount = 0;
}



// {
//     "id": 4676886,
//     "name": "hatim",
//     "emailId": "hatimtdk@gmail.com",
//     "phoneNumber": "8547724753",
//     "password": "ewgf4357hj863dgb",
//     "isActive": true,
//     "loginCount": 0
// }