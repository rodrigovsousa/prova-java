package br.com.confidencecambio.javabasico.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "client")
public class Client implements Serializable {

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

    public Client() {}

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public static void main(String[] args) {
        Client client = new Client("João", "Soares Silva");

        String name = client.firstName + " " + client.lastName;

        System.out.println(name);
        System.out.println(client.firstName);
        System.out.println(client.lastName);
        System.out.println(name.toUpperCase());


//        Melhor prática é utilizar um método static para realizar essa conversão
//        Abbreviate abbreviate = new Abbreviate();
//        System.out.println(abbreviate(name));

        String[] names = client.lastName.split(" ");
        System.out.println(client.firstName + " " + names[0].charAt(0) + "." + client.lastName.substring(6));


    }
}
