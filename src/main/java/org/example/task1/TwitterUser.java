package org.example.task1;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TwitterUser {
    private String UserMail;
    private String Country;
    private LocalDateTime LastActiveTime;

}