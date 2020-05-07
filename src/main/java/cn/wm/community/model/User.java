package cn.wm.community.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private Long id;

    private String accountId;

    private String name;

    private String token;

    private Long gmtCreate;

    private Long gmtModified;

    private String bio;

    private String avatarUrl;

}
