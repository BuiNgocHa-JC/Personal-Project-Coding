package persional.coding.dao.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@FieldNameConstants
public class User extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "email")
    private String email;

    @Column(name = "group_id")
    private Long groupId;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

}
