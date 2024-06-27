package com.example.web.vo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import java.util.Objects;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class GroupRoomDetailVo {
    private String roomName;
    private Integer roomOwnerId;
    private String enterCode;
}
