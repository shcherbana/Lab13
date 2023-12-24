package org.example.task1;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
class FacebookUser{
    private String UserMail;
    private String Country;
    private LocalDateTime LastActiveTime;
}
