package com.li.generalmapper.Model;

import javax.persistence.Id;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

//@Setter
//@Getter
//@ToString
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    @Id
    String type;

    String sex;

    String pettishVoices;
}
