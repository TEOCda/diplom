package com.cloud.back.mapper;

import com.cloud.back.entity.File;
import com.cloud.back.dto.FileDto;
import org.springframework.stereotype.Component;

@Component
public class MapFile {
    public FileDto mapFileToFileDto(File file) {
        return new FileDto(file.getFileName(), file.getSize());
    }

}
