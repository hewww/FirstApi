package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.attachment.AttachmentMarshaller;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Badges {
    private int votes;
    AttachmentsByType attachments;
}
