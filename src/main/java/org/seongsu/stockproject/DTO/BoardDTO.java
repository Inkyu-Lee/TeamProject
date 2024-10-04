package org.seongsu.stockproject.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {

    private Long id;
    private String title;
    private String description;
    private String nickname;

}
