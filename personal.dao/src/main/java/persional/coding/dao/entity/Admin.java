package persional.coding.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "admin")
@Setter
@Getter
@FieldNameConstants
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends BaseEntity {
    @Column(name = "email")
    private String email;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AdminStatus adminStatus;

    @Column(name = "last_login_time")
    private LocalDateTime lastLoginTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private AdminRole role;

    @Column(name = "password_token")
    private String passwordToken;

}
