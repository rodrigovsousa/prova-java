package br.com.confidencecambio.javabasico.domain;


import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

public class Imc implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    @NotNull
    private Long weight;

    @NotNull
    private Long height;


    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public Long getWeight() {return weight;}

    public void setWeight(Long weight) {this.weight = weight;}

    public Long getHeight() {return height;}

    public void setHeight(Long height) {this.height = height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imc imc = (Imc) o;
        return id == imc.id && weight.equals(imc.weight) && height.equals(imc.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight, height);
    }

    @Override
    public String toString() {
        return "Imc{" +
                "id=" + id +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
