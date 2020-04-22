package com.glamasw.petitamirestapi.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contact_medium")
public class ContactMedium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NotBlank(message = "El tipo de ContactMedium no puede estar vacío")
    @Column(name = "type")
    private String type;
    @NotBlank(message = "El valor de ContactMedium no puede estar vacío")
    @Column(name = "value")
    private String value;
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "fk_owner")
    private Owner owner;

    public ContactMedium() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}