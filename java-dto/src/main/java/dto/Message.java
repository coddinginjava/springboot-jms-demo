package dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Message implements  Serializable{

    private static final long serialVersionUID = -2180757568192349416L;

    private String msg;
    private Integer id;
    private String exception;
}
