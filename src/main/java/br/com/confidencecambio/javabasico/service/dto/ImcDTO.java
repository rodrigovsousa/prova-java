package br.com.confidencecambio.javabasico.service.dto;

import java.io.Serializable;
import java.util.Objects;

public class ImcDTO implements Serializable {

    private Long id;

    private Long weight;

    private Long height;


    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Long getWeight() {return weight;}

    public void setWeight(Long weight) {this.weight = weight;}

    public Long getHeight() {return height;}

    public void setHeight(Long height) {this.height = height;}


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImcDTO imcDTO = (ImcDTO) o;
        if (imcDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), imcDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ImcDTO{" +
                "id=" + id +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
