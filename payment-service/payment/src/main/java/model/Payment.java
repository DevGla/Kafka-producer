package model;

import java.io.Serializable;
import lombok.Getter;

@Getter
public class Payment implements Serializable {
    private Long id;
    private Long userId;
    private Long productId;
    private String creditCardNumber;
}
