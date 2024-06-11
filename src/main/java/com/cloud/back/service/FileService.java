package com.cloud.back.service;

import com.cloud.back.dto.FileDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface FileService {

    HttpStatus uploadFile(String filename,
                          MultipartFile file) throws IOException;

    HttpStatus editFileByName(String currentFileName, String newFileName);

    byte [] getFileByName(String fileName);

    HttpStatus deleteFile(String fileName);

    List<FileDto>showSavedFile(int limit);
}
