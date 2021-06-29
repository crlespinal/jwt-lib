package com.bankunited.jwtlib.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jwt {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;

    String jti;

    Date createdDate;
}
