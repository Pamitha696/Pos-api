package com.online.pos.posapi.entity.share;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileResource {
    private String directory;
    private String hash;
    private String resource_url;
    private String file_name;
}
