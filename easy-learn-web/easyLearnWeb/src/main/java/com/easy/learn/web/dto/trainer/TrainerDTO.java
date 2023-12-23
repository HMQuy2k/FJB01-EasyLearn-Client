package com.easy.learn.web.dto.trainer;

import com.easy.learn.web.dto.ReponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerDTO extends ReponseDTO<Trainer> {
    private Long id;
    private String uuid;
    private String email;
    private String phone;
}
