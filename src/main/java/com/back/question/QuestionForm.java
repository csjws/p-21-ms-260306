package com.back.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {

    @Size(max=200)
    @NotEmpty(message="제목은 필수항목입니다.")
    private String subject;

    @NotEmpty(message="내용은 필수항목입니다.")
    private String content;
}

