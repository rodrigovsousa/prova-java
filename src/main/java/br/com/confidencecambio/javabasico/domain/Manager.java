package br.com.confidencecambio.javabasico.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "manager")
public class Manager implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotBlank
    @Size(max = 50)
    @Column(name = "first_name", length = 50)
    private String firstName;

    @NotBlank
    @Size(max = 50)
    @Column(name = "last_name", length = 50)
    private String lastName;


    //Getters e Setters

    public Manager() {}

    public Manager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public static void main(String[] args) {
        Manager manager = new Manager("João", "Soares Silva");

        String name = manager.firstName + " " + manager.lastName;

        System.out.println(name);
        System.out.println(manager.firstName);
        System.out.println(manager.lastName);
        System.out.println(name.toUpperCase());


        String[] names = manager.lastName.split(" ");
        System.out.println(manager.firstName + " " + names[0].charAt(0) + "." + manager.lastName.substring(6));


    }
}