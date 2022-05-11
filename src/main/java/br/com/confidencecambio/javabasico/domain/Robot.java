package br.com.confidencecambio.javabasico.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "robo")
public class Robot implements Serializable {
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

    public Robot() {}

    public Robot(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public static void main(String[] args) {
        Robot robot = new Robot("João", "Soares Silva");

        String name = robot.firstName + " " + robot.lastName;

        System.out.println(name);
        System.out.println(robot.firstName);
        System.out.println(robot.lastName);
        System.out.println(name.toUpperCase());


        String[] names = robot.lastName.split(" ");
        System.out.println(robot.firstName + " " + names[0].charAt(0) + "." + robot.lastName.substring(6));


    }
}
